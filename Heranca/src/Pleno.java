public class Pleno extends DesenvolvedorJava {
    private int projetosEntregues;

    public Pleno() {
        super(); // construtor da superclasse
    }


    public Pleno(String nome, String linguagem, float salarioBase) {
        super(nome, linguagem, salarioBase);
        this.projetosEntregues = projetosEntregues;

    }

    public int getProjetosEntregues() {
        return projetosEntregues;
    }

    public void setProjetosEntregues(int projetosEntregues) {
        this.projetosEntregues = projetosEntregues;
    }
}
