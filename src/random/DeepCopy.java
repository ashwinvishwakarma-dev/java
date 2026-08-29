package random;

public class DeepCopy {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Ashwin", new Address("Mumbai"));
		Employee e2 = new Employee(2, "Ashish", new Address("Delhi"));
		
		System.out.println(e1);
		
		Employee e3 = e1.deepCopy();
		System.out.println(e3);
		
		e3.address.city = "Kolkata";
		
		System.out.println(e1);
		System.out.println(e3);
		
	}
}
