import java.util.InputMismatchException;
import java.util.Scanner;

public class GetQuantity {
    public static double getQuantity(){
        double a;
        try {
            Scanner getQuantity = new Scanner(System.in);
            System.out.println("Quantas temperaturas serão convertidas?");
            a = getQuantity.nextDouble();
        } catch (InputMismatchException e) {
            System.err.println("Quantidade inválida!");
            a = 1;
            getQuantity();
        }
        if (a == 0) {
            System.err.println("Quantidade inválida! Digite pelo menos uma temperatura.");
            a = 1;
        }

        return a;
    }
}
