package TodoParte.RevisaoExercicios.exe4;

import java.util.ArrayList;

public class Turma {
    private int id;
    private String nomeTurma;
    private ArrayList<Aluno> listaAlunos;


    //------Contructors------------------------------------------------

    public Turma(){
        this.listaAlunos = new ArrayList<>();
    }


    public Turma(int id, String nomeTurma){
        this.id = id;
        this.nomeTurma = nomeTurma;
        this.listaAlunos = new ArrayList<>();
    }

    //---------getter and setters ---------------------------------------
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    //------toString---------------------------------------------------
    @Override
    public String toString() {
        return "Turma{" +
                "id=" + id +
                ", nomeTurma='" + nomeTurma + '\'' +
                ", listaAlunos=" + listaAlunos +
                '}';
    }

    //métodos---------------------

    //adiciona aluno na turma
    public void adicionaNalista(Aluno a){
        listaAlunos.add(a);
    }

    //listar alunos da turma
    public void listagemAlunos(){
        for (Aluno a : listaAlunos){
            System.out.println(a);
        }

    }


    //extra => mostrar alunos de curso específico
    public void alunosCurso(String curso){
        for (Aluno a : listaAlunos){
            if (a.getCurso().equals(curso)){
                System.out.println(a + " - " + curso);
            }
        }
    }


}
