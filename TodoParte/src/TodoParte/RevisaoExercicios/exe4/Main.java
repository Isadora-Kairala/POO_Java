package TodoParte.RevisaoExercicios.exe4;

public class Main {
    public  void main() {
        Projeto projeto = new Projeto(1, "Sistema Web");

        Programador p1 = new Programador("Ana", "Java", 1);
        Programador p2 = new Programador("Carlos", "JavaScript", 2);

        projeto.adicionarrProgramador(p1);
        projeto.adicionarrProgramador(p2);

        projeto.listarProgramadores();
    }
}
