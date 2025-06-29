// Kotlin dispose des opérateurs de base comme +, -, /, * et le modulo %

fun main () {
    var a = 1
    var b = 2

    // OPERATIONS ARITHMETIQUES AVEC CONCATENATION
    println("La somme a + b = " + (a + b))
    println("La soustraction a - b = " + (a - b))
    println("La multiplication a * b = " + (a * b))
    println("La division a / b = " + (a / b)) // Division entière
    println("Le modulo a % b = " + (a % b))

    // OPERATIONS ARITHMETIQUES AVEC INTERPOLATION
    println("La somme a + b = ${a + b}")
    println("La soustraction a - b =  ${a - b}")
    println("La multiplication a * b = ${a * b}")
    println("La division a / b = ${a / b}") // Division entière
    println("Le modulo a % b  = ${a % b}")

    // OPERATIONS D'AFFECTATION ABBREGEES
    // Addition
    a += 1
    b += 1
    // Soustraction
    a -= 1
    b -= 1
    // Multiplication
    a *= 1
    b *= 1
    // Division
    a /= 1
    b /= 1
    println("a = $a, b = $b")

    // OPERATEURS LOGIQUES
    val c = true
    val d = false
    println("c et d ${c && d}")
    println("c ou d ${c || d}")
    println("c ou d $!c")

    // OPERATEURS DE COMPARAISON
    println("a == b ${a == b}")
    println("a != b ${a != b}")
    println("a > b ${a > b}")
    println("a < b ${a < b}")
    println("a <= b ${a <= b}")
    println("a >= b ${a >= b}")

    // OPERATION SUR LES CHAINE DE CARACTERES
    val text1 = "Bonjour, " + " [_I_B_M_]" // Concaténation
    println(text1)
    println(text1.length)
    println(text1.toBoolean())
    println(text1.toCharArray()) // == println(text1)
    println(text1[0])
}