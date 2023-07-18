import java.util.Scanner;
public class DAY_3_multiple_hw {
    /*
    Code to encrypt a letter grade by shifting it 8 values forward. Show both encrypted and decrypted grade.
     */
    public static void main(String[] args) {
        /*
    Code to encrypt a letter grade by shifting it 8 values forward. Show both encrypted and decrypted grade.
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR GRADE TO ENCRYPT : ");
        char gr = sc.next().charAt(0);
        char en_gr = (char)(gr+8);
        System.out.println("Your encrypted grade is : "+en_gr);
        System.out.println("Your decrypted grade is : "+gr);
        /*
    Code to compare whether a fixed number is greater than the user's input or not.
     */
        int fnum = 25;
        System.out.println("Enter your number which you want to compare with the fixed number  : ");
        int num = sc.nextInt();
        System.out.println("The answer to the query is  : "+(fnum<num));
    }

}
