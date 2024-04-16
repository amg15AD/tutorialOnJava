package tutorial;

public class Person implements Info{// classes can only extend one parent class but can implement many classes
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    void speak(){
        System.out.println("Hello" + " my name is " + name + " and I am " + age + " years old");
    }

    int calculateYearsTillretired(){
        int yearsleft = 65 - age;

        return yearsleft;
    }

    @Override
    public void showInfo() {
        System.out.println(name + "'s age is :" + age);
    }

}
