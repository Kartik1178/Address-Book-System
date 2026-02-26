/**
 * AddressBookMain class is the entry point of the Address Book application.
 * It demonstrates UC3 functionality:
 * 1. Adds a new contact using console input
 * 2. Prompts user to enter a name
 * 3. Edits the existing contact details if found
 */
import java.util.Scanner;
public class AddressBookMain {

    public static void main(String[] args) {
        // Display welcome message
        System.out.println("Welcome to Address Book Program");
        // Create AddressBook object to manage contacts
        AddressBook addressBook = new AddressBook();
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
        // Add a new contact via console
        addressBook.addContact();
        // Ask user for the contact name to edit
        System.out.print("\nEnter First Name to Edit Contact: ");
        String name = sc.nextLine();
        // Call method to edit contact details based on name
        addressBook.editContact(name);
    }
}