import  java.util.ArrayList;
public class Biblioteca {

    private String nome;
    private ArrayList<Livro> livro;



    //contrutores ------------------------------------

    public Biblioteca(){

    }

    public Biblioteca(String nome){
        this.nome = nome;
        this.livro = new ArrayList<>();
    }



    //gettters and setters -----------------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Livro> getLivro() {
        return livro;
    }

    public void setLivro(ArrayList<Livro> livro) {
        this.livro = livro;
    }

    //métodos------------------------------

    public void adicionarLivro(String titulo, int numeroPaginas){
        Livro livrinho = new Livro(titulo, numeroPaginas);
        livro.add(livrinho);
    }




    // to string--------------------------------


    @Override
    public String toString() {
        return "Biblioteca{" +
                "nome='" + nome + '\'' +
                ", livro=" + livro +
                '}';
    }

}
