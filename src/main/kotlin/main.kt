fun main() {
    val likes = 74

    //var rezult:Int=(amount*0.0075F).toInt()
    var rezult: String = ""
    var remainder: Int = likes % 100

    if ((remainder >= 11) && (remainder <= 15)) {
        rezult = "лайков"
    }
    else{
        if (remainder % 10 == 1) {
            rezult = "лайк"
        } else {

            if ((remainder%10 >= 2) && (remainder%10 <= 4)) {
                rezult = "лайка"
            } else {
                rezult = "лайков"
            }
        }
    }


    println("$likes $rezult")
}