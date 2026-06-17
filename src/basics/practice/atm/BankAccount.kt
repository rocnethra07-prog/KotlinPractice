package basics.practice.atm

class BankAccount(private val user: User,private var accountBalance: Float){
    fun deposit(amount: Float){
        if(amount <=0 ){
            throw Exception("The amount cannot be negative or zero")
        }
        accountBalance += amount
    }

    fun withdraw(amount: Float){
        if(amount > accountBalance){
            throw Exception("Insufficient Balance")
        }
        accountBalance -= amount;
    }

    fun getBalance() : Float{
        return accountBalance
    }

//    fun changeName(name: String){
//        accountHolder = name
//    } - cannot be done

}