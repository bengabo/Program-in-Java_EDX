import java.text.DecimalFormat;
import java.util.Scanner;

public class VacationPlanner {

    public static void  intro(){
        Scanner input = new Scanner(System.in);
        // Takes in user name and destination
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print ("Nice to meet you "+ name + ", where are you travelling? ");
        String destination = input.nextLine();
        System.out.println("Great! " + destination + " sounds like a great trip");
        System.out.println("__________");
    }

    public static void budget(){
        Scanner input = new Scanner(System.in);
        // Takes in days planned on trip, allowance and converting info
        System.out.println("How many days are you going to spend travelling? ");
        int days = input.nextInt();
        System.out.println("How much money, in USD, are you planning to spend on your trip? ");
        int money = input.nextInt();
        System.out.println("What is the letters currency symbol for your travel destination? ");
        String currencySymbol = input.next();
        System.out.println("How many " + currencySymbol + " are there in 1 USD? ");
        double currencyConversion = input.nextDouble();

        int daysConvertedToHours = days * 24;
        int daysConvertedTominutes = (days * 24) * 60;
        double moneyPerDay = (double)money / days;
        double convertedMoney = money * currencyConversion;
        double convertedMoneyPerDay = convertedMoney / days;
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("You'll travel for " + days + " days, that is the same as " + daysConvertedToHours +
                " hours, or " + daysConvertedTominutes + " minutes");
        System.out.println("If you are going to spend " + money + " USD" + " that means per day you can spend up to $"
                + df.format(moneyPerDay) + " USD");
        System.out.println("Your total budget in MXC is " + df.format(convertedMoney) + " " + currencySymbol +
                ", which per day is " + df.format(convertedMoneyPerDay) + " " + currencySymbol);
        System.out.println("__________");
    }

    public static void time(){
        Scanner input = new Scanner(System.in);
        // Takes in the time difference between home and destination
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int timeDifference = input.nextInt();
        int destinationTimeAtMidnight = 12 - timeDifference ;
        System.out.println("At midnight at home, it will be " + destinationTimeAtMidnight +
                ":00 in your travel destination");
    }

    public static void distance(){
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        // Takes in destination between home and destination in square kilometers
        // and converts it into square miles
        System.out.print("What is the square area of your destination country in km2? ");
        int kmSquareArea = input.nextInt();
        double milesSquareArea = kmSquareArea * 0.62137;
        System.out.println("In miles2, that is " + df.format(milesSquareArea));

        // kilometers * 0.62137 = miles
    }
}