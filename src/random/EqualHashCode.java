package random;

import java.util.HashSet;
import java.util.Objects;

public class EqualHashCode {
    public static void main(String[] args) {
        Employee1 s1 = new Employee1(1, "Ashwin");
        Employee1 s2 = new Employee1(1, "Shivam");

        HashSet<Employee1> set = new HashSet<>();

        set.add(s1);
        set.add(s2);

        System.out.println(set.size());
    }
}

class Employee1 {
    int id;
    String name;

    Employee1(int id, String name) {
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
        Employee1 e = (Employee1) object;
        return id == e.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }
}
