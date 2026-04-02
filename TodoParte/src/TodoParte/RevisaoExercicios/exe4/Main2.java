package TodoParte.RevisaoExercicios.exe4;

public class Main2 {
    public static void main(String[] args) {

        Turma turminha = new Turma(123, "3 semestre");

        Aluno aluno1 = new Aluno(123, "Flávia", "Ciências Computacion");
        Aluno aluno2 = new Aluno(124, "João", "Sistemas Infomacion");

        turminha.adicionaNalista(aluno1);
        turminha.adicionaNalista(aluno2);

        turminha.listagemAlunos();

        turminha.alunosCurso("Ciências Computacion");





    }
}
