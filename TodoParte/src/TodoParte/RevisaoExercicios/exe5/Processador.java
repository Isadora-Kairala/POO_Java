package TodoParte.RevisaoExercicios.exe5;

public class Processador {
    private String marcaproc, modeloproc;
    private int frequenciaproc;


    public Processador(){

    }

    public Processador(String marcaproc, String modeloproc, int frequenciaproc) {
        this.marcaproc = marcaproc;
        this.modeloproc = modeloproc;
        this.frequenciaproc = frequenciaproc;
    }


    public String getMarcaproc() {  // getter — permite ler a marca de fora da classe

        return marcaproc;
    }

    public void setMarcaproc(String marcaproc) {// setter — permite alterar a marca de fora da classe
        this.marcaproc = marcaproc;
    }

    public String getModeloproc() {
        return modeloproc;
    }

    public void setModeloproc(String modeloproc) {
        this.modeloproc = modeloproc;
    }

    public int getFrequenciaproc() {
        return frequenciaproc;
    }

    public void setFrequenciaproc(int frequenciaproc) {
        this.frequenciaproc = frequenciaproc;
    }

    @Override
    public String toString() {
        return "Processador{" +
                "marcaproc='" + marcaproc + '\'' +
                ", modeloproc='" + modeloproc + '\'' +
                ", frequenciaproc=" + frequenciaproc +
                '}';
    }
}
