package Functional.collectors;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToListAndSet {

    public static void main(String[] args) {

        partitioningAndTeeing();
    }

    static void useToListAndToSet(){

        List<String> nonDupList = new ArrayList<>();
        List<String> list = Arrays.asList("a", "b", "a", "c", "d", "abc", "cdef", "abc");
        nonDupList = list.stream().collect(Collectors.toSet())
                .stream().collect(Collectors.toList())
                .stream().collect(Collectors.toUnmodifiableList())
        ;

        try{
            nonDupList.add("nahid");
        } catch (UnsupportedOperationException uex){
            System.out.println(uex);
            nonDupList.forEach(value -> System.out.print(value + " "));
        } finally {

        }
    }

    static void useToCollection(){

        List<String> list = Arrays.asList("a", "b", "a", "c", "d", "abc", "cdef", "abc");

       Set<String> toSet = list.stream().parallel().collect(Collectors.toCollection(TreeSet::new));

        toSet.stream().forEach(System.out::println);
    }

    static void parallelismOperation(){
        Stream.of("AAA","BBB","CCC").parallel().forEach(s->System.out.println("Output:"+s));
        Stream.of("AAA","BBB","CCC").parallel().forEachOrdered(s->System.out.println("Output1:"+s));
    }


    static void collectorsToMap(){
        List<String> list = Arrays.asList("a", "b", "a", "c", "d", "abc", "cdef", "abc");

        list.stream().collect(Collectors.toMap(Function.identity(), String::length, (v, v1)-> v)).entrySet().forEach(System.out::println);
    }


    static void collectingAndThen(){
        List<String> list = Arrays.asList("a", "b", "a", "c", "d", "abc", "cdef", "abc");
        list.stream().collect(Collectors.collectingAndThen(Collectors.groupingBy(String::length), Function.identity()))
                .entrySet().stream().forEach(System.out::println);
    }

    static void collectorsJoining(){
        List<String> list = Arrays.asList("a", "b", "a", "c", "d", "abc", "cdef", "abc");

        String result = list.stream().collect(Collectors.joining(" ", "ARRAY: [", "]"));
        System.out.println(result);
    }


    static void collectorsSummary(){
        List<Integer> list = Arrays.asList(10, 45, 35, 20, 40);

        IntSummaryStatistics result = list.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(result);

        DoubleSummaryStatistics dResult = list.stream().collect(Collectors.summarizingDouble(Integer::doubleValue));
        System.out.println(dResult);

        //average
        List<Double> doubleList = Arrays.asList(10.0, 45.8, 35.9, 20.0, 40.7);
        Double doubleResult = doubleList.stream().collect(Collectors.averagingDouble(Double::doubleValue));
        System.out.println("doubleResult : " + doubleResult);
    }

    static void collectorsMaxByAndMinBy(){
        List<Integer> list = Arrays.asList(10, 45, 35, 20, 40);
        Optional<Integer> result = list.stream().collect(Collectors.maxBy(Comparator.naturalOrder()));
        System.out.println(result);


        Optional<Integer> minResult = list.stream().collect(Collectors.minBy(Comparator.naturalOrder()));
        System.out.println(minResult.get());
    }

    static void partitioningAndTeeing(){

        List<Employee> list = Arrays.asList(new Employee("john", 15000.00),
                                            new Employee("sam", 15000.00),
                                            new Employee("kelly", 46000.99),
                                            new Employee("chris", 46000.98));
//        Map<Double, List<Employee>> map = list.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.toList()));
//        map.entrySet().stream().forEach(System.out::println);

        Map<Boolean, List<Employee>> result = list.stream().collect(Collectors.partitioningBy(employee -> employee.getSalary() > 15000));
        result.entrySet().stream().forEach(System.out::println);
    }


}


class Employee{
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                ", salary=" + salary +
                '}';
    }
}