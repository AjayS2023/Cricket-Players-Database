package CricketDatabase;

import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    private ArrayList<Batter> batters = new ArrayList<>();
    private ArrayList<Bowler> bowlers = new ArrayList<>();

    public Database() {

        Batter batterOne = new Batter("Rahul", "Dravid", true, 50, "India", 'M', 40.35);
        Batter batterTwo = new Batter("Virat", "Kohli", false, 34, "India", 'M', 50.40);
        batters.add(batterOne);
        batters.add(batterTwo);

        Bowler bowlerOne = new Bowler("James", "Anderson", false, 40, "England", 'M', 20.30);
        Bowler bowlerTwo = new Bowler("Jofra", "Archer", false, 25, "England", 'M', 25.32);
        bowlers.add(bowlerOne);
        bowlers.add(bowlerTwo);
    }

    public void addBatter(Batter batter) {
        batters.add(batter);
    }

    public void removeBatter(Batter batter) {
        batters.remove(batter);
    }

    public void addBowler(Bowler bowler) {
        bowlers.add(bowler);
    }

    public void removeBowler(Bowler bowler) {
        bowlers.remove(bowler);
    }

    public void getAllBatters() {
        for(int i = 0; i < batters.size(); i++){
            System.out.println(batters.get(i).toString());
        }
    }

    public void getAllBowlers() {
        for(int i = 0; i < bowlers.size(); i++){
            System.out.println(bowlers.get(i).toString());
        }
    }

    public static void main(String[] args) {

        Database newDatabase = new Database();
        Scanner scan = new Scanner(System.in);
        int num = 0;

        while (num != 10) {
            System.out.println("Please select an option from the below menu by typing a number: ");
            System.out.println("\t 1. Add a batter to the database.");
            System.out.println("\t 2. Add a bowler to the database.");
            System.out.println("\t 3. Show me all batters in the database.");
            System.out.println("\t 4. Show me all bowlers in the database.");

            num = scan.nextInt();
            scan.nextLine();

            switch (num) {
                case 1:
                    newDatabase.makeNewBatter(scan, newDatabase);
                    break;
                case 2:
                    newDatabase.makeNewBowler(scan, newDatabase);
                    break;

                case 3:
                    newDatabase.getAllBatters();
                    break;

                case 4:
                    newDatabase.getAllBowlers();
                    break;
            }
        }
    }

    public void makeNewBatter(Scanner scan, Database database) {
        System.out.println("Enter batter's first name:");
        String fName = scan.nextLine();

        System.out.println("Enter batter's last name: ");
        String lName = scan.nextLine();

        System.out.println("Has the batter retired?");
        boolean isRetired = scan.nextBoolean();

        scan.nextLine();

        System.out.println("Enter batter's age: ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter batter's country: ");
        String country = scan.nextLine();

        System.out.println("Enter batter's gender: ");
        String input = scan.next();
        char gender = input.charAt(0);

        System.out.println("Enter batter's batting average: ");
        double battingAverage = scan.nextDouble();

        Batter newBatter = new Batter(fName, lName, isRetired, age, country, gender, battingAverage);
        database.addBatter(newBatter);
    }

    public void makeNewBowler(Scanner scan, Database database) {
        System.out.println("Enter bowler's first name:");
        String fName = scan.nextLine();

        System.out.println("Enter bowler's last name:");
        String lName = scan.nextLine();
        
        System.out.println("Has the bowler retired?");
        boolean isRetired = scan.nextBoolean();

        scan.nextLine();

        System.out.println("Enter bowler's age: ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter bowler's country: ");
        String country = scan.nextLine();

        System.out.println("Enter bowler's gender: ");
        String input = scan.next();
        char gender = input.charAt(0);

        System.out.println("Enter bowler's bowling average: ");
        double bowlingAverage = scan.nextDouble();

        Bowler newBowler = new Bowler(fName, lName, isRetired, age, country, gender, bowlingAverage);
        database.addBowler(newBowler);
    }
}