package basics.practice.bank

import java.math.BigDecimal

class InputUtil {
    companion object {

        fun getAmountInBigDecimal(prompt: String) : BigDecimal{
            while(true) {
                val amount = getBigDecimal(prompt)
                if (amount.scale() > 2) {
                    println("Maximum 2 digits allowed after decimal point.")
                    continue
                }
                return amount
            }
        }

        fun getBigDecimal(prompt: String): BigDecimal{
            while(true) {
                print(prompt)
                val input = readln().trim()
                val amount = input.toBigDecimalOrNull()
                if (amount == null) {
                    println("Invalid decimal number. Try again.")
                    continue
                }

                if (amount <= BigDecimal.ZERO) {
                    println("Amount must be greater than 0.")
                    continue
                }
                return amount
            }
        }

        fun getApplicantName(prompt: String): String {
            while (true) {
                print(prompt)
                val name = readln().trim()
                if (name.isBlank()) {
                    println("Name cannot be blank. Enter a valid name.")
                    continue
                }
                return name
            }
        }

        fun getCreditScore(prompt: String) : Int{
            while (true){
                print(prompt)
                val input = readln().trim()
                val score = input.toIntOrNull()
                if (score == null) {
                    println("Invalid integer number. Try again.")
                    continue
                }
                return score
            }
        }
    }
}