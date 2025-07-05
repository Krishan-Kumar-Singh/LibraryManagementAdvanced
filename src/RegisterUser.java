import java.util.*;

public class RegisterUser{

     LinkedList<UserData> UserList;
     HashSet<String> RegisteredEmail;

    public RegisterUser(){
        UserList = new LinkedList<>();
        RegisteredEmail = new HashSet<>();
    }

    public void RegisterNewUser(){

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String Name = sc.nextLine();

        System.out.println("What is your age?");
        int Age= sc.nextInt();

        System.out.println("Whats is your profession?");
        String Profession = sc.nextLine();
        sc.nextLine();

        System.out.println("Enter your email address ");
        String Email = sc.nextLine();

        if(RegisteredEmail.contains(Email)){
            System.out.println("This email is already linked to another user, Try Again!!");
            return;

        }

        UserData User = new UserData(Name,Age,Profession,Email);
        UserList.add(User);
        RegisteredEmail.add(Email);

        System.out.println("User registered successfully");

    }

    public LinkedList<UserData> getUserList() {
        return UserList;
    }
}