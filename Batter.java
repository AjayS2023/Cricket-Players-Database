package CricketDatabase;

public class Batter extends Cricketer{
    private double battingAverage;

    public Batter(String firstName, String lastName, boolean isRetired, int age, String country, char gender, double battingAverage){
        super(firstName, lastName, isRetired, age, country, gender);
        this.battingAverage = battingAverage;
    }

    public double getBattingAverage(){
        return battingAverage;
    }

    public void setBattingAverage(double battingAverage){
        this.battingAverage = battingAverage;
    }

    @Override
    public String toString(){
        return "Name: " + this.getFirstName() + " " + this.getLastName() + 
        ", Retired: " + this.isRetired() + 
        " , Age: " + this.getAge() + 
        " , Country: " + this.getCountry() + 
        " , Gender: " + this.getGender() + 
        " , Batting Average " + this.getBattingAverage();
    }
}