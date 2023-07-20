public class DAY_4_loop_hw {
    public static void main(String[] args) {
        /*
        We will write code to print upside down flipped right-angled triangle with stars  (*).
         */
        for (int i = 4; i>0; i--){
            for (int j = 0 ; j<i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        /*
        Programme to write sum of 1st n even numbers.
         */
        int sum = 0;
        for (int i = 1; i<10 ; i++){
            sum+=i;
        }
        System.out.println("Sum of even numbers before 20 is "+sum);
        /*
        Programme for factorial using loops.
         */
        int prod = 1;
        for (int i = 1;i<=5;i++){
            prod*=i;
        }
        System.out.println("Factorial of 5 is :- "+prod);
    }
}
