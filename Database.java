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
        if (batters.isEmpty()) {
            System.out.println("There are no batters in the database.");
        }
        for (int i = 0; i < batters.size(); i++) {
            System.out.println(batters.get(i).toString());
        }
    }

    public void getAllBowlers() {
        if (bowlers.isEmpty()) {
            System.out.println("There are no bowlers in the database.");
        }
        for (int i = 0; i < bowlers.size(); i++) {
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
            System.out.println("\t 3. Remove a batter from the database.");
            System.out.println("\t 4. Remove a bowler from the database.");
            System.out.println("\t 5. Edit a batter from the database.");
            System.out.println("\t 6. Edit a bowler from the database.");
            System.out.println("\t 7. Show me all batters in the database.");
            System.out.println("\t 8. Show me all bowlers in the database.");
            System.out.println();

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
                    newDatabase.removeBatter(scan, newDatabase);
                    break;

                case 4:
                    newDatabase.removeBowler(scan, newDatabase);
                    break;

                case 5:
                    newDatabase.editBatter(scan, newDatabase);
                    break;

                case 6:
                    newDatabase.editBowler(scan, newDatabase);
                    break;

                case 7:
                    newDatabase.getAllBatters();
                    break;

                case 8:
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

        System.out.println("Has the batter retired? Y or N?");
        char retired = scan.nextLine().charAt(0);
        boolean isRetired;
        if(retired == 'Y'){
            isRetired = true;
        } else {
            isRetired = false;
        }

        System.out.println("Enter batter's age: ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter batter's country: ");
        String country = scan.nextLine();

        System.out.println("Enter batter's gender. M or F?");
        String input = scan.next();
        char gender = input.charAt(0);

        System.out.println("Enter batter's batting average: ");
        double battingAverage = scan.nextDouble();

        Batter newBatter = new Batter(fName, lName, isRetired, age, country, gender, battingAverage);
        database.addBatter(newBatter);
    }

    public void makeNewBowler(Scanner scan, Database database) {
        Bowler newBowler;

        System.out.println("Enter bowler's first name:");
        String fName = scan.nextLine();

        System.out.println("Enter bowler's last name:");
        String lName = scan.nextLine();

        System.out.println("Has the bowler retired? Y or N?");
        char retired = scan.nextLine().charAt(0);
        boolean isRetired;
        if (retired == 'Y') {
            isRetired = true;
        } else {
            isRetired = false;
        }

        System.out.println("Enter bowler's age: ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter bowler's country: ");
        String country = scan.nextLine();

        System.out.println("Enter bowler's gender. M or F?");
        String input = scan.next();
        char gender = input.charAt(0);

        System.out.println("Enter bowler's bowling average: ");
        double bowlingAverage = scan.nextDouble();

        newBowler = new Bowler(fName, lName, isRetired, age, country, gender, bowlingAverage);
        database.addBowler(newBowler);
    }

    public void removeBatter(Scanner scan, Database database) {
        if (batters.isEmpty()) {
            System.out.println("There are no batters in the database.");
            return;
        }

        System.out.println("What is the first name of the batter you wish to remove?");
        String fName = scan.nextLine();
        boolean exists = false;

        for (int i = 0; i < batters.size(); i++) {
            if (batters.get(i).getFirstName().equals(fName)) {
                System.out.println("What is the last name of the batter you wish to remove?");
                String lName = scan.nextLine();

                if (batters.get(i).getLastName().equals(lName)) {
                    database.removeBatter(batters.get(i));
                    System.out.println("We have removed the batter.");
                    exists = true;
                    break;
                }
            }
        }

        if (!exists) {
            System.out.println("This batter does not exist.");
        }
    }

    public void removeBowler(Scanner scan, Database database) {
        if (bowlers.isEmpty()) {
            System.out.println("There are no bowlers in the database.");
            return;
        }

        System.out.println("What is the first name of the bowler you wish to remove?");
        String fName = scan.nextLine();
        boolean exists = false;

        for (int i = 0; i < bowlers.size(); i++) {
            if (bowlers.get(i).getFirstName().equals(fName)) {
                System.out.println("What is the last name of the bowler you wish to remove?");
                String lName = scan.nextLine();

                if (bowlers.get(i).getLastName().equals(lName)) {
                    database.removeBowler(bowlers.get(i));
                    System.out.println("We have removed the bowler.");
                    exists = true;
                    break;
                }
            }
        }

        if (!exists) {
            System.out.println("This bowler does not exist.");
        }
    }

    public void editBatter(Scanner scan, Database database) {
        if (batters.isEmpty()) {
            System.out.println("There are no batters in the database.");
            return;
        }

        System.out.println("What is the first name of the batter you would like to edit?");
        String fName = scan.nextLine();
        boolean exists = false;

        for (int i = 0; i < batters.size(); i++) {
            if (batters.get(i).getFirstName().equals(fName)) {
                System.out.println("What is the last name of the batter you wish to edit?");
                String lName = scan.nextLine();

                if (batters.get(i).getLastName().equals(lName)) {
                    exists = true;
                    System.out.println("Enter batter's first name:");
                    String newFName = scan.nextLine();

                    System.out.println("Enter batter's last name: ");
                    String newLName = scan.nextLine();

                    System.out.println("Has the batter retired? Y or N?");
                    char retired = scan.nextLine().charAt(0);
                    boolean isRetired;
                    if (retired == 'Y') {
                        isRetired = true;
                    } else {
                        isRetired = false;
                    }

                    System.out.println("Enter batter's age: ");
                    int age = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Enter batter's country: ");
                    String country = scan.nextLine();

                    System.out.println("Enter batter's gender. M or F?");
                    String input = scan.next();
                    char gender = input.charAt(0);

                    System.out.println("Enter batter's batting average: ");
                    double battingAverage = scan.nextDouble();

                    Batter savedBatter = batters.get(i);
                    savedBatter.setFirstName(newFName);
                    savedBatter.setLastName(newLName);
                    savedBatter.setRetired(isRetired);
                    savedBatter.setAge(age);
                    savedBatter.setCountry(country);
                    savedBatter.setGender(gender);
                    savedBatter.setBattingAverage(battingAverage);

                    database.removeBatter(batters.get(i));
                    database.addBatter(savedBatter);

                    System.out.println("The batter has been modified.");
                }
            }
        }

        if (!exists) {
            System.out.println("This batter does not exist.");
        }
    }

    public void editBowler(Scanner scan, Database database) {
        if (bowlers.isEmpty()) {
            System.out.println("There are no bowlers in the database.");
            return;
        }

        System.out.println("What is the first name of the bowler you would like to edit?");
        String fName = scan.nextLine();
        boolean exists = false;

        for (int i = 0; i < bowlers.size(); i++) {
            if (bowlers.get(i).getFirstName().equals(fName)) {
                System.out.println("What is the last name of the bowler you wish to edit?");
                String lName = scan.nextLine();

                if (bowlers.get(i).getLastName().equals(lName)) {
                    exists = true;
                    System.out.println("Enter bowler's first name:");
                    String newFName = scan.nextLine();

                    System.out.println("Enter bowler's last name: ");
                    String newLName = scan.nextLine();

                    System.out.println("Has the bowler retired? Y or N?");
                    char retired = scan.nextLine().charAt(0);
                    boolean isRetired;
                    if (retired == 'Y') {
                        isRetired = true;
                    } else {
                        isRetired = false;
                    }

                    System.out.println("Enter bowler's age: ");
                    int age = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Enter bowler's country: ");
                    String country = scan.nextLine();

                    System.out.println("Enter bowler's gender. M or F?");
                    String input = scan.next();
                    char gender = input.charAt(0);

                    System.out.println("Enter bowler's bowling average: ");
                    double bowlingAverage = scan.nextDouble();

                    Bowler savedBowler = bowlers.get(i);
                    savedBowler.setFirstName(newFName);
                    savedBowler.setLastName(newLName);
                    savedBowler.setRetired(isRetired);
                    savedBowler.setAge(age);
                    savedBowler.setCountry(country);
                    savedBowler.setGender(gender);
                    savedBowler.setBowlingAverage(bowlingAverage);

                    database.removeBowler(bowlers.get(i));
                    database.addBowler(savedBowler);

                    System.out.println("The bowler has been modified.");
                }
            }
        }

        if (!exists) {
            System.out.println("This bowler does not exist.");
        }
    }
}