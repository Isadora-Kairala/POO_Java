package TodoParte.RevisaoExercicios.exe7;


public class ItemVenda {
    private int id, quant;
    private Produto produto;// Associação entre Classes nesse caso => Agregação





    public ItemVenda() {

    }

    public ItemVenda(int id, int quant, Produto produto) {
        this.id = id;
        this.quant = quant;
        this.produto = produto;
    }

    public Produto getProduto(){
        return produto;
    }

    public int getId() {
        return id;
    }


    public void setProduto(Produto produto){
        this.produto = produto;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getQuant() {
        return quant;
    }



    public void setQuant(int quant) {
        this.quant = quant;
    }





    @Override
    public String toString() {
        return "\nItemVenda: " +
                "\nid: " + id +
                "\nquantidade: " + quant +
                ' ';
    }
}
