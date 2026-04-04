package TodoParte.RevisaoExercicios.exe8;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sessao {
    private int id, sala;
    private LocalDateTime horario;
    private Filme filminho;
    private ArrayList<Ingresso> ingressos;


    public Sessao() {
    }

    public Sessao(int id, int sala, LocalDateTime horario) {
        this.id = id;
        this.sala = sala;
        this.horario = horario;
        this.ingressos = new ArrayList<>();

    }

    public ArrayList<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(ArrayList<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public void vincularFilme(Filme f){

        this.filminho= f;
    }

    public void venderIngresso(int id, String assento, String tipo, float preco){
        Ingresso  ingresso = new Ingresso(id, assento, tipo, preco);
        ingressos.add(ingresso);


    }



    @Override
    public String toString() {
        return "\nSessao: " +
                "\nid:" + id +
                "\nsala: " + sala +
                "\nhorario: " + horario +
                "\nfilme: " + filminho +
                "\ningressos: " + ingressos +
                ' ';
    }
}
