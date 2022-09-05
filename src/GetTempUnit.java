import java.util.Scanner;

public class GetTempUnit {
    public static TempUnit getTempUnit(String in_outUnit) {
        Scanner tempUnit = new Scanner(System.in);
        System.out.println("Insira a unidade da(s) temperatura(s) " + in_outUnit + ".\n" +
                " ________________________________\n" +
                "|______________MENU______________|\n" +
                "|-------------CELSIUS------------|\n" +
                "|------------FAHRENHEIT----------|\n" +
                "|-------------KELVIN-------------|\n" +
                "|________________________________|");
        String unitType = tempUnit.nextLine().toUpperCase();
        try {
            return TempUnit.valueOf(unitType);

        } catch (IllegalArgumentException e) {
            System.err.println("Unidade inválida!");
            return  getTempUnit("novamente");
        }
    }
}
