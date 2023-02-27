package CricketDatabase;

public class Bowler extends Cricketer{
    private double bowlingAverage;

    public Bowler(String name, boolean isRetired, int age, String country, char gender, double bowlingAverage){
        super(name, isRetired, age, country, gender);
        this.bowlingAverage = bowlingAverage;
    }

    public double getBowlingAverage(){
        return bowlingAverage;
    }

    public void setBowlingAverage(double bowlingAverage){
        this.bowlingAverage = bowlingAverage;
    }
}
