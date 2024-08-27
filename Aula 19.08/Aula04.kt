

fun main(){

    var idade: Int

    println("Digite sua idade:")
    idade = readLine()?.toInt()!!

    if (idade >= 18)
        println("Pode entrar!!")

    else
        println("Não pode entrar!!")

}