fun main() {
    val nums = intArrayOf(1,2, 3, 4, 5, 6)

    for (n in nums) {

        //continue key word
        if (n % 2 != 0) {
            continue
        }

        //break key word
        if (n > 5)
            break
         println(n)

        //this is not allowed
        /*
        nums.forEach {
            if (it == 2){
                break
            }
        }
          */
         
    }


}