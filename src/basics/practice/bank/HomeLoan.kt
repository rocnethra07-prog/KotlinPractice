package basics.practice.bank

import java.math.BigDecimal

class HomeLoan(nameOfApplicant: String, idOfApplicant: String, requestedAmt : BigDecimal,interest: BigDecimal) : Loan(nameOfApplicant,idOfApplicant, requestedAmt, interest) , IncomeCheck, CreditCheck {

    override fun doIncomeCheck() : Boolean{

    }

    override fun verify() : Boolean{
        return doCreditCheck() && doIncomeCheck()
    }

    override fun doCreditCheck(): Boolean {

    }

}