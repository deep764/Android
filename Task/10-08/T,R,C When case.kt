fun main()
{

    val w = 21
    val h = 23
    val l = 20
    val r = 30
    println("Enter operator")
    println("1 : Triangle")
    println("2 : Rectangle")
    println("3 : Circle")

    val operator = readLine()

    when (operator)
    {
        "1" -> println("$w*$h/2 = ${w * h/2}")
        "2" -> println("$l * $w = ${l * w}")
        "3" -> println("3.14 *$r*$r = ${3.14 *r*r}")
        else -> println("$operator is invalid")
    }
}
