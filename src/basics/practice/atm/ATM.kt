package basics.practice.atm

//single user demo
fun main(){

    val user1 = User("Nethra", "9090121291", "nethra@zohocorp.com")

    val bankAcc1 = BankAccount(user1, 200f);

    var flag = true
    do{
        showATMMenu()
        val option = readln().toIntOrNull() ?: continue

        when(option){
            1 -> checkBalance(bankAcc1)
            2 -> deposit(bankAcc1)
            3 -> withdraw(bankAcc1)
            0 -> flag = false
            else -> println("Invalid option")
        }

    }while (flag)

}

private fun showATMMenu(){
    println("1. Check Balance")
    println("2. Deposit" )
    println("3. Withdraw")
    println("0. Exit")
}

private fun checkBalance(bankAccount : BankAccount){
    println("\nYour Account Balance is  =  $${bankAccount.getBalance()}")
}

private fun deposit(bankAccount: BankAccount){
    val prompt = "Enter amount to be deposited : "
    val amount =prompt.readFloat()

    bankAccount.deposit(amount)
    println("Amount deposited = $${amount}")
}

private fun withdraw(bankAccount: BankAccount){
    val prompt = "Enter amount to be withdrawn : "
    val amount = prompt.readFloat()

    bankAccount.withdraw(amount)
    println("Amount withdrew = $${amount}")
}

//Extensive function demo:
private fun String.readFloat(): Float{
    while(true){
        println(this)
        val inputAsFloat = readln().toFloatOrNull() ?: continue;
        return inputAsFloat
    }
}