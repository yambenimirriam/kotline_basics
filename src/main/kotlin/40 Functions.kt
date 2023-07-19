fun main() {

    // invoking the function
    greet("Mirriam")
    greet("Resten", 20)
    /*if we want to switch the arguments
    we can define them as follows(named arguments)*/
    greet(age = 10, name = "Shira" )

    // returning value from function
    println(double(10))

    // returning multiple values
    val (v1, v2) = twoValues()
    println("$v1 $v2")
    val (s1, s2) = twoValues2()
    println("$v1 $v2")
    val (t1, t2, t3) = threeValues()
    println("$t1 $t2 $t3")

    /* functionsAsArguments() */
    /*
    greate (bar = {
    println("bar as a function")
    })
    // same as above invoking function and pass anther function into it.
    greate { println("bar as a function 2") }

    // invoking greate function as default
    greate ()
    invoking double function
    */


}
//passing function into another function
fun functionsAsArguments() {

    fun greate(bar: () -> Unit = {}) {
        println("bar function")
        bar()

    }
}

// returning value from function
//fun  as a single expression(if it has single value) same as below that has been commented
fun double(n: Int) : Int = n * 2

fun double2(n: Int) : Int {
return n * 2
}
// returning multiple values
fun twoValues(): Pair<String, Int> =
    "Mimie" to 20
fun twoValues2(): Pair<String, Int> =
    Pair("Mimie", 20)


fun threeValues():
        Triple<String, Int, Char>{
    return Triple(
        "Mimie",
        20,
        'R'
    )
}

// if  access modifier is not specified it means that the function is  public by default
fun greet(name: String, age: Int = -1) {
    println("Hello! $name")
    if (age == -1) {
        println("age is not provided\n")
        return
    }

    if (age >= 15){
        println("$name $age - is an adult")
    }

    else {
        println("$name $age -  is not an adult")
    }
println()

}