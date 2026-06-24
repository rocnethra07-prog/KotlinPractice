package basics.practice.bank

import java.math.BigDecimal

abstract class Loan(val nameOfApplicant: String, val requestedAmt : BigDecimal,val interest: BigDecimal) {
    var status: LoanStatus = LoanStatus.REQUESTED
        public set(status: LoanStatus){
            if(field == status){
                return
            }

            when{
                status == LoanStatus.REQUESTED -> throw LoanApplicationException("Cannot move back to REQUESTED")
                status == LoanStatus.APPROVED && field != LoanStatus.ON_VERIFICATION -> throw LoanApplicationException("Loan must be ON_VERIFICATION before APPROVED")
                else -> field = status
            }
        }

    abstract fun verify() : Boolean
}