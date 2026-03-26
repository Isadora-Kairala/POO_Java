package src;
public class Senior extends DesenvolvedorJava {
    private float verbalider;


    public Senior(){
        super();
    }

    public Senior(String nome, String linguagem, float salarioBase, float verbalider){
        super(nome, linguagem, salarioBase);
        this.verbalider = verbalider;

    }

    public float getVerbalider() {
        return verbalider;
    }

    public void setVerbalider(float verbalider) {
        this.verbalider = verbalider;
    }

    @Override
    public String toString() {
        return "Senior{" +
                super.toString() +
                "Verbalíder=" + verbalider +
                '}';
    }
    @Override
    public void codar(){
        System.out.println("Sênior definido a arquitetura do software e liderado pessoas");
    }

    @Override
    public float calcularBonus(){
        return super.calcularBonus() + this.salarioBase * 0.30f;
    }


}

