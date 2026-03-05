public class SmartTv {
    private String marca, modelo;
    private int volume;
    private boolean conectadaInternet;


    public SmartTv(){

    }


    //SETS---------------------------------------------
    public void setMarca(String marca){
        if (marca.length() <= 30){
            this.marca = marca;
        }
        else System.out.println("Marca Inválida");

        //pergunta de prova, length é instancia ou classe?
        //se é letra minuscula é objeto ai é instancia , se fosse classe seria por exemplo String.length



    }

    public void setModelo(String modelo){
        //todo modelo tem que inicair com letra maiscula
        char primeiro = modelo.charAt(0);
        boolean resp = Character.isUpperCase(primeiro);
        if (resp){
            this.modelo = modelo;
        }
        else System.out.println("Modelo Inválido");

    }
    //setter  get set => para variaavel privada
    //setter do volume


    public void setVolume(int volume){
        if (volume >= 0 && volume <= 100){
            this.volume = volume;
        }
        else System.out.println("Volume Invalido");
    }


    public void setConectadaInternet(boolean conectadaInternet){
        this.conectadaInternet = conectadaInternet;
    }



    //GETS ------------------------------------------------------
    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getVolume(){
        return this.volume;
    }

    public boolean isConectadaInternet(){
        return this.conectadaInternet;
    }

    //abrir youtube
    public void abrirYoutube(){
        //conectar-se na
        if(this.conectadaInternet()){
            System.out.println("Abrindo Youtube");
        }
        else System.out.println("Youtube não pôde ser aberto, sem internet");

}

    private boolean conectadaInternet(){
        System.out.println("Buscando sinal de wi-fi...");
        System.out.println("Verificando credenciais...");
        System.out.println("Autenticando IP no Roteador...");
        //50% de chance de conectar e 50% de chance  de nao conectar
        int randomico = (int) (Math.random()* 10);
        if (randomico < 5){
            System.out.println("Conectou na Internet");
            return true;
        }
        else {
            System.out.println("Problema na conexão");
            return false;
        }

    }



    //construtor
    public SmartTv(String marca, String modelo, int volume ){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume);
        this.conectadaInternet = false;

    }

    //aumentar o volume
    public void aumentarVol(int x){

        setVolume(this.volume + x);
        System.out.println(this.volume);;

    }

    //diminuir o volume
    public void abaixarVol(int y){

        setVolume(this.volume - y);
        System.out.println(this.volume);;
    }

    //métodos encapsulados, é possivel encapsular variavel e método tmbbbb!!!

}