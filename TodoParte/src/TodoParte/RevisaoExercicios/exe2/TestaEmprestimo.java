package TodoParte.RevisaoExercicios.exe2;
import java.time.LocalDateTime;
public class TestaEmprestimo {
    public static void main(String[] args) {

        // Criando leitor
        Leitor leitor = new Leitor(1, "Carlos");

        // Criando livro
        Livro livro = new Livro(1, "Dom Casmurro", "Machado de Assis");

        // Datas
        LocalDateTime dataEmprestimo = LocalDateTime.now();
        LocalDateTime dataDevolucao = dataEmprestimo.plusDays(7);

        // Criando empréstimo
        Emprestimo emprestimo = new Emprestimo(dataEmprestimo, dataDevolucao, leitor, livro);

        // Exibindo usando toString()
        System.out.println(emprestimo);
    }
}
