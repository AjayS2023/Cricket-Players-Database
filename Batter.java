package CricketDatabase;

public class Batter extends Cricketer{
    private double battingAverage;

    public Batter(String name, boolean isRetired, int age, String country, char gender, double battingAverage){
        super(name, isRetired, age, country, gender);
        this.battingAverage = battingAverage;
    }

    public double getBattingAverage(){
        return battingAverage;
    }

    public void setBattingAverage(double battingAverage){
        this.battingAverage = battingAverage;
    }
}