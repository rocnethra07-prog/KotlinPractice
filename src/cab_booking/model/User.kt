package cab_booking.model

import cab_booking.util.IdGenerator
import cab_booking.util.Validator

open class User(
    name: String,
    phone: String,
    email: String,
    val userRole: UserRole
) {

    val userId: String = IdGenerator.generateUserId()

    var name: String = name.trim()
        set(value) {
            Validator.isValidName(value)
            field = value.trim()
        }

    var phone: String = phone.trim()
        set(value) {
            Validator.isValidPhone(value)
            field = value.trim()
        }

    val email: String = email.trim().lowercase()

    init {
        Validator.isValidName(name)
        Validator.isValidPhone(phone)
        Validator.isValidEmail(email)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is User) return false

        return email == other.email
    }

    override fun hashCode(): Int = email.hashCode()

    override fun toString(): String {
        return """
            User ID          : $userId
            Name             : $name
            Phone            : $phone
            Email            : $email
            Role             : $userRole
        """.trimIndent()
    }
}