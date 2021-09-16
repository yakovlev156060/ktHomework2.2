fun main(){
    val likes =10001

    //var rezult:Int=(amount*0.0075F).toInt()
    var rezult:String=""
    var remainder:Int=likes%100

    if(remainder==1){
        rezult="лайк"
    }else {

        if ((remainder >= 2) && (remainder <= 4)) {
            rezult = "лайка"
        } else {
            rezult = "лайков"
        }
    }
    println("$likes $rezult")
}