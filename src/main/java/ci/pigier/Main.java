package ci.pigier;

public class Main {
    public static void main (String[] args){
        contactsManager myContactManager = new contactsManager() ;

        Contact contact1 = new Contact("Anna", "0574387073") ;
        myContactManager.addContact(contact1);

        Contact contact2 = new Contact("franck", "0103323253" );
        myContactManager.addContact(contact2);

        Contact contact3 = new Contact("Darelle", "0734563200" );
        myContactManager.addContact(contact3);

        Contact contact4 = new Contact("Ange", "0559500345" );
        myContactManager.addContact(contact4);

        Contact contact5 = new Contact("salvador", "0103234567" );
        myContactManager.addContact(contact5);

        //search a contact
        Contact contact = myContactManager.searchContact("Darelle") ;
        System.out.println("Numero de " + contact.name + " : " + contact.phoneNumber);
    }
}
