package id.ac.polbeng.puteri.test_kelas

class Greeter {
    var text: String = "" //atribut text

    //dua buah method greet
    fun greet() {
        println("Hello object world!")
    }
    fun greet(name: String) {
        println("$text $name")
    }
    fun with_ret_val(name: String): String { //nilai kembali string
        return "$text $name"
    }
}