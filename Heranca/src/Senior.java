public class Senior extends DesenvolvedorJava {
    private float verbalider;


    public Senior(){
        super();
    }

    public Senior(String nome, String linguagem, float salarioBase){
        super(nome, linguagem, salarioBase);
        this.verbalider = verbalider;

    }

    public float getVerbalider() {
        return verbalider;
    }

    public void setVerbalider(float verbalider) {
        this.verbalider = verbalider;
    }
}
