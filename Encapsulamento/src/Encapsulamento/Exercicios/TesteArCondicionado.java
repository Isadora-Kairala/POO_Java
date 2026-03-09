package Encapsulamento.Exercicios;

public class TesteArCondicionado {
   public static void main(String[] args) {

        ArCondicionado  arcondicionado = new ArCondicionado("Mondial", "Flash Air", 28, true);


        arcondicionado.ativarModoTurbo();
        System.out.println(arcondicionado);

    }
}
