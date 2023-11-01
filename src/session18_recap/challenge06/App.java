package session18_recap.challenge06;

public class App {

    public static void main(String[] args) {
        Employee john = new Employee("John", "IT", 2500);
        System.out.println("Initial salary: " + john.getSalary());
        deductTaxes(john, 500);
        System.out.println("Salary after deduction: " + john.getSalary());

        giveRaise(john, 1000);
        System.out.println("Salary after a raise: " + john.getSalary());

        printYearlyEarnings(john);
    }

    private static void giveRaise(Employee employee, double amount) {
        double newSalary = employee.getSalary() + amount;
        employee.setSalary(newSalary);
    }

    private static void deductTaxes(Employee employee, double amount) {
        double salaryAfterTaxes = employee.getSalary() - amount;
        employee.setSalary(salaryAfterTaxes);
    }

    private static void printYearlyEarnings(Employee employee) {
        System.out.println("Yearly earnings: " + employee.getSalary() * 12);
    }
}
