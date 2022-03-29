package id.ac.polbeng.puteri.test_kelas

abstract class Vehicle(val name: String,
                       val color: String,
                       val weight: Double) { //Concrete (Non Abstract) Properties
    //Properti Abstrak (Harus diganti oleh Subclass)
    abstract var maxSpeed: Double
    //Metode Abstrak (Harus diimplementasikan oleh Subclass)
    abstract fun start()
    abstract fun stop()
    abstract fun sound()
    //Concrete (Non Abstract) Method
    fun displayDetails() {
        println("Name: $name, Color: $color, Weight: $weight, Max Speed: $maxSpeed")
    }
}

//kelas Car
class Car(name: String,
          color: String,
          weight: Double,
          override var maxSpeed: Double): Vehicle(name, color, weight) {
    override fun start() {
//Kode untuk menjalankan Car
        println("Car Started")
    }
    override fun stop() {
//Kode untuk menghentikan Car
        println("Car Stopped")
    }
    override fun sound() {
//Kode untuk suara Car
        println("Brum...brum...brumm!")
    }
}

//kelas Motorcycle
class Motorcycle(name: String,
                 color: String,
                 weight: Double,
                 override var maxSpeed: Double): Vehicle(name, color, weight) {
    override fun start() {
//Kode untuk menjalankan Motorcycle
        println("Bike Started")
    }
    override fun stop() {
//Kode untuk menghentikan Motorcycle
        println("Bike Stopped")
    }
    override fun sound() {
//Kode untuk suara Motorcycle
        println("Preng...preng...preng!")
    }
}

//jalankan program
fun main() {
    //inisiasi nilai untuk variabel
    val car = Car("Ferrari 812 Superfast", "red", 1525.0, 339.60)
    val motorCycle = Motorcycle("Ducati 1098s", "red", 173.0, 271.0)

    //pemanggilan fungsi
    car.displayDetails()
    motorCycle.displayDetails()
    car.start()
    car.sound()
    car.stop()
    motorCycle.start()
    motorCycle.sound()
    motorCycle.stop()
}