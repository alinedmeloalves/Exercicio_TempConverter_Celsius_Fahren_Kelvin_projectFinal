import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GetTemps {
    public static double[] getTemps(double[] tempArray, int i, TempUnit unitIn) {
        try {
            for (int j = 0; j < i; j++) {
                Scanner getTemp = new Scanner(System.in);
                System.out.println("Insira a temperatura " + (j + 1) + " em " + unitIn + ".");
                tempArray[j] = getTemp.nextDouble();
            }
        } catch (InputMismatchException e) {
                System.err.println("Temperatura inválida! Vamos recomeçar.");
                Arrays.fill(tempArray, i);
                getTemps(tempArray, i, unitIn);
        }
        return tempArray;
    }
}
