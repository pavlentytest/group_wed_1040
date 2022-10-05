import java.util.*

fun main() {
    // строчный комментарий
    /*
    Многострочный
     */
    val a = 100 // value - immutable
    println(a::class)
    a = 200
    var b = 200
    b = 500

    val a1: Byte = -10
    val b1: Short = 45
    var c1: Int = -250
    val d1: Long = 3000L

    val h: Double = 4.5
    val f: Float = 4.5F

    val flag: Boolean = true
    val ch: Char = 'A'
    val name: String = "Ivan"
    val secondname: String = "Ivanov"

    c1 = d1.toInt()
    println("$name $secondname")

    val x1 = 11
    val y1 = 5
    val z1 = x1/y1 // 2

    val x2 = 11
    val y2 = 5.0
    var z2 = x2/y2 // 2.2

    z2 = z1.toDouble()

    val scanner = Scanner(System.`in`)
    val k = scanner.nextInt() // целое число

    val v = readLine()?.toInt()
    val (p1, p2) = readln().split(" ").map{ it.toInt() }

    var str: String = "abc"
    str = null

    var str2: String? = "abc"
    str2 = null

    // val l = if(str2 != null) str2.length else -1
    println(str2?.length) // ?. - оператор безопасного вызова
    val l = str2?.length ?: -1 // elvis expression


    // остаток от деления - %

    var w1 = 5    // 6
    var w2 = ++w1 // 6

    var w3 = 5    // 6
    var w4 = w3++ // 5

    val g = 10
    if(g == 10) {
        println("10")
    } else if (g == 8) {

    } else {

    }
    var s = 10
    val p = 20
    val result = if(s > p) {
        println("s = $s")
        s
    } else {
        println("p = $p")
        s = 45
        s
    }
    // < > != ==
    // тип логической операции in
    val q = 5
    val r1 = q in 1..6 // [1,6] - true
    val r2 = q !in 10 downTo 1

    when(flag) {
        false -> println("false")
        true -> println("True")
        else -> println("else")
    }
    val m = 10
    when(m) {
        10,20,30 ->println("Or")
        else -> println("")
    }
    when(m) {
        in 10..19 -> println("")
        in 20..29 -> println("")
        !in 10..20 -> println("")
    }
    val j = 10
    val i = 5
    val r = 3
    when(j+i) {
        i-r -> println("i-r")
        i+5 -> println("")
    }
    val sum = 1000
    val rate = when(sum) {
        in 100..999 -> 10
        in 1000..10000 -> 15
        else -> 20
    }

    var k1 = 15
    val k2 = 6
    when {
        (k1>10) -> println()
        (k2>5) -> {
            println("")
            k1+=10
        }
    }
}