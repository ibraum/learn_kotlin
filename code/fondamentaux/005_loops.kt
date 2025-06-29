// FOR
// WHILE
// DO...WHILE

fun main () {
    // FOR
    println("FOR LOOPS : ")
    for (i in 1..10) {
        println(i)
    }

    println("WHILE LOOPS : ")
    var i = 0
    while (i < 10) {
        println(i)
        i++
    }

    println("DO...WHILE LOOPS : ")
    i = 0
    do {
        println(i)
        i++
    } while (i < 10)

    println("FOR LOOPS WITH CONTINUE : ")
    for (i in 1..10) {
        if (i % 2 == 0) continue // Saute l'itération actuelle d'une boucle
        println(i)

    }

    println("FOR LOOPS WITH BREAK : ")
    for (i in 1..10) {
        if (i % 2 == 0) break // Coupe l'execution d'une boucle
        println(i)

    }
}