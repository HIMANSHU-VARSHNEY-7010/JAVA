package QUES_1;
//    1) Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator,
//          find the sum of the numbers in List.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class QUES_1 {
    public static void main(String[] args)
    {
        List<Float> list = new ArrayList<Float>();
        list.add(5.1F);
        list.add(6.2F);
        list.add(7.7F);
        list.add(10.2F);
        list.add(9.3F);
        float sum = 0;
        Iterator<Float> iterator = list.iterator();

        while(iterator.hasNext()){
            sum += iterator.next();
        }

        System.out.println("Sum of the List is " + sum);
    }
}
