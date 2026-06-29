package cab_booking.util

object IdGenerator{
    private var userId = 1

    fun generateUserId() : String{
        return "USR-" + userId++
    }
}