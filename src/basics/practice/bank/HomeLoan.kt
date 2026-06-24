package basics.practice.bank

import java.math.BigDecimal

class HomeLoan(nameOfApplicant: String, requestedAmt : BigDecimal,interest: BigDecimal = BigDecimal("8.0")) : Loan(nameOfApplicant, requestedAmt, interest) , IncomeCheck, CreditCheck {

    override fun doIncomeCheck(): Boolean {
        val income = InputUtil.getAmountInBigDecimal("Enter monthly income: ")
        return income >= BigDecimal("75000")
    }

    override fun doCreditCheck(): Boolean {
        val creditScore = InputUtil.getCreditScore("Enter credit score: ")
        return creditScore >= 700
    }

    override fun verify() : Boolean{
        return doCreditCheck() && doIncomeCheck()
    }
}