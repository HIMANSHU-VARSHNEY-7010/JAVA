package QUES_2;

import java.util.Comparator;

class SortBySalary implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return (int)e1.getSalary() - (int)e2.getSalary();
    }
}
