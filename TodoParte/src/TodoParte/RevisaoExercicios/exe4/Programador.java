package TodoParte.RevisaoExercicios.exe4;

public class Programador {

    private String nome, linguagemPrincipal;
    private int id;


    //-------------------------------------------------
    public Programador() {
    }


    public Programador(String nome, String linguagemPrincipal, int id){
        this.nome = nome;
        this.linguagemPrincipal = linguagemPrincipal;
        this.id = id;

    }

    //-------------------------------------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //-------------------------------------------------

    @Override
    public String toString() {
        return "Programador{" +
                "nome='" + nome + '\'' +
                ", linguagemPrincipal='" + linguagemPrincipal + '\'' +
                ", id=" + id +
                '}';
    }
}
