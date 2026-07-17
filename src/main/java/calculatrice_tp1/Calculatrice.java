package calculatrice_tp1;

import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("=== Calculatrice ===");
        System.out.println("Premier nombre : ");
        double a = scanner.nextDouble();

        System.out.println("Opérateur (+, -, *, / :");
        String operateur = scanner.next();

        System.out.println("Deuxième nombre : ");
        double b = scanner.nextDouble();

        try {
            double resultat = switch (operateur) {
                case "+" -> addition(a, b);
                case "-" -> soustraction(a, b);
                case "*" -> multiplication(a, b);
                case "/" -> division(a, b);
                default -> throw new IllegalArgumentException("Opérateur inconnu : " + operateur);
            };
            System.out.println("Resultat : " + resultat);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static double addition(double first, double second) {
        return first + second;
    }

    public static double soustraction(double first, double second) {
        return first - second;
    }

    public static double multiplication(double first, double second) {
        return first * second;
    }

    public static double division(double first, double second) {
        if (second == 0) {
            throw new ArithmeticException("Division par zéro impossible");
        }
        return first / second;
    }
}
