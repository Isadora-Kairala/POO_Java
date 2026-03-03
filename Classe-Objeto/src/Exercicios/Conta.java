package Exercicios;


public class Conta {

    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

    //construtor:
    public Conta(int numeroConta, int agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;

    }

    public void depositar(float x){
        if (this.status){
            this.saldo += x;
            System.out.println("O saldo agora é:" + this.saldo);
        }
    }

    public void sacar(float y){
        if (this.status && this.saldo >= y){
            this.saldo -= y;
            System.out.println("Saque realizado!");
        }
        else System.out.println("Saldo insuficiente ou conta inativa");
    }

    public void encerrarConta(){
        if (this.saldo == 0){
            this.status = false;
            System.out.println("Conta Encerrada");
        }
        else System.out.println("Ainda tem dindin na sua conta, deseja mesmo encerrar?");
    }

    public String toString(){

        return  "Número: " + this.numeroConta +
                "Agência: " + this.agencia +
                "Cliente: " + this.nomeCliente +
                "Saldo Atual: " + this.saldo +
                "Status: " + this.status;
    }


}

