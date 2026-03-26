package classe_associacao;

import java.time.LocalDateTime;

public class TestaAgencia {
    public static void main(String[] args) {
        Passageiro pas1 = new Passageiro("123", "Fulano");
        System.out.println(pas1.toString());

        LocalDateTime data = LocalDateTime.of(2026, 4,18, 8, 15 );
        Voo vo1 = new Voo(777, "ribeiras", "Brasília", data);
        System.out.println(vo1.toString());
    }
}
