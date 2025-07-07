import java.util.*;

public class RegisterUser {

    Scanner sc = new Scanner(System.in);

    LinkedList<UserData> UserList;
    HashSet<String> RegisteredEmail;


    public RegisterUser() {
        UserList = new LinkedList<>();
        RegisteredEmail = new HashSet<>();
    }

    public void RegisterNewUser() {

        System.out.println("What is your name?");
        String Name = sc.nextLine();

        System.out.println("What is your age?");
        int Age = sc.nextInt();
        sc.nextLine();  // Consume newline

        System.out.println("Whats is your profession?");
        String Profession = sc.nextLine();

        System.out.println("Enter your email address ");
        String Email = sc.nextLine();

        if (RegisteredEmail.contains(Email)) {
            System.out.println("This email is already linked to another user, Try Again!!");
            return;
        }

        UserData User = new UserData(Name, Age, Profession, Email);
        UserList.add(User);
        RegisteredEmail.add(Email);

        System.out.println("User registered successfully");
    }


    public void RemoveUser(){

        System.out.println("Type the Name of person you want to remove!");
        String removeByEmail = sc.nextLine();

        if(!RegisteredEmail.contains(removeByEmail)){

            System.out.println("No user is found with this Name");

            return;

        }

        RegisteredEmail.remove(removeByEmail);

        UserData toRemove = null;
        for(UserData user : UserList){

            if(user.getEmail().equals(removeByEmail)){
                toRemove = user;
                break;
            }
        }


        if(toRemove != null){

            UserList.remove(toRemove);

            System.out.println("User removed Successfully");

        }

        else{

            System .out.println("Error : User found in email set but not in the List");


        }

    }

    public LinkedList<UserData> getUserList() {
        return UserList;
    }



}

