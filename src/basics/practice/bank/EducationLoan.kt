package basics.practice.bank

import java.math.BigDecimal

class EducationLoan(nameOfApplicant: String, idOfApplicant: String, requestedAmt : BigDecimal,interest: BigDecimal) : Loan(nameOfApplicant,idOfApplicant, requestedAmt, interest) , CreditCheck {
    override fun verify() : Boolean{
        return doCreditCheck()
    }

    override fun doCreditCheck(): Boolean {

    }
}