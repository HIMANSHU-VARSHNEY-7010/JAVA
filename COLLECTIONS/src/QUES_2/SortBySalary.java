package QUES_2;

import java.util.Comparator;

class SortBySalary implements Comparator<EmployeeClass> {

    @Override
    public int compare(EmployeeClass e1, EmployeeClass e2) {
        return (int)e1.getSalary() - (int)e2.getSalary();
    }
}
