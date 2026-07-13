package design_pattern.creational;

public class Prototype {
    public static void main(String[] args) throws Exception {
        Employee e1 = new Employee("Ashwin", 18, new Address("Mumbai"));
        System.out.println(e1);

        Employee e2 = e1.deepCopy();
        e2.address.city = "Delhi";

        System.out.println(e1);
        System.out.println(e2);
    }
}

class Employee implements Cloneable {
    String name;
    int age;
    Address address;

    public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;

    }

    public Employee deepCopy() {
        return new Employee(name, age, new Address(address));
    }

    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", Address='" + address.city + "'" + "}";
    }

}

class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }

    public Address(Address address) {
        this.city = address.city;
    }
}
