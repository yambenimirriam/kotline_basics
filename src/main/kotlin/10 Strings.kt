fun main() {
    val name = "Emily"
    println(name)
    // there are a lot of functions these are part of them
    println(name.lowercase())
    println(name.uppercase())
    val age = 15
    val msg = "Name:$name, Age: $age"
    println(msg)

    // multiline feature
    //to combine a data type use modulus then the type
    val email = """
        Hello %s 
          How
        Are you
    """.trimIndent()
    println(email.format("Mirrie"))

}