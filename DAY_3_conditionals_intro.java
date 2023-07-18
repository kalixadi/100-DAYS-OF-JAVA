import java.util.Scanner;
public class DAY_3_conditionals_intro {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
//        System.out.println("What is your age ? ");
//        int age = sc.nextInt();
//        boolean bool = (age>18);
//        if(age>18){
//            System.out.println("Yes you can apply for driving licence");
//        }
//        else {
//            System.out.println("Sorry you cannot apply for driving licence");
//        }
//        if(bool){
//            System.out.println("Yes you can apply for driving licence.");
//        }
//        else{
//            System.out.println("Sorry you can't apply for driving licence.");
//        }
        int a = 21;
        int b = 12;
        boolean c = false;
        boolean d = true;
        if((a==12) && c){
            System.out.println("Pass");
        }
        else if (b==12 || c){
            System.out.println("2nd Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
