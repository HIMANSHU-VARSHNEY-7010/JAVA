package QUES_4;

public class Test {
    public void run() throws CustomException {
        int r = 0;
        if (r == 0) {
            System.out.println("Test is Executing, Throwing Error Now");
            throw new CustomException("This is a Custom Exception");
        }
    }
}