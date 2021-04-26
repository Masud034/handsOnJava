public class Person {
    private String name;
    private String firstName;
    private String lastName;

    public Person(String name) {
        this.name = name;
    }

    public void splitName() {
        String[] splitted = name.split(" ", 2);

        if (splitted.length == 1) {
            this.firstName = splitted[0];
            this.lastName = null;
        } else {
            this.firstName = splitted[0];
            this.lastName = splitted[1];
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
