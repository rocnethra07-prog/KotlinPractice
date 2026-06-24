package basics.practice.bank

import java.math.BigDecimal

fun main(){
    println("--------- LOAN APPLICATION ---------")

    val name = InputUtil.getApplicantName("Name of the applicant: ")
    val requiredAmount = InputUtil.getAmountInBigDecimal("Enter required amount: ")
    var loan : Loan = getLoanChoice(name, requiredAmount)

    println()
    println("Loan application created successfully.")
    println("Applicant Name   : ${loan.nameOfApplicant}")
    println("Requested Amount : ${loan.requestedAmt}")
    println("Interest         : ${loan.interest}%")
    println("Current Status   : ${loan.status}")

    try {
        startVerification(loan)
        println()
        println("Loan moved to verification.")
        println("Current Status   : ${loan.status}")

        val isApproved = loan.verify()

        if (isApproved) {
            loan.status = LoanStatus.APPROVED
            println("Loan approved successfully.")
            println("Final Status     : ${loan.status}")
        }
        else {
            println("Loan verification failed.")
            println("Final Status     : ${loan.status}")
        }

    }
    catch (e: LoanApplicationException) {
        println("Loan processing error: ${e.message}")
    }

}

fun getLoanChoice(name: String, requiredAmount: BigDecimal) : Loan{
    while(true){
        println("What type of loan are you applying for? ")
        println("1 PERSONAL LOAN")
        println("2 HOME LOAN")
        println("3 EDUCATION LOAN")
        print("Choose loan type: ")

        val loanChoice = readln().trim()

        when(loanChoice){
            "1" -> return PersonalLoan(nameOfApplicant = name, requestedAmt = requiredAmount)
            "2" -> return HomeLoan(nameOfApplicant = name, requestedAmt = requiredAmount)
            "3" -> return EducationLoan(nameOfApplicant = name, requestedAmt = requiredAmount)
            else -> print("Invalid choice. Try again")
        }
    }
}

fun startVerification(loan: Loan){
    loan.status = LoanStatus.ON_VERIFICATION
}