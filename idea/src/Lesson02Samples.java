import java.lang.reflect.Array;
import java.util.*;

public class Lesson02Samples {

    public static void main(String[] args) {
        // Call various other methods from here to run them
       // weirdLoop();
        //printFib();
        students(new String[]{"Kevin", "Ernie", "Marine", "Granger", "Shirley", "Fred", "Rachel", "Mandeep", "Hunter", "TJ"});
       // allAs();
        //reverseNumbers();
       // reverseArray();
       // isGeneticSequence();
        //inputAndSearch();
        //calculator();
    }

    public static void weirdLoop() {
        // TODO: Modify this code and use the debugger to find the value of i at the 72nd iteration of this loop
        for (int i = -8123; i < 3243*31; i += (2351%923)) {
            System.out.println("i: " + i);
        }
    }

    public static void printFib() {
        // TODO: Fill in the method in the FibSequence class
        // The first 10 fibonacci numbers are 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number in the fibonacci sequence: ");
            int sequenceNumber = scanner.nextInt();
            FibSequence fib = new FibSequence();
            System.out.println(fib.numberAtPosition(sequenceNumber));
        }
    }

    public static void allAs() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a string: ");
            String s = scanner.next();
            System.out.println("The string only contains the letter 'a': " + stringIsAllAs(s));
        }
    }

    // TODO: There's a bug in this, find it
    public static boolean stringIsAllAs(String s) {
        int i = 0;
        boolean tester = false;
        while (i < s.length()) {
            char character = s.charAt(i);
            if (character == 'a' || character == 'A') {
                char empty = '\0';
                character = empty;
            }
            i++;
        }
        return tester;
    }

    // TODO: Fill in the below methods
    public static void reverseNumbers() {
        // 1) Ask the user for how many numbers they want to enter
        // 2) Let them enter that many numbers
        // 3) Print them out in reverse

    }

    public static void reverseArray() {
        int[] array = {12, 320, 231, 214, 12312, 41024, 124, 12, 4123, 123, 1234, 634, 85, 685, 68};
        // 1) Reverse the above array above without creating a new array, then print it out
        int len = array.length-1;
        for (int x = 0; x <= len; x++ ){
            int tempx = array[x];
            int tempy = array[len];
            array[x] = tempx;
            array[len] = tempy;

        }

        System.out.println(Arrays.toString(array));
    }

    public static void isGeneticSequence() {
        // 1) Ask the user for a string
        // 2) If the string contains only the characters 'G', 'A', 'T', or 'C' (case-sensitive) print true
        // 3) Otherwise, print false
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scanner.next();
        ArrayList<String> userInput = new ArrayList<String>();
        userInput.add(s);
        for (int x = 0; x < userInput.size(); x++){
            String character = userInput.get(x);
            character.charAt(x);
         boolean bool;
            if (character.contains("A")) bool = true;
            else if (character.contains("G")) bool = true;
            else if (character.contains("T")) bool = true;
            else if (character.contains("C")) bool = true;
            else bool = false;
            System.out.println(bool);
        }

    }

    public static void inputAndSearch() {
        // 1) Ask the user to input 10 words
        // 2) Then ask the user to input a search word
        // 3) If the word exists in the first 10 words, print true, otherwise print false
        // 4) Return to step 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 10 words : ");
        String s = scanner.next();
        System.out.println("Please enter search term : ");
        String search = scanner.next();

    }

    public static void calculator() {
        // Below is a very simple calculator
        // 1) Modify it to support both addition, subtraction and multiplication operations
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an addition statement in the format x + y: ");
            Integer leftOperand = scanner.nextInt();
            String plus = scanner.next(); // The "+" sign, just ignore this
            Integer rightOperand = scanner.nextInt();
            System.out.println("Resulting value is: " + (leftOperand.intValue() + rightOperand.intValue()));
        }
    }

    public static void students(String[] students){
        int length = students.length;
        ArrayList<Integer> list = new ArrayList<Integer>(length);
        for(int i=0; i <= length; i++) {
            list.add(i);  // list contains: [0,1,2,3,4,5,6,7,8,9]
        }
        Collections.shuffle(list);  // list now contains: [0, 9, 3, 1, 5, 8, 7, 2, 6, 4]
        for (int j=0; j < list.size(); j++){
            students[0] = (list.get(j);
        }
         System.out.println(students.toString());
    }
}