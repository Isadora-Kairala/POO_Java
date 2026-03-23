package TodoParte.RevisaoExercicios.exe1;

public class Paciente {
    private String nome, cpf;
    private int id;


    public Paciente(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }


}



