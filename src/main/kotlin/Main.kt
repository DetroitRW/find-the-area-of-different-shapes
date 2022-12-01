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
