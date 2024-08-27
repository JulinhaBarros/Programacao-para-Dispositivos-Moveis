import java.util.ArrayList;
import java.util.List;

public class SistemaVotacao {

    private List<Candidato> candidato;
    private List<Partido> partido;

    public SistemaVotacao(){

        this.candidato = new ArrayList<>();
        this.partido = new ArrayList<>();

    }
    public void adicionarPartido(Partido partido){

        this.partido.add(partido);

    }

    public void adicionarCandidato(Candidato candidato){
        this.candidato.add(candidato);
    }

    public Partido buscarartidosPorNome(String nome){
        for (Partido partido : partido){
            if (partido.getNome().equalsIgnoreCase(nome)){
                return partido;
            }
        }
        return null;
    }

   public void votar(int numeroCandidato){
        for (Candidato candidato : candidato){
            if (candidato.getNumero() == numeroCandidato){
                candidato.adicionarVoto();
                System.out.println("Voto registrado para: " + candidato.getNome() + " do partido " + candidato.getPartido().getNome());
            }
        }
       System.out.println("Candidato não encontrado!!");
   }

   public void exibirResultados(){
        if (candidato.isEmpty()){
            System.out.println("Nenhum candidato encontrado");
        }
        Candidato candidatoVencedor = candidato.get(0);
        Partido partidoVencedor = partido.get(0);

        for (Candidato candidato : candidato){
            if (candidato.getVoto() > candidatoVencedor.getVoto()){
                candidatoVencedor = candidato;
            }
        }

        for (Partido partido : partido){
            if (partido.getVoto() > partidoVencedor.getVoto()){
                partidoVencedor = partido;
            }
        }

       System.out.println("Candidato vencedor: " + candidatoVencedor.getNome());
       System.out.println("Partido vencedor: " + partidoVencedor.getNome());
   }
}
