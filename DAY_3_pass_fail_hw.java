import java.util.Scanner;
public class DAY_3_pass_fail_hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your marks in Subject 1 :- ");
        float m1 = sc.nextFloat();
        System.out.print("Your marks in Subject 2 :- ");
        float m2 = sc.nextFloat();
        System.out.print("Your marks in Subject 3 :- ");
        float m3 = sc.nextFloat();
        float perc = ((m1+m2+m3)/3);
        if (m1 > 33 && m2>33 && m3>33 && perc>40){
            System.out.println("You are pass with "+perc+"%");
        }
        else {
            System.out.println("You are fail.");
        }
    }
}
