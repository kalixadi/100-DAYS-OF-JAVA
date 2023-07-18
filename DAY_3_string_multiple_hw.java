import java.util.Scanner;
public class DAY_3_string_multiple_hw {
    public static void main(String[] args) {
        /*
        Programme to fill the letter template with author name in place of 'name'
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message here : ");
        String temp1 = sc.nextLine();
        System.out.println(temp1.replace("name","Aditya"));
        /*
        Code to detect presence of double or triple white space in a string.
         */
        System.out.println("Enter the string to check double and triple space : ");
        String str = sc.nextLine();
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));
    }
}
