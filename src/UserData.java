import java.util.*;

public class UserData {

    String Name;
    int Age;
    String Profession;
    String Email;

    public UserData(String Name , int Age, String Profession , String Email){
        this.Name = Name;
        this.Age = Age;
        this.Profession = Profession;
        this.Email = Email;

    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getProfession() {
        return Profession;
    }

    public String getEmail() {
        return Email;
    }


    public String toString(){
        return "Name : " + Name + "\nAge:" + Age + "\nProfession : " + Profession + "\nEmail :" + Email;
    }

}