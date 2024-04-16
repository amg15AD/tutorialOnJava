package tutorial;//


import ocean.Fish;
//import package name .* allows access to all classes in a different package
import java.util.Scanner;

public class GoodMorningWorld {
    public static void main(String[] args) {

        System.out.println("Good Morning World!!!");//

        int myNumber = 2024; short myShort = 848; long myLong = 9799;   double myDouble = 10.99; float myFloat = 419.99f;
        System.out.println( myNumber);// primitive data types example ^^

        // String is a non-primitive data type vv This shows us creating a String object that holds a String value. We're using concatenating the three reference variables
        String greet = "Good morning";
        String blank = " ";
        String name ="Alex";

        System.out.println(greet + blank + name);
        System.out.println("<<==================================>>");

        int value = 0;
       while (value < 2){//
           System.out.println("Hello, this is true");

           value = value + 1;       // ------>   if we don't break the condition this code will continue to run
       }
        System.out.println("<<==================================>>");
       ////////////////standard for loop\\\\\\\\\\\\\\\\\\\\\
       for(int i =10; i >4; i--){
           System.out.println(" The value of i is: " + i);
       }

       ///////////////// if statements\\\\\\\\\\\\\\\\\\\\\
       int myAge = 19;
       if(myAge > 21){
           System.out.println("LET FUCKING PARTY");
       } else if (myAge < 21) {
           System.out.println("You can't party buddy");
       }
       else {
           System.out.println("Lets go im 21!!");
       }

        System.out.println("<<==================================>>");
       ////////////////// using a scanner + if statement + Do while + switch statement\\\\\\\\\\\\\\\\\\\\\
        Scanner scanAge = new Scanner(System.in);

        System.out.println("What is your age ?");
        int inputAge = scanAge.nextInt();

        if(inputAge > 21){
            System.out.println("LET FUCKING PARTY BROO");
        } else if (inputAge < 21) {
            System.out.println("Nah bro go home ");
        }

        System.out.println(" Great you are " + inputAge + " years old!!" + '\n' + "=====================");

        //////do while loop
        Scanner scan = new Scanner(System.in);
        int inputValue = 0;
        do {
            System.out.println(" Please enter an number");
           inputValue = scan.nextInt();
        }
        while (inputValue != 5);
        System.out.println("I knew you'd say 5  ^0^ lol\n =================");


        //////// Switch function is usually to commenly check String and int variables
        Scanner scanSwitch = new Scanner(System.in);

        System.out.println("Enter traffic light color");
        String trafficLightColor = scanSwitch.nextLine().toLowerCase();

        switch(trafficLightColor) {
            case "red":
                System.out.println("You stopped my car");
                break;
            case "yellow":
                System.out.println("I speed up and hope for the best...");
                break;
            case "green":
                System.out.println("I keep driving woooo hooooo!!!!");
                break;
            default:
                System.out.println(trafficLightColor + "?? What f'ing traffic light are you talking about?");
        }

        System.out.println("<<==================================>>");
        /////////Arrays and Multi-Dimensional arrays////////////
        int[] values = {30, 20, 10};
//        values[0] = 10;
//        values[1] = 20;
//        values[2] = 30;
       // System.out.println(values[0]);  System.out.println(values[1]);   System.out.println(values[2]);
        for (int i=0; i< values.length; i++){
            System.out.println(values[i]);
        }
        String [] sports = {"soccer", "basketball", "golf"};
        for(String f : sports){
            System.out.println(f);
        }

        String [][] createClothes = {
                {"White", "Black", "Blue"},
                {"small", "medium", "large", "xl"},
                {"T-shirt", "jacket", "pants"}
        };
        System.out.println(createClothes[1][1]);
        System.out.println(createClothes[2][1]);

        for(int row=0; row<createClothes.length; row++){
            for (int col=0; col<createClothes[row].length; col++){
                System.out.print(createClothes[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.println("<<==================================>>");
        //////////OOP////////////
//        Person p1 = new Person();
//        p1.setName("Alex");
//        p1.setAge(23);
//        p1.speak();
//        System.out.println(p1.calculateYearsTillretired() + " years till I retire");

//        Person p2 = new Person();
//        p2.setName("Taylor");
//        p2.setAge(29);
//        p2.speak();

       Robot r1 = new Robot("IRoRo");
       Robot r2 = new Robot("RoBO", 1011);


        Fruit f1 = new Fruit("apple",0.99,5);
        Fruit f2 = new Fruit("mango",1.05,6);
        Fruit f3 = new Fruit("pineapple",3.50,3);
        System.out.println(f1.printTotalPerQty());
        f2.printInfo();
        f3.printInfo();
        f1.printInfo();


        System.out.println("<<==================================>>");
        /////// Efficient way to append to a String////////
        StringBuilder sb = new StringBuilder();
        sb.append("My name is Remmy ").append("I am a rat chef");
        System.out.println(sb);


        ////////////////Formatting//////////////////
        System.out.printf("Total cost %10d;\nquantity is %10d", 5 , 96);
        System.out.println();
        for(int i=0; i<=3; i++){
            System.out.printf("%3d: %s\n", i, "Text lined up using formatting ");
            System.out.println(i + " this is text not formated"+"\n");
        }
        System.out.printf("Total value: %-6.7f\n",343.23423);
        System.out.printf("Total value: %.3f\n",343.23423);


        System.out.println("<<==================================>>");
        //////////////Interface///////////////
        Machine mac1 = new Machine();
        mac1.start();
        mac1.stop();
        Motorcycle moto = new Motorcycle();
        moto.start();
        moto.preformTrick();
        moto.stop();
        Person p3 = new Person("Steve", 32);
        Info info1 = new Machine();
        info1.showInfo();
        Info info2 = p3;
        info2.showInfo();
        Fish fish1 = new Fish();

        //////////////Polymorphism\\\\\\\\\\\\\\\
        Plant plant1 = new Plant();
        Flower flower1 = new Flower();

        Plant plant2 = flower1;
        plant1.grow();
        plant2.grow();
        flower1.dyingFlower();





    }// end of main method



    //access modifiers determine the access of classes, instances, methods
    //acceptable public instances will be on final constant variables
    //private variables are only accessible in the same class
    //protected variable/methods can be accessed within the same class subclass and package








}// end of main class
