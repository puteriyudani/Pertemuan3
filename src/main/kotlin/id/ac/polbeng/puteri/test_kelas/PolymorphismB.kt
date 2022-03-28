package id.ac.polbeng.puteri.test_kelas

open class MyBase {
    //Harus menggunakan pengubah "open" untuk mengizinkan kelas anak menimpanya
    open fun think () {
        println("Hey!! i am thinking ")
    }
}

class MyDerived: MyBase() { //pewarisan terjadi menggunakan konstruktor default
    //Harus menggunakan pengubah "override" untuk mengganti fungsi kelas dasar
    override fun think() {
        println("I Am from Child")
    }
}

//pemanggilan fungsi
fun main() {
    val myBase = MyBase()
    myBase.think()
    var myDerived = MyDerived()
    myDerived.think()
}