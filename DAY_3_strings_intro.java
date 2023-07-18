public class DAY_3_strings_intro {
    public static void main(String[] args) {
        /*
        Strings are not datatype in java. Instead,they are classes which can be used as datatype.
        Strings are not mutable in python. if you want to change a variable , u can't change it in it's original memory
        space , you may make a copy at different location which will look like a mutated string.
         */
        String name =  new String("ADITYA"); // String being used as class
        System.out.println("My name is : "+name);
        String name1 = "Aditya";
        System.out.println("My name is  : "+name1); // String being used as datatype.
        int value1 = name.length();
        int value2 = name1.length();
        System.out.println(value1+" "+value2);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        name = "       ADITya      ";
        System.out.println("Original : "+name+" ; Trimmed : "+name.trim()); //trims white spaces in the end and start of the strings
        System.out.println(name1.substring(2)); //it prints the substring from index 2 to end
        System.out.println(name1.substring(2,4));//it prints substring form index 2 to 4 (4 being excluded).
        System.out.println(name1.replace('a','s')); // replaces 'a' with 's'. This is case sensitive.
        System.out.println(name1.replace("itya","arsh"));//replaces target with replacement
        System.out.println(name1.startsWith("A"));
        System.out.println(name1.endsWith("a"));
        System.out.println(name1.equals("Aditya")); //compares the given string to original string name1.
        System.out.println(name1.equalsIgnoreCase("AdITyA")); // same as 'equals' but ignores the case comparision.
        System.out.println("\\ is an escape sequence character.");
        System.out.println("This can escape the predifined characters like \" in the sout call");
        System.out.println("This is \n new line ");
    }
}
