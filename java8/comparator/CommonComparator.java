package java8.comparator;

import java.util.Comparator;

public class CommonComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        int nameCompare = o1.getName().compareTo(o2.getName());
        int empIdCompare = o1.getEmployeeId() - o2.getEmployeeId();

        return empIdCompare == 0 ? nameCompare : empIdCompare;
    }
}
