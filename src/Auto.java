public class Auto {
    public String marka;
    public String model;
    public int rocznik;
    public int przebieg;

    public Auto (String make, String model, int pYear, int milage) {
        this.marka = make;
        this.model = model;
        this.rocznik = pYear;
        this.przebieg = milage;
    }

    /*public void jedz() {
        System.out.println("Jedz");
    }
    public void hamuj() {
        System.out.println("Hamowanie");
    }*/
    public void info() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rocznik: " + rocznik);
        System.out.println("Przebieg: " + przebieg + "\n");
    }
}
