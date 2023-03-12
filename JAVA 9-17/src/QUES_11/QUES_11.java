package QUES_11;
//      11. use record to create an immutable represent of student(name, id, age) and use its  constructor for
//          initialization, equals to compare 2 students methods. Also keep a static counter to keep the count
//          of objects created.
public class QUES_11 {
    public static void main(String[] args) {

        recordStudent stu = new recordStudent("HIMANSHU VARSHNEY" , 1234 , 22) ;
        System.out.println(stu  + "\nNo. Of Objects created " + recordStudent.count + ".");
        recordStudent stu1 = new recordStudent("HIMANSHU VARSHNEY" , 1234 , 22) ;
        System.out.println(stu1  + "\nNo. Of Objects created " + recordStudent.count + ".");

        System.out.println("------------------------------------------------------------");

        System.out.println("Equals Method ");
        System.out.println(stu.equals(stu1));

        System.out.println("HashCodes");
        System.out.println(stu.hashCode());
        System.out.println(stu1.hashCode());

    }
}
