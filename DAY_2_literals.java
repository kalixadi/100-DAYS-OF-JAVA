public class DAY_2_literals {
    public static void main(String[] args) {
        byte age = 21;
        char ch = 'A'; // The character here is written in single quote , because it is a rule in java to write character in single quote only
        float F1 = 3.141f ; // By default java considers the float value as double so to make it considered as float only , we need to add 'f' in the end.
        int year = 2023; // here in integers , there is no such requirement of suffix .
        String stri;
        stri = "jai mata di"; // here i found an anomaly , where it doesn't accept the declaration and assignment in the same line. I don't know why it happened.
        System.out.println(age);
        System.out.println(ch);
        System.out.println(F1);
        System.out.println(year);
        System.out.println(stri);
    }
}
