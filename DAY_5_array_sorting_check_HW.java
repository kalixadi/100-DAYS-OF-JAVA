import java.util.Scanner;
class arrcheck{
    int[] array;
    public void isasc(){
        int[] arrc = this.array;
        int max = arrc[0];
        boolean check = true;
        for (int i = 0; i<arrc.length; i++){
            if (i==arrc.length-1){
                break;
            }
            if (max>arrc[i+1]){
                check = false;
            }
            else if (max<arrc[i+1]){
                check = true;
                max = arrc[i+1];
            }
        }
        if (check==true) {
            System.out.println("Given array is in ascending order");
        }
        else {
            System.out.println("The array is not in ascending order");
        }
    }
    public void isdes(){
        int[] arrc = this.array;
        int max = arrc[0];
        boolean check = true;
        for (int i = 0; i<arrc.length; i++){
            if (i==arrc.length-1){
                break;
            }
            if (max<arrc[i+1]){
                check = false;
            }
            else if (max>arrc[i+1]){
                check = true;
                max = arrc[i+1];
            }
        }
        if (check==true) {
            System.out.println("Given array is in descending order");
        }
        else {
            System.out.println("The array is not in descending order");
        }
    }
}
public class DAY_5_array_sorting_check_HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Programme to check , whether or not the array is sorted or not.
         */
        System.out.print("Enter the size of your array :- ");
        int s = sc.nextInt();
        int[] arr = new int[s];
        for (int i = 0 ; i<s ; i++) {
            System.out.println("Enter element number" + (i + 1) + " of the array :-");
            arr[i] = sc.nextInt();
        }
        arrcheck carr = new arrcheck();
        carr.array = arr ;
        carr.isasc();carr.isdes();
    }
}
