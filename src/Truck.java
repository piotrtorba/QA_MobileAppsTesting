public class Truck implements Vehicle {

    @Override
    public void drive(int speed) {
        System.out.println("I'm driving truck with speed of: " + speed);

    }

    @Override
    public void stop() {
        System.out.println("Hamuje ciezarowka!");

    }

    @Override
    public String info() {
        return "Truck";
    }
    public void zatankuj() {
        System.out.println("Please refuel.");
    }
}
