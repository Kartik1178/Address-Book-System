import java.util.Scanner;

/**
 * AddressBookMain class provides a menu-driven console
 * to perform operations: Add, Edit, Delete, Display Contacts.
 */
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    System.out.print("Enter First Name to Edit: ");
                    String editName = sc.nextLine();
                    addressBook.editContact(editName);
                    break;
                case 3:
                    System.out.print("Enter First Name to Delete: ");
                    String deleteName = sc.nextLine();
                    addressBook.deleteContact(deleteName);
                    break;
                case 4:
                    addressBook.displayContacts();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting Address Book. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}