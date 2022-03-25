package id.ac.polbeng.puteri.test_kelas

class PersonF (val firstName: String, val lastName: String) {
    init {
        println("Sedang inisialisasi!")
    }

    //constructor tambahan harus mendelegasi constructor utama
    constructor(_firstName: String, _lastName: String, _age:Int): this(_firstName, _lastName){ //delegasi dilakukan menggunakan keyword this
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println()
    }
    constructor(_firstName: String, _lastName:String, _country:String): this(_firstName, _lastName){
        println("Name : $_firstName $_lastName")
        println("Country : $_country")
        println()
    }
    constructor(_firstName: String, _lastName:String, _age:Int, _country:String): this(_firstName,
        _lastName, _age){
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println("Country : $_country")
    }
}
fun main(){
    //memasukkan nilai ke dalam variabel
    val anton = PersonF("Faisal", "Yanto")
    val budi = PersonF("Puteri", "Yudani", 21)
    val caca = PersonF("Amanda", "Agung", "Indonesia")
    val dono = PersonF("Putri", "Nuraniza", 20, "Indonesia")
}