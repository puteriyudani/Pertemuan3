package id.ac.polbeng.puteri.test_kelas
//overriding function

//parent class
open class Teacher {
    //Harus menggunakan pengubah "terbuka" untuk mengizinkan kelas anak menimpanya
    open fun teach() {
        println("Teaching...")
    }
    fun info(){
        println("I'am a Teacher.")
    }
}

//child class, turunan dari class Teacher
class MathsTeacher : Teacher() {
    //Harus menggunakan pengubah "override" untuk mengganti fungsi kelas dasar
    override fun teach() {
        println("Teaching Maths...")
    }
}
fun main() {
    val teacher = Teacher()
    val mathsTeacher = MathsTeacher()

    mathsTeacher.info() //memanggil fungsi info
    teacher.teach() //memanggil fungsi teach di class Teacher
    mathsTeacher.teach() //memanggil fungsi teach di class MathsTeacher
}