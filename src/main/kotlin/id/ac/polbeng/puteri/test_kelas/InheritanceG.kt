package id.ac.polbeng.puteri.test_kelas

//parent class
open class Base(val name: String) {
    //inisialisasi kelas parent
    init {
        println("Initializing Base")
    }
    //inisialisasi size parent
    open val size: Int = name.length.also {
        println("Initializing size in Base: $it")
    }
}

//child class
class Derived(name: String, val lastName: String) :
    Base(name.capitalize().also { println("Argument for Base: $it") }) {
    //inisialisasi kelas child
    init {
        println("Initializing Derived")
    }
    //inisialisasi size child
    override val size: Int = (super.size + lastName.length).also {
        println("Initializing size in Derived: $it")
    }
}

//jalankan program
fun main(){
    val turunan = Derived("Puteri", "Yudani")
    turunan.size
}