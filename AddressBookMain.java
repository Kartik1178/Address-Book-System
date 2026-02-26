import java.util.Scanner;

/**
 * AddressBookMain provides menu-driven interaction
 * to manage multiple AddressBooks and their contacts.
 */
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        AddressBookSystem system = new AddressBookSystem();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Address Book");
            System.out.println("2. Add Contact");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Display Contacts");
            System.out.println("6. Search Person by City");
            System.out.println("7. Search Person by State");
            System.out.println("8. View Persons by City");
            System.out.println("9. View Persons by State");
            System.out.println("10. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            AddressBook book;
            switch (choice) {
                case 1:
                    system.addAddressBook();
                    break;

                case 2:
                    book = system.selectAddressBook();
                    if (book != null) book.addContact();
                    break;
                case 3:
                    book = system.selectAddressBook();
                    if (book != null) {
                        System.out.print("Enter First Name to Edit: ");
                        String editName = sc.nextLine();
                        book.editContact(editName);
                    }
                    break;
                case 4:
                    book = system.selectAddressBook();
                    if (book != null) {
                        System.out.print("Enter First Name to Delete: ");
                        String deleteName = sc.nextLine();
                        book.deleteContact(deleteName);
                    }
                    break;
                case 5:
                    book = system.selectAddressBook();
                    if (book != null) book.displayContacts();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting Address Book System. Goodbye!");
                    break;
                case 7:
                    System.out.print("Enter City: ");
                    String city = sc.nextLine();
                    system.searchPersonByCity(city);
                    break;

                case 8:
                    System.out.print("Enter State: ");
                    String state = sc.nextLine();
                    system.searchPersonByState(state);
                    break;
                case 9:
                    exit = true;
                    System.out.println("Exiting Address Book System. Goodbye!");
                    break;
                default: System.out.println("Invalid choice. Try again.");
            }
        }
    }
}