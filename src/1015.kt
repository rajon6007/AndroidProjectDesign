import kotlin.math.sqrt

fun main(args: Array<String>) {
    val x1 = readLine()!!.toDouble()
    val y1 = readLine()!!.toDouble()

    val x2 = readLine()!!.toDouble()
    val y2 = readLine()!!.toDouble()

    val Distance = sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)))
    println("$Distance %.4f".format())
}