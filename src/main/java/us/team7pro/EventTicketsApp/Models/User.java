package us.team7pro.EventTicketsApp.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="debug", initialValue=0)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="debug") // To ensure general user has 0 as userID.
    private int userID;

    // User, Admin, Organizer
    private String role;
    private String userName;
    private String password;
    private String email;
    private int[] transactions;

    public User() {}

    public User( String role, String userName, String password, String email, int[] transactions) {
        this.role = role;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.transactions = transactions;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public void setTransactions(int[] transactions) {
        this.transactions = transactions;
    }
}
