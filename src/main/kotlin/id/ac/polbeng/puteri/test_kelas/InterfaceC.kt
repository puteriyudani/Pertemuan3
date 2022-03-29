package id.ac.polbeng.puteri.test_kelas

//interface pertama = X
interface X {
    fun demoX() {
        println("demoX function")
    }
    fun funcX()
}

//interface kedua = Y
interface Y {
    fun demoY() {
        println("demoY function")
    }
    fun funcY()
}

//Kelas ini mengimplementasikan interface X dan Y
class MyClassA: X, Y {
    override fun funcX() { //fungsi dari interface X
        println("Hello")
    }
    override fun funcY() { //fungsi dari interface Y
        println("Hi")
    }
}

//jalankan program
fun main() {
    val obj = MyClassA()
    obj.demoX()
    obj.demoY()
    obj.funcX()
    obj.funcY()
}