package TodoParte.RevisaoExercicios.exe2;

import java.time.LocalDateTime;

public class Emprestimo {
    private LocalDateTime dataEmprestimo;
    private LocalDateTime dataDevolucaoPrevista;
    private Leitor leitor;
    private Livro livro;

    public Emprestimo(LocalDateTime dataEmprestimo, LocalDateTime dataDevolucaoPrevista, Leitor leitor, Livro livro) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.leitor = leitor;
        this.livro = livro;
    }

    public LocalDateTime getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDateTime getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public Livro getLivro() {
        return livro;
    }

    // 🔥 REGRA DO EXERCÍCIO
    @Override
    public String toString() {
        return "Empréstimo:\n" +
                "Leitor: " + leitor.getNome() + "\n" +
                "Livro: " + livro.getTitulo() + "\n" +
                "Data Empréstimo: " + dataEmprestimo + "\n" +
                "Devolução Prevista: " + dataDevolucaoPrevista;
    }
}