import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

        SistemaVotacao sistema = new SistemaVotacao();

        while (true) {

            System.out.println("Menu: " +
                    "\n 1. Criar partido" +
                    "\n 2. Criar Candidato" +
                    "\n 3. Votar" +
                    "\n 4. Exibir Resultado" +
                    "\n 5. Sair");

            int opcao = scaner.nextInt();
            scaner.nextLine();

            switch (opcao){
                case 1:

                    System.out.println("Digite o nome do partido: ");
                    String nomePartido = scaner.nextLine();
                    Partido partido = new Partido(nomePartido);
                    sistema.adicionarPartido(partido);
                    System.out.println("Partido " + nomePartido + " criado com sucesso");
                    break;

                case 2:

                    System.out.println("Digite o nome do candidato: ");
                    String nomeCandidato = scaner.nextLine();
                    System.out.println("Digite o nome do partido do candidato: ");
                    String nomePartidoCandidato = scaner.nextLine();
                    System.out.println("Digite o número do candidato: ");
                    int numeroCandidato = scaner.nextInt();

                    Partido partidoCandidato = sistema.buscarartidosPorNome(nomePartidoCandidato);

                    if (partidoCandidato != null) {

                        Candidato candidato = new Candidato(nomeCandidato, partidoCandidato, numeroCandidato);
                        sistema.adicionarCandidato(candidato);
                        System.out.println("Candidato " + nomeCandidato + " foi criado com sucesso");
                    }
                    else {
                        System.out.println("Candidato não encontrado! Crie o partido primeiro.");
                    }
                    break;

                case 3:

                    System.out.println("Digite o n´mero do candidato para votar: ");
                    int numeroVotoCandidato = scaner.nextInt();
                    sistema.votar(numeroVotoCandidato);
                    break;

                case 4:

                    sistema.exibirResultados();
                    break;

                case 5:

                    System.out.println("Saindo...");
                    scaner.close();

                default:
                    System.out.println("Opção inválida!!");
            }
        }
    }
}
