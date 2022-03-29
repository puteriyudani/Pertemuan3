package id.ac.polbeng.puteri.test_kelas
//fungsi componentN() mengembalikan nilai property pada sebuah objek
fun main() {
    val puteri = Student("Puteri", 21)

    //Destructuring Declaration menggunakan componentN() method
    val name = puteri.component1() //mengembalikan nilai property pertama (name) pada objek puteri
    val age = puteri.component2() //mengembalikan nilai property kedua (age) pada objek puteri
    println("Name = $name")
    println("Age = $age")
}