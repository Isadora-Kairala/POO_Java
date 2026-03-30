package Exercicios.Exe2;

public class Senior extends Desenvolvedor {

    public Senior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void codar() {
        System.out.println("Senior arquitetando e codando...");
    }

    @Override
    public double calcularBonus() {
        return salario * 0.20;
    }
}