package random;

public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {

        Employee e1 = new Employee(1, "Ashwin", new Address("Mumbai"));
        Employee e2 = new Employee(2, "Ashish", new Address("Delhi"));

        System.out.println(e1);

        Employee e3 = e1.clone();
        System.out.println(e3);

        e3.address.city = "Kolkata";

        System.out.println(e1);
        System.out.println(e3);

    }
}

class Employee implements Cloneable {

    String name;
    int id;
    Address address;

    public Employee(int id, String name, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String toString() {
        return id + " " + name + " " + address.city;
    }

    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }

    public Employee deepCopy() {
        return new Employee(this.id, this.name, new Address(this.address.city));
    }

}

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}