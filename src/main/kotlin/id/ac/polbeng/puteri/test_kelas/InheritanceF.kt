package id.ac.polbeng.puteri.test_kelas

//parent class
open class EmployeeF {
    open val baseSalary: Double = 10000.0
    open fun displayDetails() {
        println("I am an Employee")
    }
}

//child class
class Developer: EmployeeF() {
    //menggunakan keyword super() untuk mengakses property atau fungsi anggota dari kelas parent
    override var baseSalary: Double = super.baseSalary + 10000.0
    override fun displayDetails() {
        super.displayDetails()
        println("I am a Developer")
    }
}

//jalankan program
fun main(){
    val employeeF = EmployeeF() //memanggil fungsi dari class parent
    println("${employeeF.javaClass.simpleName} base salary is ${employeeF.baseSalary}")
    println(employeeF.displayDetails())
    val developer = Developer() //memanggil fungsi dari class child
    println("${developer.javaClass.simpleName} base salary is ${developer.baseSalary}")
    println(developer.displayDetails())
}