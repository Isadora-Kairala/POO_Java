package Encapsulamento.Exercicios;

public class Drone {
    private String cod;
    private float altura;
    private int bateria;
    private boolean emVoo;
    public Drone(){

    }
    public Drone(String cod, float altura,int bateria, boolean emVoo  ){
        this.cod = cod;
        this.altura = altura;
        this.emVoo = emVoo;
        this.bateria = bateria;

    }

    //Encapsulamento

    //SETS
    public void setCod(String cod){
        this.cod = cod;
    }

    public void setAltura(float a){
        if (a > 0 && a < 120){
            this.altura = a ;
        }
        else System.out.println("Altura Inválida");
    }

    public void setBateria(int b){
        if (b >= 0 && b <= 100){
            this.bateria = b;
        }
        else System.out.println("Bateria Inválida");
    }

    public void setEmVoo(boolean voo){
        this.emVoo = voo;
    }

    //GETS
    public String getCod(){
        return this.cod;
    }
    public float getAltura(){
        return this.altura;
    }
    public int getBateria(){
        return this.bateria;
    }
    public boolean getEmVoo(){
        return this.emVoo;
    }


    private String testarMotores(){
        System.out.println("Testando Hélices...");
        System.out.println("Verificando Motor...");
        System.out.println("Calibrando GPS...");

        int randomico = (int) (Math.random()* 10);
        if (randomico < 8 ){
            return "Pronto";
        }
        else return "Falha";


    }
    public void decolar(){
        if(this.bateria > 20){
            if(testarMotores() == "Pronto"){
                this.emVoo = true;
                this.altura = 2;
                System.out.println("Decolando......");
            }
            else {System.out.println("Falha no voo");}
        }
        else System.out.println("Erro para decolar");


    }

    public void subir(float x){
        float novaAltura = getAltura() + x;
        setAltura(novaAltura);
    }


    public String toString(){
        return "\nCódigo: " + this.cod +
                "\nAltura: " + this.altura +
                "\nBateria: " + this.bateria +
                "\nVoo: " + this.emVoo;


    }

}
