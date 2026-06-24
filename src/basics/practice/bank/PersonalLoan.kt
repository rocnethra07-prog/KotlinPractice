package basics.practice.bank

import java.math.BigDecimal

class PersonalLoan (nameOfApplicant: String, requestedAmt: BigDecimal, interest: BigDecimal = BigDecimal("12.5")) : Loan(nameOfApplicant, requestedAmt, interest) , IncomeCheck{
    override fun doIncomeCheck() : Boolean{
        val income = InputUtil.getAmountInBigDecimal("Enter monthly income: ")
        return income >= BigDecimal("50000")
    }

    override fun verify() : Boolean{
        return doIncomeCheck()
    }
}