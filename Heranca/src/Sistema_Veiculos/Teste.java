package Sistema_Veiculos;

public class Teste {
    public static void main(String[] args) {

        Aviao a1 = new Aviao("Embraer", "Phenom ", 800, 9000);

        a1.mover();
        a1.abastecer();

        CarroEletrico c1 = new CarroEletrico("Airbus", "A320neo", 700, 5);

        c1.mover();
        c1.abastecer();

        Veiculo veiculo;
        veiculo = new Aviao("Boeing", "747", 950, 7000);
        veiculo.mover();


        veiculo = new CarroEletrico("Hawkner", "Siddeley trident", 800, 6);
        veiculo.abastecer();
    }
}
