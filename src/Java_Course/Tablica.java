package Java_Course;

public class Tablica {
    public static void main(String[] args) {
        String[] imiona = new String[3];
        imiona[0] = "Ania";
        imiona[1] = "Basia";
        imiona[2] = "Waldek";

        System.out.println("Imie trzeciej osoby to: " + imiona[2]);

        System.out.println("Wylosowane liczby to:");
        int[] lottoNumber = new int [] {1,2,3,4};
        for (int num=0; num<lottoNumber.length; num++) {
            System.out.println(lottoNumber[num]);
        }
    }
}
