package id.ac.polbeng.puteri.test_kelas
//enkapsulasi memungkinkan kita untuk menyembunyikan informasi dari suatu kelas

//getter dan setter
class Employee(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field //getter untuk menampilkan nilai data
    var name: String = _name
        get() = field
        set(value) { //setter untuk memberikan nilai data
            field = value
        }
    var age: Int = _age
        get() = field
        set(value) {
            field = value
        }
}
fun main() {
    val emp = Employee(1101, "Puteri", 21)
    println("Id : ${emp.id}, Nama : ${emp.name}, Umur : ${emp.age}")
}