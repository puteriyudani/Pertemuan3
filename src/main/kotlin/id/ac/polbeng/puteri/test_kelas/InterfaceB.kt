package id.ac.polbeng.puteri.test_kelas

//interface Named
interface Named {
    val name: String
}

//interface Person turunan dari Named
interface Person : Named {
    val firstName: String
    val lastName: String
    override val name: String get() = "$firstName $lastName"
}

data class EmployeeB(
//menerapkan 'nama' tidak diperlukan
    override val firstName: String,
    override val lastName: String,
    val position: String
) : Person

//jalankan program
fun main(){
    val pegawai = EmployeeB("Ucok", "Baba", "Programmer")
    println(pegawai.name)
}