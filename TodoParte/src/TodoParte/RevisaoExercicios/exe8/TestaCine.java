package TodoParte.RevisaoExercicios.exe8;

import java.time.LocalDateTime;

public class TestaCine {
    static void main(String[] args) {

        Filme f1 = new Filme(1, 125, "Batman", "Ação");
        Filme f2 = new Filme(2, 150, "Duna", "Ficção");


        //parametro locadatetime : Ano, mes, dia. hora, minuto
        LocalDateTime horario = LocalDateTime.of(2026,7,20,20,0);

        Sessao s1 = new Sessao(1, 1, horario);

        s1.vincularFilme(f1);

        s1.venderIngresso(1, "A1", "Meia", 31.0f);
        s1.venderIngresso(2, "A2", "Inteira", 52.0f );


        System.out.println(s1);








    }
}
