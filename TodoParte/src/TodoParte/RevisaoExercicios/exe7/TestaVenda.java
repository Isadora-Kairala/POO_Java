package TodoParte.RevisaoExercicios.exe7;

import javax.print.attribute.standard.PrinterState;

public class TestaVenda {
    static void main(String[] args) {
        Cliente cli1 = new Cliente(1, "Dodora");

        Produto p1 = new Produto(123, "Arroiz", 25.98f);
        Produto p2 = new Produto(124, "feijonis", 13.0f);


        Venda venda = new Venda(cli1);

        ItemVenda item1 = new ItemVenda(1, 2, p1);
        ItemVenda item2 = new ItemVenda(2, 3, p2);

        venda.additem(item1);
        venda.additem(item2);


        System.out.println(venda);







    }
}
