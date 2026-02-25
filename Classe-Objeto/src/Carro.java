public class Carro{
    // variáveis ou propriedades ou atributos
    public String marca, modelo; // String é um tipo de dado do tipo classe => Maiúsculo
    public float velocidade; //float é um tipo de dado primmitivo => Minúsculo
    public boolean motor;  // boolean é um tipo de dado primitivo

    //Metodo que converte o objeto em String
    public String toString(){
        //this representa o objeto que chama o metodo
        return " Marca: "  + this.marca +
                " Modelo: " + this.modelo +
                " Velocidade: " + this.velocidade +
                " Motor: " + this.motor;
    }
    
}