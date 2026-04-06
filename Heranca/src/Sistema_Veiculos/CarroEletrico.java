package Sistema_Veiculos;

public class CarroEletrico extends Veiculo {
    /*
    Classe Filha CarroEletrico:
Atributo próprio: autonomiaBateria (int).
Anule o método mover(): Deve imprimir "Carro elétrico movendo-se silenciosamente".
Anule o método abastecer(): Deve imprimir "Recarregando bateria em posto de carga rápida".
     */
    private int autonomiaBateria;



    public CarroEletrico(String marca, String modelo, float velocidade, int autonomiaBateria){
        super( marca,  modelo,velocidade);
        this.autonomiaBateria = autonomiaBateria;

    }

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }


    @Override
    public void mover(){
        System.out.println("Carro elétrico movendo-se silenciosamente.");
    }

    @Override
    public void abastecer(){
        System.out.println("Recarregando bateria em posto de carga rápida");
    }



}
