fun main() {
    //object 1
    val tv = SmartDevice(
        "Samsung Smart TV QLED",
        30000.00
    )

    val tv1 = SmartDevice(
        "Samsung Smart TV QLED",
        30000.00
    )
    val tv2 = SmartDevice(
        "Samsung Smart TV QLED",
        30000.00
    )



    //(b4 constructors we had below code)
//    tv.brand = "Samsung Smart TV QLED"
//   tv.price = 30000.00
    println("${tv.brand} ${tv.price}")
    tv.turnOn()
    tv.getDeviceState()
    println(tv)
    println(tv.brand)
    println(tv.price)
    println(tv.isSwitchedOn)

    // equality
    println("== ${tv1 == tv2}")
    println("=== (memory location) ${tv1 === tv2}")

    // object 2
    val phone = SmartDevice(
        "Apple Iphone",
        500000.00
    )
    phone.price = 500000.00
    println("${phone.brand} ${phone.price}")
    phone.turnOff()
    phone.getDeviceState()

    val laptop = SmartDevice()

}
//blueprint
class SmartDevice (
    //properties
    var brand: String,
    var price: Double,
    var isSwitchedOn: Boolean = false
) {
    constructor(): this( "", 0.0)
    constructor(
        brand: String
    ): this(brand, 0.0)
    //getters & setters

//        get() = field
//        set(value) {
//            field = value
//        }

    //methods/functions
    fun getDeviceState(){
        println("$brand is on: $isSwitchedOn")
    }
    fun turnOn() {
         isSwitchedOn = true
        println("$brand is switching on")
    }
    fun turnOff() {
        isSwitchedOn = false
        println("$brand is switching off")
    }

    override fun toString(): String {
        return "SmartDevice(brand='$brand', price=$price, isSwitchedOn=$isSwitchedOn)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SmartDevice

        if (brand != other.brand) return false
        if (price != other.price) return false
        return isSwitchedOn == other.isSwitchedOn
    }

    override fun hashCode(): Int {
        var result = brand.hashCode()
        result = 31 * result + price.hashCode()
        result = 31 * result + isSwitchedOn.hashCode()
        return result
    }


}