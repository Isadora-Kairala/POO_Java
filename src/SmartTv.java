public class SmartTv {
    private String marca, modelo;
    private int volume;

    public SmartTv(){

    }


    public void setMarca(String marca){
        this.marca = marca;

    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    //setter  get set => para variaavel privada
    //setter do volume
    public void setVolume(int volume){
        if (volume >= 0 && volume <= 100){
            this.volume = volume;
        }
        else System.out.println("Volume Invalido");
    }


    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }
    public int getVolume(){
        return this.volume;
    }



    //construtor
    public SmartTv(String marca, String modelo, int volume ){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume);
    }

}