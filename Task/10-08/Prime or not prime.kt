fun main()
{
    val num = 20
    var deep= false
    for (i in 2..num / 2)
    {

        if (num % i == 0)
        {
            deep = true
            break
        }
    }

    if (!deep)
        println("$num is a prime number.")
    else
        println("$num is not a prime number.")
}
