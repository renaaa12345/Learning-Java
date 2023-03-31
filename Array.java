import java.util.*;
public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] values = new int[size];

        System.out.println("Enter values into array ");
        for(int i = 0; i < size; i++) {
            int value = sc.nextInt();
            values[i] = value;

        }
        int length = values.length;
        int sum = 0;

        for(int i = 0; i < values.length; i++) {
            sum += values[i];

        }
        double average = sum / length;
        System.out.println("Average of array: " + average);

    }
}
