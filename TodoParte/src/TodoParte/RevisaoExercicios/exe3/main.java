package TodoParte.RevisaoExercicios.exe3;

public class main {
    public static void main(String[] args) {


        Atleta atleta1 = new Atleta(1, "Lucas", "Armador");
        Time time = new Time(1, "Franca Basquete", "Helinho");
        time.contratarAtleta(atleta1);

        System.out.println("Atleta antes de apagar o time: " + atleta1.getNome());

        time = null;

        System.out.println("Atleta depois de apagar o time: " + atleta1.getNome());
    }
}
