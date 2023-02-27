package CricketDatabase;

public class Cricketer {
    private String firstName;
    private String lastName;
    private boolean isRetired;
    private int age;
    private String country;
    private char gender;

    public Cricketer(String firstName, String lastName, boolean isRetired, int age, String country, char gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.isRetired = isRetired;
        this.age = age;
        this.country = country;
        this.gender = gender;
    }   

    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    public void setLastName(String lName){
        this.lastName = lName;
    }

    public void setRetired(boolean retired) {
        this.isRetired = retired;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public boolean isRetired(){
        return isRetired;
    }

    public int getAge(){
        return age;
    }

    public String getCountry(){
        return country;
    }

    public char getGender(){
        return gender;
    }
}