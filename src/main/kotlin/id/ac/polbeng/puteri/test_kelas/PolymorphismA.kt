package id.ac.polbeng.puteri.test_kelas
//polymorphisme

//static polymorphism (Overloading Function)
//method dengan nama sama, namun parameter berbeda

//n : Number
fun printNumber(n : Number){
    println("Using printNumber(n : Number)")
    println(n.toString() + "\n")
}

//n : Int
fun printNumber(n : Int){
    println("Using printNumber(n : Int)")
    println(n.toString() + "\n")
}

//n : Double
fun printNumber(n : Double){
    println("Using printNumber(n : Double)")
    println(n.toString() + "\n")
}

//n : Int, str : String (2 parameter)
fun printNumber(n:Int, str:String){
    println("Using printNumber(n:Int, str:String)")
    println(str + n.toString() + "\n")
}

//jalankan program
fun main(){
    val a: Number = 99
    val b = 1
    val c = 3.1
    printNumber(a)
    printNumber(b)
    printNumber(c)
    printNumber(b, "Overloading function ")
}