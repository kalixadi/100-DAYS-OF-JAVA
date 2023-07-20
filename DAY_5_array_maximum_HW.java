import java.util.Scanner;
public class DAY_5_array_maximum_HW {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        /*
        Programme to find out the maximum of the elements in an array.
         */
        System.out.print("Enter the size of your array :- ");
        int s = sc.nextInt();
        int[] arr = new int[s];
        for (int i = 0 ; i<s ; i++){
            System.out.println("Enter element number"+(i+1)+" of the array :-");
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
            continue;
        }
        System.out.println("\n\nThe maximum element in array is :- "+max);
    }
}
