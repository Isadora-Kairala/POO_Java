package Exercicios;

public class TesteConta {

    public static void main(String[] args) {

        // Criando conta c1
        Conta c1 = new Conta(1, 123, "João Silva");

        // Depósito de 500
        c1.depositar(500);

        // Saque de 200
        c1.sacar(200);

        // Imprime estado da conta
        System.out.println(c1);

        System.out.println("--------------------");

        // Criando conta c2
        Conta c2 = new Conta(2, 123, "Maria Souza");

        // Tentando sacar 50 sem saldo
        c2.sacar(50);

        System.out.println("--------------------");

        // Tentando encerrar c1 com saldo
        c1.encerrarConta();

        System.out.println("--------------------");

        // Sacando restante do dinheiro
        c1.sacar(300);

        // Encerrando conta
        c1.encerrarConta();

        // Imprimindo dados finais
        System.out.println(c1);

    }

}