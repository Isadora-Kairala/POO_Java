package Exercicios;


public class TesteStreaming {
    public static void main(String[] args) {

        Streaming streaming = new Streaming("joaquina", "Premium");
        streaming.assistirFilme("Kung fu Panda");
        streaming.paguei();
        System.out.println(streaming);


    }

}
