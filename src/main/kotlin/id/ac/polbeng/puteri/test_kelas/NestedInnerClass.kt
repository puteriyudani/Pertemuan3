package id.ac.polbeng.puteri.test_kelas
//nested class adalah ketika sebuah kelas dideklarasikan didalam kelas lain
//contoh mengakses anggota kelas dari nested class
class Outer {
    val a = "Outside Nested class."
    class Nested { //kelas Nested di deklarasikan didalam kelas Outer
        val b = "Inside Nested class."
        fun callMe() = "Function call from inside Nested class."
    }
}

//jalankan program
fun main(args: Array<String>) {
    //mengakses anggota Nested Class
    println(Outer.Nested().b)

    //membuat objek Nested Class
    val nested = Outer.Nested()
    println(nested.callMe())
}