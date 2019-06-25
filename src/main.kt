

fun main(args: Array<String>) {

    var k: Double
    var x = 5.0
    var m: Double

    print("Введите значение k")
    k = readLine()!!.toDouble()
    print("Введите значение m")
    m = readLine()!!.toDouble()

    var y: Double
    y = k * x + m

    println("Значение у = $y")
}