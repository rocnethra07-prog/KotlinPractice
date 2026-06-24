package basics.practice.bank

import java.math.BigDecimal

class EducationLoan(nameOfApplicant: String, requestedAmt : BigDecimal,interest: BigDecimal =  BigDecimal("6.5")) : Loan(nameOfApplicant, requestedAmt, interest) , CreditCheck {
    override fun verify() : Boolean{
        return doCreditCheck()
    }

    override fun doCreditCheck(): Boolean {
        val creditScore = InputUtil.getCreditScore("Enter credit score: ")
        return creditScore >= 650
    }
}