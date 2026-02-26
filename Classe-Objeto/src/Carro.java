public class Carro{
    // variáveis ou propriedades ou atributos

    public String marca, modelo;    // String é um tipo de dado do tipo classe => Maiúsculo
    public float velocidade;       //float é um tipo de dado primmitivo => Minúsculo
    public boolean motor;         // boolean é um tipo de dado primitivo

    //Metodo que converte o objeto em String
    public String toString(){
        //this representa o objeto que chama o metodo
        return " Marca: "  + this.marca +  //+ significa visibilidade publica
                " Modelo: " + this.modelo +
                " Velocidade: " + this.velocidade +
                " Motor: " + this.motor;
    }

    //=> Metodo Construtor:
    public Carro(String marca, String modelo, float velocidade, boolean motor){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.motor = motor;
    }





    //metodo ligar o carro
    public void ligar(){

        if (!this.motor) {
            this.motor = true;
            System.out.println("Motor Ligado");

        }
        else {
            System.out.println("carro já está ligado");
        }

    }

    //desligar carro
    public void desligar() {
        if (this.motor) {
            this.motor = false;
            System.out.println("Carro Desligado");

        }
    }

    public void acelerar(float x) {
        if (this.motor){

            this.velocidade += x;
            System.out.println("A velocidade do carro é:" + velocidade);
        }


    }

    public void frear(float y){
        if (this.motor && this.velocidade - y >= 0){
            this.velocidade -= y;
            System.out.println("Frear Velocidade:" + this.velocidade);
        }
        else System.out.println("nao freou irmao");


    }
}



