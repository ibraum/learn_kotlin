// const permet de définir des variables qui seront par la suite immutable c'est à dire qu'ils ne peuvent pas changer de valeur après déclaration et sont connu à la compilation
// const n'est pas applicable au type var
// Les const ne peuvent qu'être déclaré qu'en haut ou en dehors d'une fonction
const val text3 = "I'm learning Kotlin !"

fun main () {
    //Dans Kotlin nous diisposons de deux mots clés pour la déclaration des variables var  et val

    // val permet de définir des variables qui seront par la suite immutable c'est à dire qu'ils ne peuvent pas changer de valeur après et ne sont connu qu'a l'exécution
    // Initialisation lors de la déclaration de la variable
    val text1 = "Hello World !"
    println(text1)
    // ex : 
    //text1 = "h"; // elle ne peut pas avoir une nouvelle valeur

    // val permet de définir des variables qui seront par la suite mutable c'est à dire qu'ils peuvent changer de valeur après déclaration
    var text2 = "I'm learning Kotlin !"
    println(text2)

    println(text3)

    // Les types de données (Tous les types de données en kotlin sont en capitalcase)
    // Int ex: 10, 20, -5, ...
    // Double ex: 3.14, 1.10, ...
    // String ex: "Hello World !", ...
    // Char ex: 'A', 'a', '1', ...
    // Boolean ex: true, false, ...

    // DECLARATION AVEC TYPE
    // constante
    val nombre : Int = 10
    println(nombre)

    // valeur pouvant être changer seulement avec le type prédéfini
    var nombre2 : Int = -10
    println(nombre2)


    // AFFICHAGE DES VARIABLES
    print(text1)
    println(text1)
    println("Interpolation text1 : $text1") // Interpolation
    println("Concatenation text1 : " + text1) // Concaténation
}