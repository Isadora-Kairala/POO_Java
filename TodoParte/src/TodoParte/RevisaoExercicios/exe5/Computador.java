package TodoParte.RevisaoExercicios.exe5;

public class Computador {
    private int id;
    private String marca;
    private Processador processador; // composição atributo processador <<<<<<<<<


    public Computador(){

    }

    public Computador(String marca, int id, String marcaproc, String modeloproc, int frequenciaproc){
        this.marca = marca;
        this.id = id;

        // COMPOSIÇÃO: o Processador é criado aqui dentro, pertence ao Computador
        this.processador = new Processador(marcaproc,  modeloproc,  frequenciaproc);
    }

    public String getMarca(){
        return marca;
    }

    public int getId(){
        return id;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setId(int id){
        this.id = id;
    }




    public Processador getProcessador(){
        return processador;
    }




    @Override
    public String toString() {
        return "Computador{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", processador=" + processador +
                '}';
    }
}
