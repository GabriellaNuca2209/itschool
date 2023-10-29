package session17_streams.challenges.challenge12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        Employee alice = new Employee("Alice", Department.IT, 2500);
        Employee lucas = new Employee("Lucas", Department.IT, 2700);

        Employee bob = new Employee("Bob", Department.MARKETING, 1800);
        Employee frank = new Employee("Bob", Department.MARKETING, 2000);

        Employee martin = new Employee("Martin", Department.PM, 2500);
        Employee gary = new Employee("Martin", Department.PM, 2300);

        List<Employee> employeeList = new ArrayList<>(List.of(alice, lucas, bob, frank, martin, gary));

        Map.Entry<Department, Double> bestPayingDepartment = employeeList.stream()
                .collect(Collectors.toMap(Employee::getDepartment, Employee::getSalary, Double::sum))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get();

        System.out.println(bestPayingDepartment);
    }
}
