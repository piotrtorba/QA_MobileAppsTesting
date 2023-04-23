public class AutoTest {
    public static void main(String[] args) {
        Auto nissan = new Auto();
        nissan.marka = "Nissan";
        nissan.model = "Skyline GT-R, R34";
        nissan.rocznik = 1999;
        nissan.przebieg = 10000;

        nissan.jedz();
        nissan.hamuj();
        nissan.info();

        Auto toyota = new Auto();
        toyota.marka = "Toyota";
        toyota.model = "Supra";
        toyota.rocznik = 1999;
        toyota.przebieg = 10000;

        toyota.info();
    }
}
