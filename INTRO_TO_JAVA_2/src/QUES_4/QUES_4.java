package QUES_4;
// Q4 Create a custom exception that do not have any stack trace.
public class QUES_4 {
        public static void main(String[] args) {
            Test t = new Test();

            try {
                t.run();
            } catch (CustomException e) {
                System.out.println(e);
            }
        }

}
