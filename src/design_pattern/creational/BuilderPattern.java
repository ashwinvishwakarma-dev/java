package design_pattern.creational;

public class BuilderPattern {
    public static void main(String[] args) {
        User user = new User.Builder()
                .setName("Ashwin")
                .setAge(29)
                .setCity("Mumbai")
                .build();

        System.out.println(user);
    }
}

class User {
    String name;
    int age;
    char gender;
    String city;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.city = builder.city;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", city='" + city + '\'' +
                '}';
    }

    static class Builder {
        String name;
        int age;
        char gender;
        String city;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(char gender) {
            this.gender = gender;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public User build() {
            if (name == null) {
                throw new IllegalArgumentException("Name Cannot be Null");
            }
            return new User(this);
        }
    }
}
