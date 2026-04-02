package TodoParte.RevisaoExercicios.exe4;
import java.util.ArrayList;

public class Projeto {
    private String nomeProjeto;
    private int id;
    private ArrayList<Programador> programadores;


    public Projeto() {
        this.programadores = new ArrayList<>();
    }

    public Projeto( int id, String nomeProjeto) {

        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.programadores = programadores;
    }

    //---------------------------------
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }
    //-------------------------------------------------

    //métodos

    public void adicionarrProgramador(Programador p){
        programadores.add(p);
    }

    public void listarProgramadores(){
        for (Programador p : programadores){  // pra todo  Programador p em programadores (lista)
            System.out.println(p);
        }
    }



}
