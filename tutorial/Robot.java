package tutorial;

public class Robot {
    private String name;
    int robotID;

    public Robot(String name){
        this.name = name;
        System.out.println("In first constructor");
    }
    public Robot(String name, int robotID){
        this.name = name;
        this.robotID = robotID;
        System.out.println("In second constructor");
    }
    void talk(String text){
        System.out.println(text);
    }

}
