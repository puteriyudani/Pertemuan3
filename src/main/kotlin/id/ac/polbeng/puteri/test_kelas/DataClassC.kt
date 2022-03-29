package id.ac.polbeng.puteri.test_kelas
//fungsi copy() untuk membuat sebuah objek salinan dengan beberapa property yang berbeda pada data class
fun main(){
    val meri = Student("Meri", 20)
    val badu = meri.copy("Badu") //copy dari objek meri

    //membandingkan nilai objek meri dan badu
    if(meri.equals(badu))
        println("meri is equal to badu.")
    else
        println("meri is not equal to badu.")

    //tampilkan program
    println("Hashcode of meri: ${meri.hashCode()}")
    println("Hashcode of badu: ${badu.hashCode()}")
}