fun main() {
    // array size can not be expanded
    val names = arrayOf(
        "Mimie", "Mirrie", "Olie"
    )
    // returning the element of an array using index
    println(names[0])
    println(names[1])
    // editing elements in the array
    names[0] = "Shira"
    // to know the size of array
    println(names.size)
    // to check if particular element is within the array
    if ("hello" in names) {
        println("found")
    }
    else {
        println("not found")

    }
    println(names.contentToString())

    val arrayOfNulls =  arrayOfNulls<String>(size = 4)
    arrayOfNulls.fill(element = "*")
    arrayOfNulls[2] = "Olivia"
    println(arrayOfNulls.contentToString())
}