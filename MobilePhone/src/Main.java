import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MobilePhone mp = new MobilePhone("01961494674");
        String name;
        String number;
        boolean quit = true;

        while (quit) {
            System.out.println("Enter 1 to add new contact\n" +
                    "Enter 2 to update contact\n" +
                    "Enter 3 to remove contact\n" +
                    "Enter 4 to search contact\n" +
                    "Enter 5 to see contact list\n" +
                    "Enter 0 to exit");
            System.out.println();
            System.out.println("Enter your choice:  ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    quit = false;
                    break;
                case 1:
                    System.out.println("Enter name: ");
                    name = scanner.nextLine();
                    System.out.println("Enter Phone Number: ");
                    number = scanner.nextLine();
                    Contact contact = new Contact(name, number);
                    mp.addNewContact(contact);
                    break;
                case 2:
                    System.out.println("Please type your old Contact");
                    System.out.println("Enter name: ");
                    name = scanner.nextLine();
                    System.out.println("Enter Phone Number: ");
                    number = scanner.nextLine();
                    Contact oldContact = new Contact(name, number);

                    System.out.println("Please type your new Contact");
                    System.out.println("Enter name: ");
                    name = scanner.nextLine();
                    System.out.println("Enter Phone Number: ");
                    number = scanner.nextLine();
                    Contact newContact = new Contact(name, number);

                    mp.updateContact(oldContact, newContact);
                    break;
                case 3:
                    System.out.println("Please type your contact information to remove");
                    System.out.println("Enter name: ");
                    name = scanner.nextLine();
                    System.out.println("Enter Phone Number: ");
                    number = scanner.nextLine();
                    Contact removeContact = new Contact(name, number);
                    mp.removeContact(removeContact);
                    break;
                case 4:
                    System.out.println("Type in a name to search contact: ");

                    Contact queryContact = mp.queryContact(scanner.nextLine());
                    if (queryContact != null) {
                        System.out.println("Contact found with following information: " + queryContact.getName() + " -> " + queryContact.getPhoneNumber());
                    } else {
                        System.out.println("Sorry!Contact not found.");
                    }
                    break;
                case 5:
                    mp.printContacts();
                    break;

                default:
                    System.out.println("Wrong Choice!");

            }
        }
    }
}
