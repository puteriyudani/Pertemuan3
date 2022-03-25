package id.ac.polbeng.puteri.test_kelas
//merubah method setter dan getter default
class EmployeeA(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field
    var name: String = _name
        get(){
            return field.toUpperCase() //nama menjadi huruf kapital
        }
        set(value) {
            field = value
        }
    var age: Int = _age
        get() = field
        set(value) {
            //kondisi salah, seharusnya value < 0
            field = if(value > 0) value else throw IllegalArgumentException("Age must be greater than zero")
        }
}
fun main() {
    val emp = EmployeeA(1101, "Puteri", 21)
    println("Id : ${emp.id}, Nama : ${emp.name}, Umur : ${emp.age}")
    emp.age = -1 //value umur -1
}