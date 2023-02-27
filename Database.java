package CricketDatabase;

import java.util.ArrayList;
import java.util.Scanner;


public class Database {
    private ArrayList<Batter> batters = new ArrayList<>();
    private ArrayList<Bowler> bowlers = new ArrayList<>();
    
    public Database(){

        Batter batterOne = new Batter("Rahul Dravid", true, 50, "India", 'M', 40.35);
        Batter batterTwo = new Batter("Virat Kohli", false, 34, "India", 'M', 50.40);
        batters.add(batterOne);
        batters.add(batterTwo);

        Bowler bowlerOne = new Bowler("James Anderson", false, 40, "England", 'M' ,20.30);
        Bowler bowlerTwo = new Bowler("Jofra Archer", false, 25, "England", 'M', 25.32);
        bowlers.add(bowlerOne);
        bowlers.add(bowlerTwo);
    }

    public void addBatter(Batter batter){
        batters.add(batter);
    }

    public void removeBatter(Batter batter){
        batters.remove(batter);
    }

    public void addBowler(Bowler bowler){
        bowlers.add(bowler);
    }

    public void removeBowler(Bowler bowler){
        bowlers.remove(bowler);
    }

    public static void main(String[]args){
        Database newDatabase = new Database();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter batter's name:");
        String name = scan.nextLine();

        System.out.println("Has the batter retired? T or F?");
        boolean isRetired = scan.nextBoolean();

        scan.nextLine();
        
        System.out.println("Enter batter's age: ");
        int age = scan.nextInt();

        System.out.println("Enter batter's country: ");
        String country = scan.nextLine();
        scan.nextLine();

        System.out.println("Enter batter's gender: ");
        String input = scan.next();
        char gender = input.charAt(0);

        System.out.println("Enter batter's batting average: ");
        double battingAverage = scan.nextDouble();

        Batter newBatter = new Batter(name, isRetired, age, country, gender, battingAverage);
        newDatabase.addBatter(newBatter);
        System.out.println(newBatter.getAge());
        
        scan.close();
    }
}