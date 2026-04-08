public class Pix implements Pagamento {
    @Override
    public void autorizar(double valor) {

        System.out.println("Gernado QR code para a chave pix");
        System.out.println("Pagamento no valor: " + valor + " foi enviado instanteneamente");
    }

    @Override
    public void exibirComprovante() {
        System.out.println("Comprovante disponivel no app do banco");

    }

}
