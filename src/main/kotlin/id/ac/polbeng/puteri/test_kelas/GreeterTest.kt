package id.ac.polbeng.puteri.test_kelas

fun main() {
    val greeter = Greeter()
    greeter.greet()
    greeter.text = "Hi" //atribut text bernilai "Hi"

    //pemanggilan method greet dari kelas Greeter
    greeter.greet("Puteri")
    greeter.greet("Yudani")

    greeter.text = "Hello programmer" //menambahkan nilai text dengan "Hello programmer"

    //pemanggilan fungsi with_ret_val dengan parameter string
    println(greeter.with_ret_val("Puput"))
}