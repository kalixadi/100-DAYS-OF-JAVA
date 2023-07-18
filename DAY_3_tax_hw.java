import java.util.Scanner;
public class DAY_3_tax_hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in rupees :- ");
        long inc = sc.nextLong();
        if (inc > 0 && inc < 250000){
            System.out.println("You need not to pay any tax.");
        } else if (inc >= 250000 && inc<500000) {
            double tax = 0.05*inc;
            System.out.println("You need to pay Rs"+tax+" as a tax.");
        } else if (inc >= 500000 && inc<1000000) {
            double tax = 0.20*inc;
            System.out.println("You need to pay Rs"+tax+" as a tax.");
        } else if (inc >= 1000000) {
            double tax = 0.30*inc;
            System.out.println("You need to pay Rs"+tax+" as a tax.");
        }
        else {
            System.out.println("Entered salary seems to be invalid , please tray again later.");
        }
    }
}
