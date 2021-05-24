import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts = new ArrayList<>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) == -1) {
            this.myContacts.add(contact);
            System.out.println("Contact added with following information: " + contact.getName() + " -> " + contact.getPhoneNumber());
            return true;
        }
        System.out.println("This contact already exist");
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = findContact(oldContact);
        if (index >= 0) {
            this.myContacts.set(index, newContact);
            System.out.println("Current contact information: " + oldContact.getName() + " -> " + oldContact.getPhoneNumber());
            System.out.println("Updated contact information: " + newContact.getName() + " -> " + newContact.getPhoneNumber());
            return true;
        }
        System.out.println("No contact found with this credential: " + oldContact.getName() + " -> " + oldContact.getPhoneNumber());
        return false;
    }

    public boolean removeContact(Contact contact) {
        int index = findContact(contact);
        if (index >= 0) {
            this.myContacts.remove(index);
            System.out.println("Contact found with this credential was removed successfully: " + contact.getName() + " -> " + contact.getPhoneNumber());
            return true;
        }
        System.out.println("No contact found with this credential to remove: " + contact.getName() + " -> " + contact.getPhoneNumber());
        return false;
    }

    private int findContact(Contact contact) {
        return findContact(contact.getName());
    }

    private int findContact(String name) {

        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (name.equals(contact.getName())) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {

        int index = findContact(name);
        if (index >= 0) {
            return this.myContacts.get(index);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(i + 1 + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
