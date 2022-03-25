package id.ac.polbeng.puteri.test_kelas
//constructor tambahan bisa didefinisikan lebih dari satu

class PersonE {
    var firstName: String
    var lastName: String
    var age: Int = 25

    //constructor tambahan pertama
    constructor(_firstName: String, _lastName: String){
        firstName = _firstName
        lastName = _lastName
    }

    //constructor tambahan kedua
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName){
        age = _age
    }

    //fungsi untuk menampilkan program
    fun cetakInfo(){
        println("Name : ${firstName} ${lastName}")
        println("Age : ${age}")
    }
}
fun main(){
    val faisal = PersonE("Faisal", "Yanto")
    faisal.cetakInfo()
    println()
    val puteri = PersonE("Puteri", "Yudani", 21)
    puteri.cetakInfo()
}