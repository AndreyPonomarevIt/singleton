package builder;

public class PersonRunner {
    public static void main(String[] args) {
        Person.UserBuilder userBuilder = new Person.UserBuilder();
        Person person = userBuilder.addAlive(true).addName("Fed").addAccount("Nik").build();
        System.out.println(person);
        System.out.println(person.getName());

    }

}
