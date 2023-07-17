public class DAY_2_resulting_datatype_and_increments {
    public static void main(String[] args) {
        /*\
        Here are the resulting datatypes of some common operation types.
        b=byte , s=short , l=long , i=int , d=double , f=float , c=char
        b+s = i
        s+i = i
        l+f = f
        i+f = f
        c+i = i
        c+s = i
        l+d = d
        f+d = d
         \*/
        byte a = 3;
        int b = 4;
        // byte c a+b; this chunk of code will throw an error for sure cause resulting answer should be int and not byte
        /*
        Let's now talk about increments like i++ and ++i.
        */
        int i = 12;
        int x = i++; // 1st i will be assigned to x then i will be incremented.
        System.out.println("Value of x is : "+x);
        int j = 12;
        int y = ++j; // 1st i will be incremented then it will be assigned to y.
        System.out.println("Value of y is : "+y);
        // the same rule will be applied to --
        char ch1 = 'y';
        char ch2 = 'y';
        System.out.println(--ch1);
        System.out.println(ch2--);
    }
}
