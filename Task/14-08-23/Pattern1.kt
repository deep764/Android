fun main()
{
    for(i in 1..5)
    {
        var deep = i

        for(space in 0..(5-i))
        {
            print(" ")
        }

        for(j in 1..i)
        {

            print ("$deep")
            deep = deep - 1
        }


        println()

    }
}