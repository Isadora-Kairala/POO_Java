package TodoParte.RevisaoExercicios.exe8;

public class Filme {
    private int id, duracao;
    private String titulo, genero;

    public Filme(){

    }

    public Filme(int id, int duracao, String titulo, String genero) {
        this.id = id;
        this.duracao = duracao;
        this.titulo = titulo;
        this.genero = genero;
    }

    public int getId(){
        return id;
    }

    public int getDuracao(){
        return duracao;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getGenero(){
        return genero;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }


    @Override
    public String toString() {
        return "\nFilme: " +
                "\nid: " + id +
                "\nduracao: " + duracao +
                "\ntitulo: " + titulo + '\'' +
                "\ngenero: " + genero + '\'' +
                ' ';
    }
}
