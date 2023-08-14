fun main()
{
    var Deep=1

    for(i in 1..5)
    {
        for(j in 1..i)
        {
            print(" $Deep")
            Deep=Deep+1
        }
        println()
    }

}