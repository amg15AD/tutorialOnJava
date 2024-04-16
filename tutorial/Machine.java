package tutorial;

public class Machine implements Info{
    private int id = 10;

    public void start(){
        System.out.println("Machine started.");
    }
    public void stop(){
        System.out.println("Machine stopped.");
    }

    @Override
    public void showInfo() {
        System.out.println(id);
    }
}
