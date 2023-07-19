const val PI = 3.14 // same as static final in java
val pi = getPiValue()
fun main() {
    val name = "MiRe"// read only same as final in java
    //name = ""
    var i = 0 // mutable
    // i = 2
}
fun getPiValue() : Double = 3.14
// so the difference btwn const and val is that const is not written inside the function and it needs to be given the exact value.
// where the val can be written inside a function and can be assigned to a function.