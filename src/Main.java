import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        // Формула преобразования температуры  по Фаренгейту в Цельсия: F = C * 1.8 + 32.
//        System.out.println("F = " + (24 * 1.8) + 32);
//
//        Scanner scanner = new Scanner(System.in);
//        double course = scanner.nextInt();
//        double euro = 44.52;
//        double dollar = 43.36;
//
//        System.out.println("Euro: " + course/euro);
//        System.out.println("Dollar: " + course/dollar);

//        System.out.println("*** \tWelcome to BMI \t ***");
//        double weight = new Scanner(System.in).nextDouble();
//        double height = new Scanner(System.in).nextDouble();
//        System.out.println("BMI = " + weight / (height * height));

//        System.out.print("Input first figure:");
//        double a = new Scanner(System.in).nextDouble();
//        System.out.print("Input second figure:");
//        double b = new Scanner(System.in).nextDouble();
//
//        System.out.println(a + " + " + b + " = " + (a + b));
//        System.out.println(a + " - " + b + " = " + (a - b));
//        System.out.println(a + " * " + b + " = " + a * b);
//        System.out.println(a + " / " + b + " = " + a / b);

//        double length ;
//        int speed ;
        int minHour = 60;

        System.out.println("*********************************");

        System.out.print("Put the length:  ");
        double length = new Scanner(System.in).nextDouble();
        System.out.print("Put the speed:  ");
        int speed = new Scanner(System.in).nextInt();
        double kmMin = speed / minHour;
        System.out.println("Time: " + length / kmMin + " min");

    }
}
