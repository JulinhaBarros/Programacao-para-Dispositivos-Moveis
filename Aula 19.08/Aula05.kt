fun main(){

   println("Digite a nota do aluno:")
    val nota = readLine()?.toInt()!!

    when (nota){

        10, 9, 8 -> println("Parabens!! Você é um aluno exemplar")
        7, 6 -> println("Você não fez mais que sua obrigação")
        5, 4, 3 -> println("Vai ficar de exame")
        2, 1, 0 -> println("Você é burro!!!")

        else -> println("Nota fora dos parâmetros")
    }

}