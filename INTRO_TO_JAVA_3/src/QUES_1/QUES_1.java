package QUES_1;
// 1) Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)
public class QUES_1 {
    public static void main(String[] args) {
        for(EnumClass obj : EnumClass.values()){
            System.out.println("Price of " + obj + " is Rs." + obj.getPrice());
        }
    }
}