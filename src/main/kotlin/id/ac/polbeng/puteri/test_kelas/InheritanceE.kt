package id.ac.polbeng.puteri.test_kelas

//parent class
open class NewPerson {
    open var age: Int = 1
}

//child class
class CheckedPerson: NewPerson() {
    override var age: Int = 1
        set(value) {
            //value tidak boleh lebih kecil dari 0 atau value tidak boleh negatif
            field = if(value > 0) value else throw IllegalArgumentException("Age can not be negative")
        }
}

fun main() {
    val person = NewPerson()
    person.age = -5 //berhasil
    val checkedPerson = CheckedPerson()
    checkedPerson.age = -5 //Throws IllegalArgumentException : Age can not be negative
}