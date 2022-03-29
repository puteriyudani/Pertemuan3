package id.ac.polbeng.puteri.test_kelas
//anonymous class adalah konsep membuat sebuah objek interface menggunakan objek runtime

fun main() {
    //membuat instance interface
    var programmer: Human = object : Human {
        override fun think() { //mengoverride method think()
            print("I am an example of Anonymous Inner Class ")
        }
    }
    programmer.think()
}

//interface Human
interface Human {
    fun think()
}