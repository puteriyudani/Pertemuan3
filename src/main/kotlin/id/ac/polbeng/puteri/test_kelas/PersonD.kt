package id.ac.polbeng.puteri.test_kelas
//secondary constructor
//contoh constructor tambahan yang tidak memiliki constructor utama
class PersonD {
    var firstName: String
    var lastName: String
    var age: Int

    //constructor tambahan didefinisikan didalam tubuh kelas
    //menggunakan keyword constructor
    constructor(_firstName: String, _lastName: String, _age: Int){
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}
fun main(){
    //memasukkan nilai kedalam variabel
    val puteri = PersonD("Puteri", "Yudani", 21)
    //tampilkan program
    println("Name : ${puteri.firstName} ${puteri.lastName}")
    println("Age : ${puteri.age}")
}