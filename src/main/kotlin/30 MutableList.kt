fun main() {
    // list size can be expanded
    val names = mutableListOf(
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
    // to remove element
    names.remove(element = "Olie")
    // add new element
    names.add("Madzalo")
    println(names)
}