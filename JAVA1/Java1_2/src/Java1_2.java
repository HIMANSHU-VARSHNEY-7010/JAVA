import java.util.*;
public class Java1_2 {
    public static void main(String[] args) {
        System.out.println("Enter the Strings :- ");
        List<String> str = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        while(true){
            String s = scn.nextLine();
            if(s.equals("XDONE")){
                break;
            }
            str.add(s);
        }
        System.out.println("Text Entered :- ");
        for(String s : str){
            System.out.println(s);
        }
    }
}