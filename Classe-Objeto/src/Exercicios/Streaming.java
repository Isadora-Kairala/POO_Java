package Exercicios;

public class Streaming {

    public String usuario;
    public String plano;
    public float mensalidade;
    public boolean ativo;
    public String ulitmoFilmeAssistido;

    //construtor:
    public Streaming(String usuario, String plano){
        this.usuario = usuario;
        this.plano = plano;
        if (plano.equals("Básico")){
            this.mensalidade = 25.90f;
        }
        else if (plano.equals("Premium")){
            this.mensalidade = 45.90f;
        }
        else this.mensalidade = 60.90f;

        this.ativo = true;
        this.ulitmoFilmeAssistido = "";

    }

    public void assistirFilme(String nomeFilme){
        if (this.ativo){
            this.ulitmoFilmeAssistido = nomeFilme;
            System.out.println("Assistido: " + nomeFilme);
        }
        else System.out.println("Pagar Fatura");
    }


    public void cancelarAssinatura(){
        this.ativo = false;
    }
    public void paguei(){
        this.ativo = true;
    }

    public String toString(){

        String status;
        if (this.ativo){
            status = "Ativo";

        }
        else status = "Suspenso";


        return  "\nUsuário: " + this.usuario +
                "\nPlano: " + this.plano +
                "\nMensalidade: " + this.mensalidade +
                "\nStatus Conta: " + status +
                "\nUltimo filme assistido: " + this.ulitmoFilmeAssistido;



    }

}
