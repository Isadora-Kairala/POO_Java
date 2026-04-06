
public class Junior extends DesenvolvedorJava {

    private String mentor;

    public Junior(){
        super(); // construtor da superclasse
    }

    public Junior(String nome, String linguagem, float salarioBase, String mentor){
        super(nome, linguagem, salarioBase);
        this.mentor = mentor;
    }

    @Override // anulação de metodo
    public void codar(){
        System.out.println("Junior Desenvolvendo codigo com mentora de " + this.mentor);
    }

    @Override
    public String toString() {
        return "Junior{" +
               super.toString() +
                ", mentor='" + mentor + '\'' +
                '}';
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }


}

