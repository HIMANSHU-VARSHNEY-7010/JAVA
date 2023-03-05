package QUES_2;

    public class UserClass {
        private static UserClass obj ;
        private  String  FirstName ;
        private String LastName ;
        private String age ;

        private String phoneNo ;

        private UserClass(String FirstName , String LastName , String age , String phoneNo){

            this.FirstName  = FirstName ;
            this.LastName = LastName ;
            this.age = age ;
            this.phoneNo = phoneNo ;
        }

        public static UserClass getInstance(String FirstName , String LastName , String age , String phoneNo){
            if(obj == null){
                obj = new UserClass(FirstName , LastName , age , phoneNo) ;
            }
            else{
                obj.FirstName  = FirstName ;
                obj.LastName = LastName ;
                obj.age = age ;
                obj.phoneNo = phoneNo ;

            }
            return obj ;
        }

        public String showDetails(){
        return ("First Name: " + this.FirstName + ", Last Name: " + this.LastName + ", Age: " + this.age +
                ", Phone No.: " + this.phoneNo);
        }

    }

