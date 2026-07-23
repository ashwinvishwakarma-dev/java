package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(4, "Ashwin", 500000, "IT"));
        employees.add(new Employee(1, "Geethu", 15000, "HR"));
        employees.add(new Employee(3, "Richa", 700000, "Legal"));
        employees.add(new Employee(2, "Ashwin", 900000, "CFO"));

        Comparator<Employee> idComparator = new IDComparator();
        Comparator<Employee> nameComparator = new NameComparator();
        Comparator<Employee> salaryComparator = new SalaryComparator();

        Comparator<Employee> comparator = salaryComparator.reversed()
                .thenComparing(idComparator);

        employees.sort(comparator);
        System.out.println(employees);

    }
}

class Employee {
    int id;
    String name;
    int salary;
    String department;

    public Employee(int id, String name, int salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + ", department='" + department + '\'' + '}';
    }
}

class IDComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.id, o2.id);
    }
}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.salary, e2.salary);
    }
}
