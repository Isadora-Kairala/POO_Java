package Exercicios.Exe1;

public class Main {
    public static void main(String[] args) {

        Aviao aviao = new Aviao("Boeing", "747", 900, 12000);
        CarroEletrico carro = new CarroEletrico("Tesla", "Model S", 120, 500);

        Veiculo veiculo;

        // Apontando para Aviao
        veiculo = aviao;
        veiculo.mover();

        // Apontando para Carro Eletrico
        veiculo = carro;
        veiculo.mover();
    }
}