import java.util.Scanner;

class Lab1Sample {

    public static void main(String[] args) {
        //helloWorld();
        //helloWorldWithSeparateClass();
        //numberAdder();
        //helloWorldWithComboRights();
        //helloWorldWithStackedRights();
       // helloMultipleTimes();
      //  oddEven();
        fib();
    }

    public static void helloWorld() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = scanner.next();

        System.out.print("\nYour age: ");
        int age = scanner.nextInt();
        System.out.println("Hello " + name + ", you're " + age + " years old.");
    }

    public static void helloWorldWithStackedRights() {
        // TODO: Print the following
        // If your age is above 16, print "You can drive!"
        // If your age is above 18, print "You can vote!"
        // If your age is above 21, print "You can drink!"
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nYour age: ");
        int age = scanner.nextInt();
            if (age >= 16 && age <= 18){
            System.out.println("You can drive!");
        } else if (age >= 18 && age <= 20){
              System.out.println("You can vote!");
            }else {
                System.out.println("You can Drive & Vote & Drink!");
        }
    }

    public static void helloWorldWithComboRights() {
        // TODO: Print the following
        // If your age is above 16 but below 18, print "You can drive!"
        // If your age is above 18 but below 21, print "You can drive and vote!"
        // If your age is above 21, print "You can drive, vote and drink (but not at the same time!)"
        helloWorldWithStackedRights();
    }

    public static void helloMultipleTimes() {
        System.out.println("Enter a number of times to say hello! ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Hello!");
        // TODO: Modify this to print "Hello!" exactly n times
    }

    public static void numberAdder() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        // TODO: Change this to stop execution and print "Total sum : " plus the value when the value exceeds 100
        while (sum < 100) {
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            sum = sum + n;
            System.out.println("Total sum is " + sum);
        }
    }

    public static void oddEven() {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean even = isEven(n);
        // TODO: Print if the number is even or not
        if (even) {
            System.out.println(n + " Is Even ");
        }
        else{
            System.out.println(n + " Is Not Even ");
        }
    }

    public static boolean isEven(int n) {
         if (n  % 2 == 0){
             return true;
         }else{
             return false;
         }
        // TODO: Return whether the number is even or odd

    }

    public static void helloWorldWithSeparateClass() {
    /*
    TODO:
    - Create a HelloWorldPrinter class
    - Create a method in that class, public void sayHello(). It should do the same thing as helloWorld() above
    - Create an instance of that class here
    - Call the method sayHello() on that instance
     */

        HelloWorldPrinter object = new HelloWorldPrinter();
        object.sayHello();
    }

    public static void fib() {
    /*
    TODO:
    - Create a FibSeqeunce class
    - Create a method in that class, public long numberAtPosition(int n).
    - Create an instance of that class here
    - Ask the user to enter a number
    - Print out the result of numberAtPosition
    - Fill out the fibonacci logic for numberAtPosition
     */
    FibSeqeunce object = new FibSeqeunce();
        object.askForNumberAtPosition();

    }
}