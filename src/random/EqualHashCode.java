package random;

import java.util.HashSet;
import java.util.Objects;

public class EqualHashCode {
    public static void main(String[] args) {
        Employee s1 = new Employee(1,"Ashwin");
        Employee s2 = new Employee(1,"Shivam");

        HashSet<Employee> set = new HashSet<>();

        set.add(s1);
        set.add(s2);

        System.out.println(set.size());
    }
}

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Employee e = (Employee) object;
        return id == e.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }
}
