package id.ac.polbeng.puteri.test_kelas

//parent class
open class Rectangle {
    open fun draw() {
        println("From Base Class Rectangle")
    }
}

//child class
interface Polygon {
    fun draw() { //anggota antarmuka 'terbuka' secara default
        println("From interface Polygon")
    }
}

class Square() : Rectangle(), Polygon {
    //Kompiler membutuhkan draw() untuk diganti:
    override fun draw() {
        super<Rectangle>.draw() //panggil ke Rectangle.draw()
        super<Polygon>.draw() //panggil ke Polygon.draw()
    }
}

//jalankan program
fun main() {
    val square = Square()
    square.draw()
}