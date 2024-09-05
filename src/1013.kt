
import kotlin.math.abs
import java.util.Scanner
fun main(args: Array<String>) {

    val x = Scanner(System.`in`)


    val a = x.nextInt()
    val b = x.nextInt()
    val c = x.nextInt()
    val d = (a+b+abs(a-b))/2
    val e = (d+c+abs(d-c))/2
    println("$e eh o maior")
}
