import java.util.Arrays;
import java.util.Random;

public class IntArraySorter {
    private static final int MAX_RANDOM_VALUE = 1000;
    private static final int DEFAULT_ARRAY_SIZE = 10;

    public static int[] sortArray(int[] array) {
        // TODO: For each number in the array
        // Look at every number after it, in sequence
        // If the first number is greater than the second, swap them
        // Remember to copy the array before modifying it using Arrays.copyOf
        int[] arr1 = Arrays.copyOf(array, array.length);
        int length = arr1.length;
        for (int x=0; x < length; x++){
            int y = x+1;
            for(; y < length; y++){
                System.out.println(Arrays.toString(arr1));
                if(arr1[x] > arr1[y]){
                    int tempx = arr1[x];
                    int tempy = arr1[y];
                    arr1[y]=tempx;
                    arr1[x]=tempy;
                }
            }
        }
        return arr1;
    }
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = new int[DEFAULT_ARRAY_SIZE];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt() % MAX_RANDOM_VALUE;
        }

        System.out.println("The array to be sorted: " + Arrays.toString(array));
        int[] sortedArray = sortArray(array);
        System.out.println("The sorted array: " + Arrays.toString(sortedArray));
        System.out.println(isSorted(sortedArray) ? "Sorting worked!" : "Sorting didn't work...");
    }
}