package basics.practice.bank

import java.math.BigDecimal

fun main(){
    println("--------- LOAN APPLICATION ---------")


    var name: String
    while (true){
        print("Name of the applicant : ")
        name = readln()
        if(name.isBlank()){
            println("Name cannot be blank. Enter a valid name")
            continue
        }
        break
    }

    var requiredAmount: BigDecimal = InputUtil.getBigDecimal("")



    var loanChoice: String
    while(true){
        println("What type of loan are you applying for? ")
        println("1 PERSONAL LOAN")
        println("2 HOME LOAN")
        println("3 EDUCATION LOAN")
        print("Choose loan type: ")

        loanChoice = readln().trim()

        when(loanChoice){

        }

    }



}