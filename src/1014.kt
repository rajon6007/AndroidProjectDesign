
import java.util.*
fun main(args: Array<String>) {

    val a = Scanner(System.`in`)



    val X = a.nextInt()
    val Y = a.nextFloat()

    val average = X/Y

    println("%.3f km/l".format(average))
}