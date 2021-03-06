package Storage;
import java.io.Serializable;
import javax.persistence.*;

@Entity
public class User implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username,password,firstname,surname,phoneNumber,role;

    public User(String username, String password, String firstname, String surname, String phoneNumber, String role) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public void clearUser() {
        this.id = 0;
        this.username = "";
        this.password = "";
        this.firstname = "";
        this.surname = "";
        this.phoneNumber = "";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
