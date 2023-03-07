package QUES_2;
//  Q2) Using (instance) Method reference create and apply add and subtract method and using (Static) Method
//      reference create and apply multiplication method for the functional interface created
public class QUES_2 {
    public static void main(String[] args) {

        int a = 10;
        int b = 4;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        Calculator cal = new Calculator();

        Calculation result = cal::sum;

        System.out.println("Addition of numbers: " + result.calculation(a,b));

        result = cal::subtract;

        System.out.println("Subtraction of numbers: " + result.calculation(a,b));

        result = Calculator::multiplication ;

        System.out.println("Multiplication of numbers: " + result.calculation(a,b));

    }
}
