package id.ac.polbeng.puteri.test_kelas
//implementasi interface
interface MyInterface{
    var str: String
    fun demo()
    fun func(){
        println("Hello")
    }
}

//kelas MyClass turunan dari kelas MyInterface
class MyClass: MyInterface{
    override var str: String = "Rekayasa Perangkat Lunak"
    override fun demo() {
        println("Demo Function")
    }
}

fun main() {
    //pemanggilan fungsi
    val obj = MyClass()
    obj.demo()
    obj.func()

    //tampilkan program
    println(obj.str)
}