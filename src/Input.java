import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.print("Input: ");
        String string = b.nextLine();
        System.out.println("It was " + string);
//        Scanner c = new Scanner(System.in);
        System.out.print("Input: ");
        int x = b.nextInt();
        System.out.println("It was: " + x);
        System.out.print("Input: ");
        double g = b.nextDouble();
        System.out.println("It was: " + g);
    }
}
