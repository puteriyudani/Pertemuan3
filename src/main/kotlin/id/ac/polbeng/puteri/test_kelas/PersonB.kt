package id.ac.polbeng.puteri.test_kelas

//meringkas kode program
class PersonB (_firstName: String, _lastName: String, _age: Int) {
    //menggabungkan proses deklarasi dan menginisialisasi sebuah variabel pada blok inisialisasi kedalam satu statement
    var firstName:String = _firstName
    var lastName:String = _lastName
    var age: Int = _age
}

//cara yang lebih ringkas
class PersonC (var firstName: String, var lastName: String, var age: Int) {}

fun main(){
    //PersonB
    val puteri = PersonB("Puteri", "Yudani", 21)
    println("Name : ${puteri.firstName} ${puteri.lastName}")
    println("Age : ${puteri.age}")

    println()

    //PersonC
    val yudani = PersonC("Yudani", "Puteri", 21)
    println("Name : ${yudani.firstName} ${yudani.lastName}")
    println("Age : ${yudani.age}")
}