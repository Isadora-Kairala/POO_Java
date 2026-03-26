package classe_associacao;

public class Passageiro {
    private String noe, cpf;
    //pq


    public Passageiro() {

    }

    public Passageiro(String cpf, String noe) {
        this.cpf = cpf;
        this.noe = noe;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNoe(String noe) {
        this.noe = noe;
    }

    public String getNoe() {
        return noe;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Passageiro{" +
                "noe='" + noe + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';

    }


}
