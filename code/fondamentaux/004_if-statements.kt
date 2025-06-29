fun main () {
    val a = 7
    val b = 3

    if (a == b) {
        println("a est égale à de b")
    }

    if (a == b) {
        println("a est égale à de b")
    } else {
        println("a différent b")
    }

    if (a == b) {
        println("a est égale à de b")
    } else if (a < b) {
        println("a est inférieur à b")
    } else {
        println("a est supérieur à b")
    }


    val result = if (a == b) "a est égale à de b" else "a différent b"
    print(result)
}