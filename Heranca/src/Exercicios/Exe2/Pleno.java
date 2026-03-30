package Exercicios.Exe2;

public class Pleno extends Desenvolvedor {

    public Pleno(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void codar() {
        System.out.println("Pleno codando com autonomia...");
    }

    @Override
    public double calcularBonus() {
        return salario * 0.10;
    }
}