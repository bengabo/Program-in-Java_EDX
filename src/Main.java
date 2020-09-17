import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        scannerMethod();
    }

    public static void  intVariables(){
        int first = 8;
        int second = 19;
        first += second;
        second = first - second;
        first += second;
        System.out.println(first);
        System.out.println(second);
    }

    public static void concatenation(){
        System.out.println(1 + 2 + "3" + 4 + 5);
        System.out.println(1 + 0 + "0" + 5 * 10);
        int x = (int) (10.0 / 3.0);
        System.out.println(x);
    }

    public static void scannerMethod(){
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = input.nextLine();
        System.out.println("Welcome " + name + "!");
    }
}
