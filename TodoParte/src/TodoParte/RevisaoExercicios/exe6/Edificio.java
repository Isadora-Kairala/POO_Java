package TodoParte.RevisaoExercicios.exe6;

import java.util.ArrayList;

public class Edificio {
    private String nome, endereco;
    private ArrayList<Apartamento> apartamento;


    public Edificio(ArrayList<Apartamento> apartamento) {
        this.apartamento = apartamento;
    }

    public Edificio(String nome, String endereco, ArrayList<Apartamento> apartamento) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamento= new ArrayList<>();

    }

    public String getNome(){
        return nome;
    }
    public String getEndereco(){
        return endereco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }


    public void contruirApe(int numero, int andar){
        Apartamento ap = new Apartamento(numero, andar); // cria o apartamento
        apartamento.add(ap);
    }



    @Override
    public String toString() {
        return "Edificio{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", apartamento=" + apartamento +
                '}';
    }
}

