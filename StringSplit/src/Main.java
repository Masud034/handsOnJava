public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Khan Bahadur Mohammad Abdullah");
        Person person2 = new Person("John");
        Person person3 = new Person("john Doe");

        person1.splitName();
        System.out.println("First Name is: " +person1.getFirstName());
        System.out.println("Last Name is: " +person1.getLastName());
        System.out.println();

        person2.splitName();
        System.out.println("First Name is: " +person2.getFirstName());
        System.out.println("Last Name is: " +person2.getLastName());
        System.out.println();

        person3.splitName();
        System.out.println("First Name is: " +person3.getFirstName());
        System.out.println("Last Name is: " +person3.getLastName());
    }
}
