fun main() {
    val n1 = 20
    val n2 = 30
//    val value = if (n2 > n1) {
//        //println(":)")
//        ":)"
//    }
//    else {
//        //println("I knew it")
//        ":("
//    }
//    println(value)
    // if else to when expression
    when {
        (n2 > n1) -> println(":(")
        (n2 >= n1) -> println("hello")
        else -> println(":)")
    }

    val age = 12

    when (age) {
        in 5 .. 13 -> println("Little")
        !in 5 .. 13 -> println("Adult")
        else -> println("Baby")
    }

}