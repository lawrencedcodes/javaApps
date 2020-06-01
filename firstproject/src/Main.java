public class Main {
     public static void main(String [] args) {
         System.out.println("Hello World");
         ContactsManager myContactsManager = new ContactsManager();
         //make a new contact
         Contact JamesQuick = new Contact();
         JamesQuick.name = "James Quick";
         JamesQuick.email = "jquick@gmail.com";
         JamesQuick.phoneNumber = "9018379201";
         myContactsManager.addContact(JamesQuick);
         //make a new contact
         Contact NinaLockhart = new Contact();
         NinaLockhart.name = "Nina Lockhart";
         NinaLockhart.email = "NinaLockhart@gmail.com";
         NinaLockhart.phoneNumber = "6629329201";
         myContactsManager.addContact(NinaLockhart);
     }
}

class Contact {
    String name;
    String email;
    String phoneNumber;
}

class ContactsManager {
    //fields
    private Contact [] myFriends;
    private int friendsCount;
    //constructor
    ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }
    //method to add contact to myFriends array
    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }
    Contact searchContact(String searchName) {
        (for i=0; i<friendsCount; i++) {
            if(myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}



class RegistrationSystem {
    Students [] myStudents;
    private int studentCount;

    RegistrationSystem() {
        this.studentCount = 0;
        this.myStudents = new Students[50000];
    }

    void addStudent(Student,student) {
        myStudents(studentCount) = student;
        studentCount ++;
    }
}