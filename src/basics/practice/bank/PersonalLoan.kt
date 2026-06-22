package basics.practice.bank

import java.math.BigDecimal

class PersonalLoan (nameOfApplicant: String, idOfApplicant: String, requestedAmt : BigDecimal,interest: BigDecimal) : Loan(nameOfApplicant,idOfApplicant, requestedAmt, interest) , IncomeCheck{
    override fun doIncomeCheck() : Boolean{

    }

    override fun verify() : Boolean{
        return doIncomeCheck()
    }
}