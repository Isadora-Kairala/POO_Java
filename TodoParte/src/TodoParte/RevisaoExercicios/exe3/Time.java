package TodoParte.RevisaoExercicios.exe3;

import java.util.ArrayList;

public class Time {
    private int id;
    private String nome;
    private String tecnico;
    private ArrayList<Atleta> atletas;

    public Time(int id, String nome, String tecnico) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
        this.atletas = new ArrayList<>();
    }

    // 🔥 REGRA DO EXERCÍCIO
    public void contratarAtleta(Atleta a) {
        atletas.add(a);
    }

    public ArrayList<Atleta> getAtletas() {
        return atletas;
    }
}