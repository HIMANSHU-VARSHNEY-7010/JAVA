package QUES_10;
//      10. Demonstrate the use of repeat, strip, isBlank, indent, transform, stripIndent, translateEscapes,
//          formatted String methods.
public class QUES_10 {
    public static void main(String[] args) {
        String st = "Himanshu";
        System.out.println(st.repeat(2));

        String str = "\n\t      Are the Strings Equal.      \t   \u2005";
        System.out.println(str);
        System.out.println(str.trim());
        System.out.println(str.trim().equals("Are the Strings Equal."));
        System.out.println(str.strip());
        System.out.println(str.strip().equals("Are the Strings Equal."));

        String nullString = "\n \t       \t ";
        System.out.println("Is the String Blank : " + nullString.isBlank());

        String myName = "I am Himanshu Varshney.";
        System.out.println(myName.indent(5));

        System.out.println((String) myName.transform(s -> {
            return new StringBuilder(s).reverse().toString();
        }));

        str = "\n\t      Myself Himanshu Varshney.      \t   \u2005";
        System.out.println(str.stripIndent());

        str = "\\\n\tMy name is Hiamnshu Varshney.\t";
        System.out.println(str.translateEscapes());

        System.out.println("1. %s 2. %s 3. %s 4. %s".formatted("One", "Two", "Three", "Four"));
    }
}
