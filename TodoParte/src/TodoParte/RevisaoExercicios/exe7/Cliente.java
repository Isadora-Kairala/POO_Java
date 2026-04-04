package TodoParte.RevisaoExercicios.exe7;

public class Cliente {
    private int id;
    private String nome;


    //Constructors

    public Cliente(){

    }

    public Cliente(int id, String nome){
        this.id = id;
        this.nome= nome;
    }

    // GETTERS and SETTERS

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }
    public void setId(int id) {
        this.id = id;

    }
    public void setNome(String nome){
        this.nome = nome;
    }


    // toString(_


    @Override
    public String toString() {
        return "\nCliente:" +
                "\nid: " + id +
                "\nnome: " + nome + '\'' +
                ':';
    }
}

