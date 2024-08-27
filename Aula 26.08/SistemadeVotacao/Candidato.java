public class Candidato implements Votavel {

    String nome;
    Partido partido;

    private int numero;
    private int voto;

    public Candidato (String nome, Partido partido, int numero){

        this.nome = nome;
        this.partido = partido;
        this.numero = numero;
        this.voto = 0;
    }

    @Override

    public void adicionarVoto(){

        this.voto ++;
        this.partido.adicionarVoto();

    }

    @Override

    public int getVoto(){
        return this.voto;
    }

    public String getNome() {
        return this.nome;
    }

    public Partido getPartido() {
        return this.partido;
    }

    public int getNumero() {
        return this.numero;
    }
}

