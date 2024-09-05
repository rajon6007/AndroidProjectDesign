
import kotlin.math.abs
fun main(args: Array<String>) {


    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val maxAB = (a+b+abs(a-b))/2
    val maxABC = (maxAB+c+abs(maxAB-c))/2
    println("$maxABC eh o maior")
}
