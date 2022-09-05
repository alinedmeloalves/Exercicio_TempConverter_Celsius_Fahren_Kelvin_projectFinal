public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao nosso conversor de temperaturas!");
        try {
            TempUnit unitIn = GetTempUnit.getTempUnit("de entrada");
            switch (unitIn) {
                case CELSIUS:
                    CelsiusTo.transform();
                    break;
                case FAHRENHEIT:
                    FahrenheitTo.transform();
                    break;
                case KELVIN:
                    KelvinTo.transform();
                    break;
            }
        } catch (Exception e) {
            System.err.println("ERRO INESPERADO!");
        }
    }
}