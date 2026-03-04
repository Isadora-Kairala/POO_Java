public class TesteSmarttTv {
    public static void main(String[] args) {
        // cria instancia de smarttv
        SmartTv s1 = new SmartTv();
        s1.setVolume(-40);
        s1.setVolume(130);
        s1.setVolume(50);

        System.out.println("Volume de s1: " + s1.getVolume());

        SmartTv s2 = new SmartTv("Samsung", "Qled 45 polg", 0);

        SmartTv s3 = new SmartTv("LG", "widescreen 65 polgd", -30);

    }
}
