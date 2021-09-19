package Functional.salary;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainEmployee {

    public static void main(String[] args) {

        List<Employee> employeeList
                = Arrays.asList(new Employee("Tom Jones", 45, 15000.00),
                new Employee("Tom Jones", 59, 15000.00),
                new Employee("Tom Jones", 48, 7000.00),
                new Employee("Ethan Hardy", 65, 90000.00),
                new Employee("Nancy Smith", 22, 10000.00),
                new Employee("Deborah Sprightly", 29, 190000.00));

//         employeeList
//                .stream()
//                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)))
//                .stream().forEach(System.out::println);


//        Map<String, Employee> result =  employeeList
//                .stream()
//                .collect(Collectors.groupingBy(e -> e.getName(), Collectors.collectingAndThen(
//                        Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get
//                )));
//        result.entrySet().stream().forEach(System.out::println);

//        employeeList.stream()
//                .sorted((e1,e2) -> - (int) (e1.getSalary() - e2.getSalary()))
//                .limit(3)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

//        Map<String, List<Employee>> map = employeeList.stream().collect(Collectors.groupingBy(emp-> emp.getName(), Collectors.toList()));
//        map.entrySet().stream().forEach(System.out::println);

//        Map<String, Employee> employeeMap = employeeList
//                .stream()
//                .collect(Collectors.toMap(Employee::getName, emp -> emp, (employee1, employee2) -> {
//                    return employee1;
//                } ));
//
//        employeeMap.entrySet().stream().forEach(System.out::println);

       List<Employee> list = findEmp(employeeList, Employee::getAge, Employee::getName);
        System.out.println("===================");
       list.forEach(System.out::println);




    }

    static List<Employee> findEmp(List<Employee> empList, Function<Employee, Integer> mapper1, Function<Employee, String> mapper2) {

        List<Employee> list1   = empList.stream().filter(emp -> mapper2.apply(emp).equals("Tom Jones") && mapper1.apply(emp) > 45).collect(Collectors.toList());
//        empList.stream().filter(emp -> emp.getAge() > filterValue)
//                .sorted((e1, e2) ->
//                ).collect(Collectors.toList());


return list1;
    }

}

class Employee{

    private String name;
    private Integer age;
    private Double salary;

    public Employee(String name, Integer age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
