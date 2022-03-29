package id.ac.polbeng.puteri.test_kelas
//access modifier
//final(default), open, abstract, override

open class Mahasiswa(var nama: String, var nrp: Int){
    open fun info() {
        println(nama +'\n'+ nrp);
    }
    override fun toString(): String {
        return "Mahasiswa{nama= $nama, nrp= $nrp}"
    }
}

class KetuaHima(nama: String, nrp: Int, val jurusan: String) : Mahasiswa(nama, nrp) {
    @Override //access modifier override
    override fun info(){
        println(nama +'\n'+ nrp +'\n'+ jurusan);
    }
}

//pemanggilan fungsi dan jalankan program
fun main(){
    val puteri = Mahasiswa("Puteri Yudani", 1234567)
    val ayi = KetuaHima("Al-Qusairy", 1234566, "Teknik Informatika")
    println(ayi.toString()); //pemanggilan fungsi toString() dengan nilai pada variabel ayi
    println()
    ayi.info() //pemanggilan fungsi info() dengan nilai pada variabel ayi
    println("Jenis Kelas = " + ayi.javaClass.simpleName)
    println()
    puteri.info() //pemanggilan fungsi info() dengan nilai pada variabel puteri
    println("Jenis Kelas = " + puteri.javaClass.simpleName)
    val putra = KetuaHima("Putra", 1134567, "Teknik Sipil")
    println()
    putra.info() //pemanggilan fungsi info() dengan nilai pada variabel putra
    println("Jenis Kelas = " + putra.javaClass.simpleName)
}