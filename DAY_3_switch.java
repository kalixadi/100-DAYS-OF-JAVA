import java.util.Scanner;
public class DAY_3_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :- ");
        char age = sc.next().charAt(0);
        switch (age){
            case 'a':
                System.out.println("You will be adult now.");
                break;
            case 'd':
                System.out.println("Start earning next year will be your marriage.");
                break;
            case 'i':
                System.out.println("Get your kid to a school.");
                break;
            case 't':
                System.out.println("Time to get retired.");
                break;
            default:
                System.out.println("Enjoy your lyf.");
        }
        System.out.println("Thanks for using my code.");
    }
}
