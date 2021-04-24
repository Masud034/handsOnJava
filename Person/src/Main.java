public class Main {
    public static void main(String[] args) {
        Person john = new Person();

        john.setFirstName("John");
        john.setLastName("Doe");
        john.setAge(28);

        System.out.println(john.getFirstName());
        System.out.println(john.getLastName());
        System.out.println(john.getFullName());
        System.out.println(john.isTeen());
        System.out.println(john.getAge());
    }
}
