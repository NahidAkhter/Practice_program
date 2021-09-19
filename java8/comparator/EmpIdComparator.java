package java8.comparator;

import java.util.Comparator;

public class EmpIdComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Employee emp1 = (Employee) o1;
        Employee emp2 = (Employee) o2;

       return emp1.getEmployeeId() - emp2.getEmployeeId();
    }
}
