package Exercicios.Exe2;

public class Desenvolvedor {
    protected String nome;
    protected double salario;

    public Desenvolvedor(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void codar() {
        System.out.println("Desenvolvedor está codando...");
    }

    public double calcularBonus() {
        return salario * 0.10;
    }

    @Override
    public String toString() {
        return "Desenvolvedor: " + nome + " | Salário: " + salario;
    }
}