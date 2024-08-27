fun main (){

    for (i in 1 .. 10){
        println("$i ... ")
    }

    for (i in 1 .. 100 step 3){
        println("$i ... ")

        if (i == 7)
            continue

        if (i == 31)
            break

        println("$i ... ")
    }
}

