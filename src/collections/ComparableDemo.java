package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {

        List<Employeee> employees = new ArrayList<>();

        employees.add(new Employeee(3, "Rakesh", 25000));
        employees.add(new Employeee(1, "Ashwin", 100000));
        employees.add(new Employeee(2, "Shivam", 15000));

        Collections.sort(employees);
        System.out.println(employees);

    }
}

class Employeee implements Comparable<Employeee> {
    int id;
    String name;
    int salary;

    public Employeee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return id + "-" + name + "-" + salary;
    }

    @Override
    public int compareTo(Employeee Employeee) {
        return Integer.compare(this.id, Employeee.id);
    }
}