fun main() {
    var name = "Shira"
    println(name.uppercase())

    //if we want the name to be null we can use optional operator "?"
   // var brand : String? = "Madzalo"
   // brand = null
    // or
    var brand : String? = "Madzalo"
    println(brand?.uppercase())
}