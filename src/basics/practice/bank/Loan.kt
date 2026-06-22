package basics.practice.bank

import java.math.BigDecimal

abstract class Loan(val nameOfApplicant: String, val idOfApplicant: String, val requestedAmt : BigDecimal,val interest: BigDecimal) {
    var status: LoanStatus = LoanStatus.REQUESTED
        public set(status : LoanStatus){
            if(field == status){
                return
            }
            if(status == LoanStatus.REQUESTED){
                throw LoanApplicationException("")
            }

            if(status == LoanStatus.APPROVED && field != LoanStatus.ON_VERIFICATION){
                throw LoanApplicationException("")
            }
            field = status
        }

    abstract fun verify() : Boolean
}