package id.ac.polbeng.puteri.test_kelas

//interface pertama = A
interface A {
    fun demo() {
        println("From interface A")
    }
}

//interface kedua = B
interface B {
    fun demo() {
        println("From interface B")
    }
}

//Kelas ini mengimplementasikan interface X dan Y
class MyClassB: A, B {
    override fun demo() {
        //menambahkan keyword super
        super<A>.demo()
        super<B>.demo()
    }
}

//jalankan program
fun main() {
    val obj = MyClassB()
    obj.demo()
}