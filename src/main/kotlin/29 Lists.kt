fun main() {
    // list size can be expanded
    val names: List<String> = listOf(
        "Mirriam",
        "Mimie",
        "Olivia",
        "Olie"
    )
    // to access element use index
    println(names[1])
    // to know size
    println(names.size)
    // to know if element is within list
    println(names.contains("Olie"))
    // to know the element index
    println(names.indexOf("Mimie"))
    println(names)
}