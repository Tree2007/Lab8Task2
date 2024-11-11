import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yes = InputHelper.getInt(scan, "Enter your favorite int");
        double no = InputHelper.getDouble(scan, "Enter your favorite double");
        System.out.println("Your favorite int and double respectively is: " + yes + " and " + no);
    }
}