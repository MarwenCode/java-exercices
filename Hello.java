// class hello {

// public static void main(String args[]) 

// // {
// //     int x = 12;
// //     int y =0;
// //     if(x > 10 && x <= 20 ) {
// //         System.out.println(x);
// //         System.out.println("hello");

// //     }
   

// //     else 
// //         System.out.println(y);

// // }


// {
//     int n = 4;
//     int result;

//     if (n%2 == 0) 
//     result = 0;
    
//     else  
//     result = 6;

//     System.out.print("The value of result is " +result+ "");

// }
   
// }

///////////////////////



    

// public class Calculator  {
//     public int add(int a, int b) {
//         int res = a + b;
//         return res
//     }
// }

// public class PrintResult {
//     public static void main(String[] args) {
//         int num1 = 7;
//         int num2 = 2;
//         Calculator count = new Calculator();

//         int result = count.add(a: num1, b: num2);

//         // System.out.print("The sum of "+num1+" and "+num2+" is: ");
//         System.out.println(result);


      
//     }
// }
import java.util.Scanner;
import javax.swing.JOptionPane;


 class Calculator {
    public int add(int a, int b) {
        // int res = a + b;
        // return res; 

        return a + b;
    }
}

public class Hello {
    public static void main(String[] args) {
        // int num1 = 7;
        // int num2 = 2;
        // Calculator count = new Calculator();

        // int result = count.add(num1, num2); 

        // // System.out.print("The sum of "+num1+" and "+num2+" is: ");
        // System.out.println(result);


        // String x = "water";
        // String y = "juice";

        // x = y;
   
    

        // System.out.println("x contains " + x);
        // System.out.println("y contains" + y);


        // Scanner scanner = new Scanner(System.in);
        // System.out.println("what is your name ? ");
        // String name = scanner.nextLine();
        // System.out.println("hello " + name);

        //GRU//////////////////////////////////////////*************///////////////////////////////////: */

        // String name = JOptionPane.showInputDialog("Enter your name");
        // JOptionPane.showMessageDialog(null, "Hello "+name);

        // int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        // JOptionPane.showMessageDialog(null,"You are " + age);

        // int height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height"));
        // JOptionPane.showMessageDialog(null,"You are "+height+ "cm tall");
        


        // double x = 3.14;
        // double y = -10;
        // double z = Math.max(x,y);
        // System.out.println(z);


        Car myCar = new Car();
        System.out.println(myCar.factory);

        Human human1 = new Human("Rick", 20);
        Human human2 = new Human("Morty", 15);

        System.err.println(human1.name);
        System.err.println(human2.name);

        human2.eat();

        RondNumber RondNumber = new RondNumber();
     



        


    }

 
   public static class Car {
        String factory ="cheverolet";
        String model = "test";
        int year = 2022;
        String color = "red";
        int price = 50000;

        void drive () {
            System.out.println(" i drive the car");
        }

    


    }

    
}




