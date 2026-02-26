/**
 * AddressBook class manages a collection of Contact objects.
 * It provides functionality to:
 * 1. Add a new contact using console input
 * 2. Edit an existing contact based on first name
 * This demonstrates OOP relationship where AddressBook has multiple Contacts.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AddressBook {
    private List<Contact> contactList = new ArrayList<>();
    // Method to add a new contact using user input from console
    public void addContact() {
        Scanner sc = new Scanner(System.in);
        // Taking user input for contact details
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter City: ");
        String city = sc.nextLine();
        System.out.print("Enter State: ");
        String state = sc.nextLine();
        System.out.print("Enter Zip: ");
        String zip = sc.nextLine();
        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        // Creating Contact object and adding it to the list
        Contact person = new Contact(firstName, lastName, address, city, state, zip, phone, email);
        boolean isDuplicate=contactList.stream().anyMatch(contact -> contact.equals(person));
        if (isDuplicate) {
            System.out.println("\nDuplicate contact found. Cannot add the same person again.");
        } else {
            contactList.add(person);
            System.out.println("\nContact Added Successfully!\n");
            person.displayContact();
        }
    }
    // Method to edit an existing contact by searching with first name
    public void editContact(String name) {
        Scanner sc = new Scanner(System.in);
        // Iterate through contact list to find matching contact
        for (Contact contact : contactList) {
            if (contact.getFirstName().equalsIgnoreCase(name)) {
                // Updating contact details using setters
                System.out.print("Enter new Address: ");
                contact.setAddress(sc.nextLine());
                System.out.print("Enter new City: ");
                contact.setCity(sc.nextLine());
                System.out.print("Enter new State: ");
                contact.setState(sc.nextLine());

                System.out.print("Enter new Zip: ");
                contact.setZip(sc.nextLine());
                System.out.print("Enter new Phone Number: ");
                contact.setPhoneNumber(sc.nextLine());
                System.out.print("Enter new Email: ");
                contact.setEmail(sc.nextLine());
                // Display updated contact details
                System.out.println("\nContact Updated Successfully!\n");
                contact.displayContact();
                return;
            }
        }
        // Message if no matching contact is found
        System.out.println("Contact not found.");
    }
    // Method to delete a contact by searching with first name
    public void deleteContact(String name) {
        for (Contact contact : contactList) {
            if (contact.getFirstName().equalsIgnoreCase(name)) {
                contactList.remove(contact);
                System.out.println("\nContact Deleted Successfully!\n");
                return;
            }
        }
        // Message if contact is not found
        System.out.println("Contact not found.");
    }
    // Method to display all contacts in the address book
    public void displayContacts() {
        if (contactList.isEmpty()) {
            System.out.println("\nNo contacts available.");
            return;
        }

        System.out.println("\nContact List");
        for (Contact contact : contactList) {
            contact.displayContact();
            System.out.println(" ");
        }
    }
    public List<Contact> getContactList() {
        return contactList;
    }
    public void sortContactsByName() {
        contactList.stream().sorted((c1, c2) -> c1.getFirstName().compareToIgnoreCase(c2.getFirstName())).forEach(contact -> {
            System.out.println(contact);
        });
    }

// Method to sort contacts by State
public void sortByState() {
    contactList.stream()
            .sorted((c1, c2) -> c1.getState()
                    .compareToIgnoreCase(c2.getState()))
            .forEach(contact -> {
                System.out.println(contact);
                System.out.println("---------------------");
            });
}
public void sortByZip(){
        contactList.stream().sorted((c1,c2)->c1.getZip().compareToIgnoreCase(c2.getZip())).forEach(e->  {System.out.println(e);});


}

}