import java.util.Scanner
import kotlin.math.PI
import kotlin.math.sqrt

fun display(text: String) {
    print(text)
}
fun promtString(text: String) : String {
    val reader = Scanner(System.`in`)
    display(text)
    return reader.next()
}
fun promtDouble(text: String) : Double {
    val reader = Scanner(System.`in`)
    display(text)
    return reader.nextDouble()
}
fun main(args: Array<String>) {
    val f = promtString("Круг(c), прямоугольник(r) или треугольник(t): ")

    when(f) {
        "c"-> circleArea()
        "r"-> rectangleArea()
        "t"-> triangleArea()
        else -> display("Неверный ввод!")
    }
}

fun circleArea() {
    val r = promtDouble("Введите радиус: ")
    display("Площадь круга = ${circle(r)}")
}

fun rectangleArea() {
    val a = promtDouble("Введите 1 сторону: ")
    val b = promtDouble("Введите 2 сторону: ")
    display("Площадь прямоугольника = ${rectangle(a, b)}")
}

fun triangleArea() {
    val z = promtDouble("Введите 1 сторону: ")
    val x = promtDouble("Введите 2 сторону: ")
    val c = promtDouble("Введите 3 сторону: ")
    if (z + x < c || z + c < x || x + c < z) {
        display("Треугольника не существует")
    } else {
        display("Площадь треугольника = ${triangle(z, x, c)}")
    }
}
fun circle(r: Double): Double {
    return PI * r * r
}
fun rectangle(a: Double, b: Double): Double {
    return a * b
}
fun triangle(z: Double, x: Double, c: Double): Double {
    val o = (z + x + c) / 2
    return sqrt((o - z) * (o - x) * (o - c) * o)
}
