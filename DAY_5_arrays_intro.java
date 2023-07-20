public class DAY_5_arrays_intro {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 1 ; i<=5; i++){
            arr[i-1]=i;
        }
        for (int i = 0; i<5 ; i++){
            System.out.println(arr[i]);
        }
        System.out.println(arr); // this is a pointer and will only print pointer location and not the array.
        System.out.println("length of array is :- "+arr.length);
        for (int i = arr.length-1 ; i>=0 ; i--){
            System.out.println(arr[i]); // printing array in reverse order.
        }
        System.out.println("\n\n");
        for (int qr : arr){
            System.out.println(qr);
        }
        System.out.println("\n\n");
        /*
        Let's see how to initiate multi-dimensional array.
         */
        int [][] arr2d = new int[2][2]; // initialization of 2-D array.
        for (int i = 0 ; i<2 ; i++){
            for (int j = 0; j<2; j++){
                arr2d[i][j]= (i*j)+(i-j);
            }
        }
        for (int i = 0 ; i<2 ; i++){
            for (int j =0 ; j<2 ; j++){
                System.out.print(arr2d[i][j]+   "\t");
            }
            System.out.println();
        }
    }
}
