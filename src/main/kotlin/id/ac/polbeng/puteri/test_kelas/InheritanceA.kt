package id.ac.polbeng.puteri.test_kelas
//inheritance adalah pewarisan fitur kelas induk (parent) kepada kelas anak (child)

//membuat kelas parent dan child
//Parent class
open class Computer(val name: String,
                    val brand: String) {
}

//Child class (inisialisasi parent class)
class Laptop(name: String, //mewarisi variabel name dari kelas induk
             brand: String, //mewarisi variabel brand dari kelas induk
             val batteryLife: Double) : Computer(name, brand) {

    //fungsi untuk menampilkan program
    fun info(){
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
}

//
fun main(){
    val myLaptop = Laptop("Acer Aspire 4738", "Acer", 2.5)
    println(myLaptop.info())
}