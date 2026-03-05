public class TesteSmarttTv {
    public static void main(String[] args) {
        // cria instancia de smarttv


        SmartTv s2 = new SmartTv("Samsung", "Qled 45 polg", 0);


        SmartTv s3 = new SmartTv("Copacabana", "Widescreen 65 polgd", 10);
        s3.aumentarVol(60);
        s3.abaixarVol(10);

    }
}
