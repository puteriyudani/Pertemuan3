package id.ac.polbeng.puteri.test_kelas
//hashCode untuk membandingkan nilai kode hash 2 objek
//equals untuk membandingkan nilai pada 2 buah objek

fun main() {
    //inisiasi variabel
    //nilai variabel boni sama dengan newBoni
    val boni = Student("Boni", 21)
    val newBoni = Student("Boni", 21)
    val meri = Student("Meri", 20)

    if (boni.equals(newBoni)) //inplementasi fungsi equals pada data class
        println("boni is equal to newBoni.")
    else
        println("boni is not equal to newBoni.")
    if (boni.equals(meri))
        println("boni is equal to meri.")
    else
        println("boni is not equal to meri.")

    //implementasi fungsi hashCode() pada data class
    println("Hashcode of boni: ${boni.hashCode()}")
    println("Hashcode of newBoni: ${newBoni.hashCode()}")
    println("Hashcode of meri: ${meri.hashCode()}")
}