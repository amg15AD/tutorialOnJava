package tutorial;

public class Flower extends Plant{
    @Override
    public void grow() {
        System.out.println("Flower is blooming");
    }
    public void dyingFlower(){
        System.out.println("Flower petals falling");
    }
}
