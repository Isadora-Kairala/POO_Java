package Exercicios.Exe2;

public class TestaVetorPolimorfico {
    public static void main(String[] args) {

        Desenvolvedor[] devs = new Desenvolvedor[4];

        devs[0] = new Junior("Ana", 3000);
        devs[1] = new Pleno("Bruno", 5000);
        devs[2] = new Senior("Carlos", 8000);
        devs[3] = new Desenvolvedor("Dev Genérico", 4000);

        for (Desenvolvedor dev : devs) {
            dev.codar();
            System.out.println("Bônus: " + dev.calcularBonus());
            System.out.println(dev.toString());
            System.out.println("----------------------");
        }
    }
}