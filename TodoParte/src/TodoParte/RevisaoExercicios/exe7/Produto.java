package TodoParte.RevisaoExercicios.exe7;

public class Produto {
    private int id;
    private String nome;
    private float preco;




    //Constructors


    public Produto() {
    }

    public Produto(int id, String nome, float preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    //GET e SET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }



    // toString()
    @Override
    public String toString() {
        return "\nProduto: " +
                "\nid: " + id +
                "\nnome: " + nome + '\'' +
                "\npreco: " + preco +
                ' ';
    }
}
