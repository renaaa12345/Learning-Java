import java.util.*;
public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int number1 = sc.nextInt();
    
        System.out.println("Please enter the second numner");
        int number2 = sc.nextInt();

        System.out.println("Please enter the third numner");
        int number3 = sc.nextInt();

        if (number1 > number2)
        if (number1 > number3)
        System.out.println( "The greatest number you entered is " + number1);

        if (number2 > number2)
        if (number2 > number3)
        System.out.println( "The greatest number you entered is " + number2);

        if (number3 > number1)
        if (number3 > number2)
        System.out.println( "The greatest number you entered is " + number3);



        
    }
}
