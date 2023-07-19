fun main() {
    val n1 = 20
    val n2 = 30
    /* var v = n2 > n1? ":)" : ":("// this is java */

    var v = if (n2 > n1) ":)" else ":("
    println(v)

    val v1 =
        if (n1 >= n2) ":)"
    else if (n1 == 30) "hey"
    else if (n1 == 20) " hello"
    else ":("

    }

