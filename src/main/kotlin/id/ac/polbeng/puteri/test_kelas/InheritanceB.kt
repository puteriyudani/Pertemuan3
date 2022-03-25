package id.ac.polbeng.puteri.test_kelas

//Child class (inisialisasi parent class)
class LaptopB : Computer{
    val batteryLife: Double
    //Memanggil super() untuk menginisialisasi kelas Induk
    constructor(name: String, brand: String, batteryLife: Double): super(name, brand) {
        this.batteryLife = batteryLife
    }
    //Memanggil konstruktor lain (yang memanggil super())
    constructor(name: String, brand: String): this(name, brand, 0.0) {
    }

    //fungsi untuk menampilkan program
    fun info(){
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
}

fun main(){
    val myLaptop = LaptopB("Asus Think Pad", "Asus")
    println(myLaptop.info())
}