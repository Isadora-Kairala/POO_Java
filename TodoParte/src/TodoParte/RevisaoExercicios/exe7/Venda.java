package TodoParte.RevisaoExercicios.exe7;

import java.util.ArrayList;
public class Venda {
    private Cliente clientinho;
    private ArrayList<ItemVenda> itemvendas;

    public Venda() {
    }

    public Venda(Cliente clientinho) {
        this.clientinho = clientinho;
        this.itemvendas = new ArrayList<>();
    }

    public Cliente getClientinho() {
        return clientinho;
    }

    public void setClientinho(Cliente clientinho) {
        this.clientinho = clientinho;
    }

    public ArrayList<ItemVenda> getItemvendas() {
        return itemvendas;
    }

    public void setItemvendas(ArrayList<ItemVenda> itemvendas) {
        this.itemvendas = itemvendas;
    }

    public void additem(ItemVenda item){
        itemvendas.add(item);
    }

    @Override
    public String toString() {
        return "Venda{" +
                "clientinho=" + clientinho +
                ", itemvendas=" + itemvendas +
                '}';
    }
}
