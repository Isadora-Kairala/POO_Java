package src;
public class Pleno extends DesenvolvedorJava {
    private int projetosEntregues;

    public Pleno() {
        super(); // construtor da superclasse
    }



    public Pleno(String nome, String linguagem, float salarioBase, int projetosEntregues) {
        super(nome, linguagem, salarioBase);
        this.projetosEntregues = projetosEntregues;

    }


    public int getProjetosEntregues() {
        return projetosEntregues;
    }

    public void setProjetosEntregues(int projetosEntregues) {
        this.projetosEntregues = projetosEntregues;
    }




    @Override
    public String toString() {
        return "Pleno{" +
                super.toString() +
                "projetos=" + projetosEntregues +
                '}';
    }

    @Override
    public void codar(){
        System.out.println("Pleno desenvolvendo e faendo code review");
    }

    @Override
    public float calcularBonus(){
        return super.calcularBonus() + this.salarioBase * 0.15f;
    }






}
