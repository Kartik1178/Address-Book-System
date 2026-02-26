import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        // Add contact
        addressBook.addContact();
        // Edit contact
        System.out.print("\nEnter First Name to Edit Contact: ");
        String editName = sc.nextLine();
        addressBook.editContact(editName);
        // Delete contact
        System.out.print("\nEnter First Name to Delete Contact: ");
        String deleteName = sc.nextLine();
        addressBook.deleteContact(deleteName);
    }
}