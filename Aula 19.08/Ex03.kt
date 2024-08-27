fun main(){

    val x = "correto"

    var elvisOperator = retornanull(x) ?: "Valor Padrão"

    println(elvisOperator)

}

fun retornanull (a:String) : String? {

    if (a.equals(("correto")))
        return "Deu certo"

    else
        return null
}