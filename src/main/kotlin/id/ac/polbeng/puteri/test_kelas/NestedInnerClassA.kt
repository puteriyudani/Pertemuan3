package id.ac.polbeng.puteri.test_kelas
//inner class adalah nested class yang memiliki kata kunci inner dalam pendeklarasiannya
//contoh inner class
class OuterA {
    val a = "Outside Nested class."
    inner class Inner { //class Inner didalam class Outer
        fun callMe() = a
    }
}

//jalankan program
fun main() {
    val outer = OuterA()
    println("Using outer object: ${outer.Inner().callMe()}")
    val inner = OuterA().Inner()
    println("Using inner object: ${inner.callMe()}")
}