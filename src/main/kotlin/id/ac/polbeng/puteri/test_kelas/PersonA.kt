package id.ac.polbeng.puteri.test_kelas

class PersonA (_firstName: String, _lastName: String, _age: Int) {
    //deklarasi variabel
    var firstName:String
    var lastName:String
    var age: Int

    //blok inisialisasi
    init {
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}

fun main(){
    //memberikan nilai pada variabel
    val puteri = PersonA("Puteri", "Yudani", 21)
    //tampilkan program
    println("Name : ${puteri.firstName} ${puteri.lastName}")
    println("Age : ${puteri.age}")
}