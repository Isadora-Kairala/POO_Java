

public class DesenvolvedorJava {
    protected String nome, linguagem;
    protected float salarioBase;

    public DesenvolvedorJava() {
    }

    public DesenvolvedorJava(String nome, String linguagem, float salarioBase) {
        this.nome = nome;
        this.linguagem = linguagem;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override  // anulação de método
    public String toString() {
        return "DesenvolvedorJava{" +
                "nome='" + nome + '\'' +
                ", linguagem='" + linguagem + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}