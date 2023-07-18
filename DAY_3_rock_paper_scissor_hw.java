import java.util.Scanner;
import java.util.Random;
public class DAY_3_rock_paper_scissor_hw{
    public static void main(String[] args) {
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        int a = rn.nextInt(2);
        System.out.print("Choose 1 for rock , 2 for paper and 3 for scissor :- ");
        int b = sc.nextInt();
        if (a==0){
            if (b==1) {
                System.out.println("Computer opted rock , it's a tie");
            }
            else if (b==2){
                System.out.println("Computer opted rock , you won");
            }
            else if (b==3){
                System.out.println("Computer opted rock , computer won");
            }
            else {
                System.out.println("You opted a wrong input.");
            }
        }
        else if (a==1){
            if (b==1) {
                System.out.println("Computer opted paper , computer won");
            }
            else if (b==2){
                System.out.println("Computer opted paper , it's a tie");
            }
            else if (b==3){
                System.out.println("Computer opted paper , you won");
            }
            else {
                System.out.println("You opted a wrong input.");
            }
        }
        else if (a==2){
            if (b==1) {
                System.out.println("Computer opted scissor , you won");
            }
            else if (b==2){
                System.out.println("Computer opted scissor , computer won");
            }
            else if (b==3){
                System.out.println("Computer opted scissor , it's a tie");
            }
            else {
                System.out.println("You opted a wrong input.");
            }
        }
        System.out.println(a);
    }
}
