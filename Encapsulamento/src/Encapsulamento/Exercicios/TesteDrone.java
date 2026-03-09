package Encapsulamento.Exercicios;

public class TesteDrone {
    static void main(String[] args) {

        Drone drone = new Drone("Avião", 25, 54, false);

        drone.decolar();
        drone.subir(10);



    }
}
