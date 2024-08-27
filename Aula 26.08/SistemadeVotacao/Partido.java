public class Partido {

    private String nome;
    private int voto;

    public Partido(String nome){

        this.nome = nome;
        this.voto = 0;

    }

    public String getNome() {
        return nome;
    }

    public int getVoto() {
        return voto;
    }

    public void adicionarVoto(){
        this.voto ++;
    }
}
