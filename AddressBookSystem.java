import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * AddressBookSystem manages multiple AddressBook instances.
 * Each AddressBook is stored with a unique name using a Map.
 */
public class AddressBookSystem {
    private Map<String, AddressBook> addressBookMap = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    // Method to add a new AddressBook
    public void addAddressBook() {
        System.out.print("Enter Address Book Name: ");
        String bookName = sc.nextLine();

        if (addressBookMap.containsKey(bookName)) {
            System.out.println("Address Book already exists!");
        } else {
            addressBookMap.put(bookName, new AddressBook());
            System.out.println("Address Book '" + bookName + "' created successfully.");
        }
    }

    // Method to select an AddressBook
    public AddressBook selectAddressBook() {
        System.out.print("Enter Address Book Name: ");
        String bookName = sc.nextLine();

        if (addressBookMap.containsKey(bookName)) {
            return addressBookMap.get(bookName);
        } else {
            System.out.println("Address Book not found.");
            return null;
        }
    }
}