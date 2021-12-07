package AddressBook;

import java.util.Iterator;

public class Entry {
    private String firstName;
    private String lastName;
    private String phoneNum;
    private String emailAdd;
    
    
    public Entry() {

    }
    public Entry(String firstName, String lastName, String phoneNum, String emailAdd) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.emailAdd = emailAdd;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    public String getEmailAdd() {
        return emailAdd;
    }
    public void setEmailAdd(String emailAdd) {
        this.emailAdd = emailAdd;
    }
    @Override
    public String toString() {
        return "Entry [emailAdd=" + emailAdd + ", firstName=" + firstName + ", lastName" + lastName + ", phoneNum=" + phoneNum + "]";  
    
        }
    public static Iterator<Entry> iterator() {
        return null;
    }
    }

