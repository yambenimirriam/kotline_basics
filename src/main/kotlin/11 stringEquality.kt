fun main() {
    val name1 = "Sarai"
    val name2 = "Ellan"
    val name3 = String("Sarai".toCharArray())//constructor

    println("=== ${name1 === name3} ")
    println(".equals ${name1.equals (name3)}")
    //the three equals compare memory location
    // two equals compare the contents
    // avoid to create string as in name3 it need special memory for object string as well as the name
}