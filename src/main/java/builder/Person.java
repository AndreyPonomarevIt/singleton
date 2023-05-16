package builder;

public class Person {
    private String name;
    private String account;
    private int age;
    private boolean isAlive;

    public Person(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.account = userBuilder.account;
        this.age = userBuilder.age;
        this.isAlive = userBuilder.isAlive;
    }

    public String getName() {
        return getName();
    }

    public String getAccount() {
        return getAccount();
    }

    public boolean isAlive() {
        return isAlive();
    }

    public int getAge() {
        return getAge();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", account='" + account + '\'' +
                ", age=" + age +
                ", isAlive=" + isAlive +
                '}';
    }

    public static class UserBuilder {
        private String name;
        private String account;
        private int age;
        private boolean isAlive;

        public UserBuilder addName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder addAccount(String account) {
            this.account = account;
            return this;
        }

        public UserBuilder addAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder addAlive(boolean alive) {
            isAlive = alive;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

}
