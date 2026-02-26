
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        Contact person = new Contact(
                "Kartikeya",
                "Pusapati",
                "Ambattur",
                "Chennai",
                "Tamil Nadu",
                "600053",
                "9876543210",
                "kartikeya@email.com"
        );

        person.displayContact();
    }
}