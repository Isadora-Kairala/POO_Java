package Exercicios;

public class TestePlacar {
    public static void main(String[] args){

        Placar placar = new Placar("FACEF", "FDF");
        placar.registrarPonto("FACEF", 2);
        placar.registrarPonto("FDF", 1);
        placar.registrarPonto("FACEF", 4);
        placar.proxQuarto();
        System.out.println(placar);




    }
}
