package QUES_2;
//      Q2. Create and access default and static method of an interface.
public class QUES_2 implements Test {
    public QUES_2() {
    }

    public static void main(String[] args) {
        QUES_2 obj = new QUES_2();
        obj.showDefault();
        Test.showStatic();
    }
}