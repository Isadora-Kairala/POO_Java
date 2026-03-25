public class Junior extends DesenvolvedorJava {

    private String mentor;

    public Junior(){
        super(); // construtor da superclasse
    }

    public Junior(String nome, String linguagem, float salarioBase){
        super(nome, linguagem, salarioBase);
        this.mentor = mentor;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }
}

