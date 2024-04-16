package tutorial;

public class Plant {
    private String name;
    public String getDate(){
        String data = "Some data " + calculateGrowth();
        return data;
    }
    private int calculateGrowth(){
        return 9;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void grow(){
        System.out.println( "plants are growing");
    }
}
