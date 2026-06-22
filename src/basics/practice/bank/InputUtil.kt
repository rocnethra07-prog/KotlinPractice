package basics.practice.bank


class InputUtil {
    companion object {
        fun getBigDecimal(prompt: String){
            while(true) {
                print(prompt)
                var input = readln().toBigDecimalOrNull() ?: continue

            }

        }
    }
}