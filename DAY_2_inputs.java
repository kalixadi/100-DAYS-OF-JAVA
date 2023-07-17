import java.util.Arrays;
import java.util.Scanner;
public class DAY_2_inputs {
    public static void main(String[] args) {
        System.out.println("It worked"); // you can use 'sout' for using this code snippet directly
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 as input : ");
        int a = sc.nextInt();
        System.out.println("Enter number 2 as input : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("Sum of the numbers is : ");
        System.out.println(sum);
        System.out.println("Enter 1st float number her : ");
        float a1 = sc.nextFloat();
        System.out.println("Enter the 2nd float number : ");
        float b1 = sc.nextFloat();
        float sum1 =  a1+b1;
        System.out.print("The sum of the two floats is : "); //if you give input which is double , the answers will not be accurate .
        System.out.println(sum1);
        System.out.println("let's check if your input is integer or not");
        boolean bol = sc.hasNextInt();
        System.out.print(bol);
        System.out.println(" ");
        System.out.print("Let's enjoy some string inputs : ");
        String str = sc.next(); // doesn't takes new input , uses previous input as new input
        System.out.println(str);
    }
}
