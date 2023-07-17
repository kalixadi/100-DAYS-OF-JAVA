import java.util.Scanner;
public class DAY_2_operators {
    public static void main(String[] args) {
        int a = 17;
        int b = 2;
        int x = a%b; // this is modulo operator which gives remainder when a is divided by b.
        System.out.println("Your remainder on dividing "+a+" by "+b+" is "+x);
        System.out.println("Let's check is 6 = 8 or not ?");
        System.out.println("The comparision is : "+(6==8)); // comparisions can be made while printing the output

        /* Precedence and associativity of operators with same ranking is decided by their occurence .
        The operator which occurs in left most is always evaluated 1st.
        Let's do some examples.
         */
        int p1 = 65*2 - 12/3;
        int p2 = 12/3 - 65*2;
        System.out.println("1st out put is : "+ p1 +"        2nd output is : "+ p2);
        /*
        Precedence of ++ , = is slightly different as it goes from right to left.
         */
        int p , q;
        p = q = 25; // here 1st q is assigned then p is assigned.
        System.out.println(p + "  "+q);
        /*
        To run code according to your precedence demand all you need to do is add bracket () for the block which you
        want to get evaluated 1st.
         */
        int m , y , z;
        m = y = z = 4;
        int det = ((y*y)-(4*m*z))/(2*m); // this is according to (b^2 - 4ac)/2a
        System.out.println("Determinant is : ");
        System.out.println(det);
    }
}
