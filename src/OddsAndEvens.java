import java.util.Scanner;

public class OddsAndEvens {
    public static void oddsAndEvensGame(){
        System.out.println("Let’s play a game called \"Odds and Evens\"");
        System.out.print("What's your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.print("Hi " + name + ", Which do you choose? (O)dds or (E)vens? ");
        String gamerChoice = input.next();
        if(gamerChoice.equalsIgnoreCase("O")){
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else {
            System.out.println(name + " has picked evens! The computer will be odds.");
        }
    }

}
