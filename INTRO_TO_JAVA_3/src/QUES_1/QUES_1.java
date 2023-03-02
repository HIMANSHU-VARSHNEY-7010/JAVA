package QUES_1;

public class QUES_1 {
    public static void main(String[] args) {
        for(EnumClass obj : EnumClass.values()){
            System.out.println("Price of " + obj + " is Rs." + obj.getPrice());
        }
    }
}