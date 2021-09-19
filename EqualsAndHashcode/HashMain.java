package EqualsAndHashcode;

import EqualsAndHashcode.emp.Address;
import EqualsAndHashcode.emp.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMain {

    public static void main(String[] args) {

        Employee emp1 = new Employee(110L, "Ramesh");
        Address address1 = new Address(90, "54 street", "New York", 10036);
        System.out.println("address1 " + address1.hashCode());

        Employee emp2 = new Employee(200L, "John doe");
        Address address2 = new Address(90, "54 street", "New York", 10036);
        System.out.println("address2 " + address2.hashCode());

        Map<Employee, Address> map = new HashMap<>();
        map.put(emp1, address1);
        map.put(emp2, address2);

      //  System.out.println(getAddress(map, new Employee(200L, "John doe")));
        List<Employee> employees = getAddressOfEmployee(map,
                new Address(90, "54 street", "New York", 10036));
        employees.stream().forEach(System.out::println);


    }

        static String getAddress(Map<Employee, Address> map , Employee employee){

                Address address = map.get(employee);
            System.out.println("employeeObjectId " + employee.hashCode());
                return address.getAddress();
        }


    static List<Employee> getAddressOfEmployee(Map<Employee, Address> map , Address address){
        ArrayList<Employee> addressList = new ArrayList<>();
        System.out.println("address : " + address.hashCode());

        for (Map.Entry<Employee, Address> employeeAddressEntry : map.entrySet()){
            System.out.println("address : " + employeeAddressEntry.getValue().hashCode());
            if(employeeAddressEntry.getValue().equals(address))
            addressList.add(employeeAddressEntry.getKey());
        }

       return addressList;
    }
}
