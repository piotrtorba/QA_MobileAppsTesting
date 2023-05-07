public class Bike implements Vehicle {
    @Override
    public void drive(int speed) {
        System.out.println("Jade rowerem i predkoscia: " + speed);

    }

    @Override
    public void stop() {
        System.out.println("Hamuje rowerem!");

    }

    @Override
    public String info() {
        return "Bicycle";
    }
}
