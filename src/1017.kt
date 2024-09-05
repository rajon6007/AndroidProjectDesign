import java.util.*


fun main(args: Array<String>) {
    val a = Scanner(System.`in`)

    val x = a.nextInt()
    val y = a.nextInt()

    val z = (x*y)/12


    print("%.3f".format(z))
}