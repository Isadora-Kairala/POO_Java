package TodoParte.RevisaoExercicios.exe4;


public class Aluno {
    private int id;
    private String nome, curso;

    //-----Construtores-----------

    public Aluno(){

    }



    public Aluno(int id, String nome, String curso){
        this.id = id;
        this.nome = nome;
        this.curso = curso;
    }

    //----GEtters and Setters-------


    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }
    public String getCurso(){
        return curso;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }
}
