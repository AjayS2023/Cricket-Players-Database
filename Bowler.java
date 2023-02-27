package CricketDatabase;

public class Bowler extends Cricketer{
    private double bowlingAverage;

    public Bowler(String firstName, String lastName, boolean isRetired, int age, String country, char gender, double bowlingAverage){
        super(firstName, lastName, isRetired, age, country, gender);
        this.bowlingAverage = bowlingAverage;
    }

    public double getBowlingAverage(){
        return bowlingAverage;
    }

    public void setBowlingAverage(double bowlingAverage){
        this.bowlingAverage = bowlingAverage;
    }

    @Override
    public String toString(){
        return "Name: " + this.getFirstName() + " " + this.getLastName() + 
        ", Retired: " + this.isRetired() + 
        " , Age: " + this.getAge() + 
        " , Country: " + this.getCountry() + 
        " , Gender: " + this.getGender() + 
        " , Batting Average " + this.getBowlingAverage();
    }
}
