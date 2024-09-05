import kotlin.math.sqrt
import java.util.*

fun main(args: Array<String>) {
    val a =Scanner(System.`in`)

    val x1 = a.nextDouble()
    val y1 = a.nextDouble()

    val x2 = a.nextDouble()
    val y2 = a.nextDouble()

    val Distance = sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)))
    println("%.4f".format(Distance))
}