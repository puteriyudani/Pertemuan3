package id.ac.polbeng.puteri.test_kelas
//data class sama seperti kelas biasa namun memiliki tambahan fungsionalitas

data class Student(val name: String, val age: Int) //parameter didalam konstruktor utama

fun main() {
    //inisiasi nilai variabel berdasarkan parameter
    val boni = Student("Boni", 21)
    val meri = Student("Meri", 20)

    //tampilkan program
    println("Student Name is: ${boni.name}")
    println("Student Age is: ${boni.age}")
    println("Student Name is: ${meri.name}")
    println("Student Age is: ${meri.age}")
}