public class DAY_4_loops_control {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10){
            System.out.println("Executing till "+i);
            i++;
        }
        System.out.println("End of WHILE loop");
        i = 0;
        do {
            System.out.println("Executing till "+i);
            i++;
        }while (i<=5);
        System.out.println("End of DO-WHILE loop.");
        for (int j = 1;j <= 4; j++ ){
            System.out.println("You son of a "+j);
        }
        System.out.println("End of FOR loop");
        for (i = 4; i>=0; i--){
            System.out.println("Son of you "+i);
        }
        System.out.println("End of DECREMENTING FOR loop.");
        for (i = 0; i <= 21 ; i++){
            System.out.println("This loop will run till 21 , and right now we are on");
            System.out.println(i);
            if (i==4){
                System.out.println("OOPS it's dangerous to be here , i am immediately ending the loop");
                break;
            }
        }
        i=0;
        do {
            if (i==3){
                System.out.println("Oops , we are on 3 , don't listen secrets now.");
                i++;
                continue;
            }
            System.out.println("Listen to the secret code , as we are on");
            System.out.println(i);
            i++;
        }while (i<=10);
    }
}
