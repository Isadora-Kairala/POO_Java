public class CartaoCredito implements Pagamento {


    @Override
    public void autorizar(double valor) {
    System.out.println("Verificando o limite do cartao");
    System.out.println("Pagamento do valor" + valor + " foi autorizado");

    }

    @Override
    public void exibirComprovante() {

        System.out.println("Comprovante foi enviado para o seu email");
    }
}
