import java.util.Scanner;
public interface Day_2_percentage_hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st marks : ");
        float a1 = sc.nextFloat();
        System.out.println("Enter your 2nd marks : ");
        float a2 = sc.nextFloat();
        System.out.println("Enter your 3rd marks : ");
        float a3 = sc.nextFloat();
        System.out.println("Enter your 4th marks : ");
        float a4 = sc.nextFloat();
        System.out.println("Enter your 5th marks : ");
        float a5 = sc.nextFloat();
        float total = a1+a2+a3+a4+a5;
        float fract = total/500;
        float perc = fract*100;
        System.out.print("Your percentage total is : ");
        System.out.println(perc);
    }
}
