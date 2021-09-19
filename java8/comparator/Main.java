package java8.comparator;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static int compareByNameThenAge(Employee e1, Employee e2) {
        if (e1.getEmployeeId() == e2.getEmployeeId()) {
            return e1.getName().compareTo(e2.getName());
        } else {
            return e1.getEmployeeId() - e2.getEmployeeId();
        }
    }

    public static void main(String[] args) {

        Employee emp3 = new Employee("Shariq", 103);
        Employee emp = new  Employee("Akhter", 102);
        Employee emp1 = new Employee("Nahid", 100);
        Employee emp2 = new Employee("Zamin", 100);

        ArrayList<Employee> list = new ArrayList<>();
        list.add(emp);
        list.add(emp2);
        list.add(emp1);
        list.add(emp3);

//        list.stream().sorted((e1, e2) -> {
//
//            if(e1.getEmployeeId() == e2.getEmployeeId())
//                return e1.getName().compareTo(e2.getName());
//            else
//                return e1.getEmployeeId() - e2.getEmployeeId();
//
//        }).collect(Collectors.toList()).forEach(object -> System.out.println(object));

        list.stream().collect(Collectors.groupingBy(Employee::getEmployeeId, Collectors.groupingBy(e -> e)))
        .entrySet().stream().forEach(System.out::println);


     //   list.sort(Main::compareByNameThenAge);
        //  list.sort((Employee o1, Employee o2) -> o1.getEmployeeId() - o2.getEmployeeId());
    //    list.forEach(empi -> System.out.println(empi.getName() + ", " + empi.getEmployeeId()));

//        Collections.sort(list, new CommonComparator());
//
//        ListIterator<Employee> itr = list.listIterator();
//        while(itr.hasNext()){
//            Employee empi = (Employee) itr.next();
//            System.out.println(empi.getName() + ", " + empi.getEmployeeId());
//
//        }


//        List<Comparator<Employee>> fList = list.stream().map(x -> new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                if (o1.getEmployeeId() == o2.getEmployeeId()) return 0;
//                if (o1.getEmployeeId() > o2.getEmployeeId())
//                    return +1;
//                else return -1;
//
//
//            }
//        }).collect(Collectors.toList());
//
//        System.out.println(fList);


       /*List<Employee> finalList =  list.stream().sorted((e1, e2) -> {

            if(e1.getEmployeeId() != e2.getEmployeeId())
                return e1.getEmployeeId() - e2.getEmployeeId();
            else
                return e1.getName().compareTo(e2.getName());


        }).collect(Collectors.toList());

       finalList.forEach(System.out::println);
*/



//        list.sort(Comparator.comparing(Employee::getEmployeeId));
//
//        System.out.println(list);
//
//        list.stream().sorted((e1, e2) -> (int)(e1.getEmployeeId()-e2.getEmployeeId()))
//                .collect(Collectors.toList()).forEach(System.out::println);
//
//        list.stream().sorted(Comparator.comparing(Employee::getName))
//                .collect(Collectors.toList()).forEach(System.out::println);



    }
}
