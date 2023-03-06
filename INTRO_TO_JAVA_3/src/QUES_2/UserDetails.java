package QUES_2;

    public class UserDetails {
        private static UserDetails obj ;
        private  String  FirstName ;
        private String LastName ;
        private String age ;

        private String phoneNo ;

        private UserDetails(String FirstName , String LastName , String age , String phoneNo){

            this.FirstName  = FirstName ;
            this.LastName = LastName ;
            this.age = age ;
            this.phoneNo = phoneNo ;
        }

        public static UserDetails getInstance(String FirstName , String LastName , String age , String phoneNo){
            if(obj == null){
                obj = new UserDetails(FirstName , LastName , age , phoneNo) ;
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

