package CricketDatabase;

public class Cricketer {
    private String name;
    private boolean isRetired;
    private int age;
    private String country;
    private char gender;

    public Cricketer(String name, boolean isRetired, int age, String country, char gender){
        this.name = name;
        this.isRetired = isRetired;
        this.age = age;
        this.country = country;
        this.gender = gender;
    }   

    public void setName(String name) {
        this.name = name;
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

    public String getName() {
        return name;
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