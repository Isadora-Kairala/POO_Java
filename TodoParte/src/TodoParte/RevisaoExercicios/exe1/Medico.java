package TodoParte.RevisaoExercicios.exe1;

public class Medico {
    private String nome, especialidade;
    private int id;

    public Medico() {

    }

    public Medico(String nome, String especialidade, int id) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }



    public String getEspecialidade() {
        return especialidade;
    }



    public int getId() {
        return id;
    }


}
