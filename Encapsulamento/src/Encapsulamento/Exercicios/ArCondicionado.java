package Encapsulamento.Exercicios;

public class ArCondicionado {
    private String marca, modelo;
    private int temp;
    private boolean on;

    //SETS
    public void setMarca(String marca){
        if (marca.length() >= 3 ){
            this.marca = marca;
        }
        else System.out.println("Não foi possível inserir a marca !");
    }

    public void setTemp(int temp){
        if (temp >= 16 && temp <=30){
            this.temp = temp;
        }
        else System.out.println("Temperatura fora da faixa!");
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setOn(boolean on){
        this.on = on;
    }

    //GETS
    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getTemp(){
        return this.temp;
    }

    public boolean getOn(){
        return this.on;
    }


    //construtor

    public ArCondicionado(){

    }

    public ArCondicionado(String marca, String modelo, int temp, boolean on){
        this.marca = marca;
        this.modelo = modelo;
        this.temp = temp;
        this.on = on;
    }


    private boolean verificarCompresssor(){
        int randomico = (int) (Math.random()* 10);
        if (randomico > 2){
            System.out.println("Ok");
            return true;
        }
        else {
            System.out.println("Falha");
            return false;
        }

    }

    public void ativarModoTurbo(){
        if (verificarCompresssor()){
            setTemp(16);
            System.out.println("Modo Turbo On");
        }
        else System.out.println("Falha em ativar o modo turbo");
    }

    public String toString(){
        return  "\nMarca: " + this.marca +
                "\nModelo: "  + this.modelo +
                "\nTemperatura: " + this.temp +
                "\nOn/Off: " + this.on;
    }

}
