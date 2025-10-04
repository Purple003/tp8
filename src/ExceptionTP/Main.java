package ExceptionTP;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Calculatrice ===");
        try {
            System.out.println("10 / 0 = " + Calculator.div(10, 0));
        } catch (ArithmeticException e) {
            System.err.println("Erreur : " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("\n=== Lecture fichier ===");
        List<Integer> nums = FileReaderUtil.readNumbers("nombres.txt");
        System.out.println(nums);

        System.out.println("\n=== Validation utilisateurs ===");
        User[] users = { new User("Ali", 20), new User("", 22), new User("Sara", 15) };
        for (User u : users) {
            try {
                u.validate();
                System.out.println(u + " valide");
            } catch (InvalidUserException e) {
                System.err.println("Erreur utilisateur " + u + " : " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
