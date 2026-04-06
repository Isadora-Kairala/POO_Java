package Sistema_Veiculos;

public class Veiculo {

    private String marca, modelo;
    private float velocidade;

    //constructor

    public Veiculo(){

    }

    public Veiculo(String marca, String modelo, float velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }



    // GEtter and Setters
    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public float getVelocidade(){
        return velocidade;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setVelocidade(float velocidade){
        this.velocidade = velocidade;
    }


    //MÉTODOS--------------------------------------
    public void mover(){
        System.out.println("Veículo se movendo...");
    }

    public void abastecer(){
        System.out.println("Veículo reabastecendo");
    }



    //toString()
    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}
