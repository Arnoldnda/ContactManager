package ci.pigier;

public class contactsManager {
    Contact[] myFriend ;
    int friendCount ;

    //constructor
    public contactsManager (){
        this.myFriend = new Contact[500] ;
        this.friendCount = 0 ;
    }

    //add a contact
    public void addContact(Contact contact){
        this.myFriend[friendCount] = contact ;
        this.friendCount++ ;
    }

    //search a contact
    public Contact searchContact(String name){
        for(int i = 0 ; i < this.friendCount ; i++){
            if(this.myFriend[i].name.equals(name)){
                return  this.myFriend[i];
            }
        }
        return null ;
    }
}
