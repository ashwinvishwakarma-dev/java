package design_pattern.structural;

public class Decorator {
    public static void main(String[] args) {
        Coffee coffee = new SimpleeCoffee();

        Coffee milkCoffee = new MilkCoffee(new SimpleeCoffee());

        Coffee creamCoffee = new CreamCoffee(milkCoffee);

        Coffee iceCoffee = new IceCoffee(new CreamCoffee(new MilkCoffee(new SimpleeCoffee())));

        System.out.println(milkCoffee.cost());

    }
}


interface Coffee {
    int cost();
}

// All the class have Duplicate code for Coffe. So, we can create abstract class to share the same state and initialized object
abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    protected CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}

class SimpleeCoffee implements Coffee {

    @Override
    public int cost() {
        return 100;
    }
}

class MilkCoffee extends CoffeeDecorator {

    protected MilkCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return coffee.cost() + 30;
    }
}

class CreamCoffee implements Coffee {
    private final Coffee coffee;

    protected CreamCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return coffee.cost() + 50;
    }
}

class IceCoffee implements Coffee {
    private final Coffee coffee;

    protected IceCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return coffee.cost() + 20;
    }
}

