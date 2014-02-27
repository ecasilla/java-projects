import java.util.Scanner;

public class HelloWorldPrinter {
    public void sayHello(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = scanner.next();
    }
}
