import java.util.Scanner
import kotlin.math.PI
import kotlin.math.sqrt

fun main(args: Array<String>) {
   val reader = Scanner(System.`in`)
    print("Круг(c), прямоугольник(r) или треугольник(t): ")
    val f = reader.next()

    if (f == "c" ) {
        print("Введите радиус: ")
        val r = reader.nextDouble()
        println("Площадь круга = ${circle(r)}")
    } else if (f == "r") {
        print("Введите 1 сторону: ")
        val a = reader.nextDouble()
        print("Введите 2 сторону: ")
        val b = reader.nextDouble()
        print("Площадь прямоугольника = ${rectangle(a, b)}")
    } else if (f == "t") {
        print("Введите 1 сторону: ")
        var z = reader.nextDouble()
        print("Введите 2 сторону: ")
        var x = reader.nextDouble()
        print("Введите 3 сторону: ")
        var c = reader.nextDouble()
        if (z > x) {
            val t = z
            z = x
            x = t
        }
        if (z > c) {
            val t = z
            z = c
            c = t
        }
        if (c < x) {
            val t = c
            c = x
            x = t
        }

        if (z + x < c) {
            print("Треугольника не существует")
        } else {
            print("Площадь треугольника = ${triangle(z, x, c)}")
        }
    }

}
fun circle(r: Double): Double {
    var p = r
    p *= PI * p
    return p
}
fun rectangle(a: Double, b: Double): Double {
    return a * b
}
