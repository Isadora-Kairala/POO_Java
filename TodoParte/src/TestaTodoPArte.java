import java.util.Date;

public class TestaTodoPArte {
    public static void main(String[] args) {

        //cria um objeto de classe independente
        Cliente cl1 = new Cliente();
        Cliente cl2 = new Cliente(1, "josé", "1234", "rua das flores");

        //cria obj - todo
        Pedido pd1 = new Pedido(10, new Date(), cl2);
        System.out.println(pd1.toString());




    }   
}
