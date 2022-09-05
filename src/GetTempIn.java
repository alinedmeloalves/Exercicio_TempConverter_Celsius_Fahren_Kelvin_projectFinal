import java.util.InputMismatchException;

public class GetTempIn {

    public static double[] getTemp(TempUnit unitIn) {
          int i = (int) GetQuantity.getQuantity();
        double[] tempArray = new double[i];
        return GetTemps.getTemps(tempArray, i, unitIn);
    }
}