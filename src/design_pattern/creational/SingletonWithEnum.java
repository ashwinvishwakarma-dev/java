package design_pattern.creational;

public class SingletonWithEnum {

    public static void main(String[] args) {
        EnumSingleton s1 = EnumSingleton.getInstance();
        System.out.println(s1);
    }

}

enum EnumSingleton {
    INSTANCE;

    public static EnumSingleton getInstance() {
        return INSTANCE ;
    }
}
