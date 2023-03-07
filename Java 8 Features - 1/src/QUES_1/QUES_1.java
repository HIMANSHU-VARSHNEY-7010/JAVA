package QUES_1;
//    Q1) Write the following a functional interface and implement it using lambda:
//        # To check whether the first number is greater than second number or not, Parameter (int ,int )
//          Return type boolean
//        # Increment the number by 1 and return incremented value Parameter (int) Return int
//        # Concatination of 2 string Parameter (String , String ) Return (String)
//        # Convert a string to uppercase and return . Parameter (String) Return (String)
public class QUES_1 {
    public static void main(String[] args) {

        GreaterNum ob1 = (int a , int b)->{

            if(a > b) return true;
            else return false ;

        };
        int a=5, b=7;
        if(ob1.checkGreater(4,3)){
            System.out.println(a + " is greater than " + b + ".");
        }
        else {
            System.out.println(b + " is greater than " + a + ".");
        }

        Increment obj2 = (int num)->{
            num++;
            return num ;
        };
        System.out.println(obj2.increment(a));

        Concat obj3  = (String str1 , String str2)->{
            return str1+str2 ;
        };

        System.out.println(obj3.concatenate("I am" , " Himanshu."));

        Uppercase obj4 = (String str)->{
            return str.toUpperCase() ;
        };

        System.out.println(obj4.upperCase("All done.") ) ;


    }
}
