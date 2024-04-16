package tutorial;

public class Fruit {
    private String name;
    private double price;
    private int qty;

    private static int count = 1;
    private int id;

    public double getPrice() {
        return price;
    }
    public int getQty(){
        return qty;
    }

    public Fruit(String name, double price , int qty){
        this.name = name;
        this.price = price;
        this.qty = qty;
        id = count;
        count++;
    }

    public void printInfo(){
        System.out.println("Your " + name + " :" + id + " each cost $" + price);
    }
    public double printTotalPerQty(){
        double totalPerCost = price * qty;
        return totalPerCost;
    }



}
