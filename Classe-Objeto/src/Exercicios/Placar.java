package Exercicios;

public class Placar {

    public String nomeTimeCasa;
    public String nomeTimeVisitante;
    public int pontosCasa;
    public int pontosVisitante;
    public int periodoQuarto = 0;
    public int quarto;

    //contrutor:
    public Placar(String nomeTimeCasa, String nomeTimeVisitante){
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;

    }

    public void registrarPonto(String time, int tipo){

        if(time.equals(this.nomeTimeCasa)){
            this.pontosCasa +=  tipo;

        }
        else this.pontosVisitante += tipo;


        String status;
        if (tipo == 1) {
            status = "Lance livre";

        }
        else if (tipo == 2){
            status = "Cesta normal";
        }
        else if (tipo == 3){
            status = "Cesta de três";
        }
        else status = " ";



        if(tipo == 4){
          this.periodoQuarto++;
        }


        System.out.println(time + " Pontuou: " + tipo + "-" + status);

    }

    public void proxQuarto(){
        if(this.periodoQuarto > 0){
            System.out.println("Jogo Acabou");
        }
    }

    public String toString(){

    return  "TIME CASA " + this.pontosCasa + " X " + this.pontosVisitante + " TIME VISITANTE - Período: "  + this.periodoQuarto;
    }

}
