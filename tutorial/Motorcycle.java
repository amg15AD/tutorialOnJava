package tutorial;

public class Motorcycle extends Machine{
    public void preformTrick(){
        System.out.println("Hit a sickass wheely");
    }
    @Override
    public void start() {
        System.out.println("Motorcycle started ");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle has stopped");
    }
}
