package id.ac.polbeng.puteri.test_kelas
//destructing declarations untuk mendestruksi data kelas sebuah objek kedalam sejumlah variabel

fun main() {
    val puteri = Student("Puteri", 21)

    //Destructuring Declaration
    val(name, age) = puteri
    println("Name = $name")
    println("Age = $age")
}