
public class CelsiusTo {
    public static void transform() {
        TempUnit unitOut = GetTempUnit.getTempUnit("de saída");
        double[] tempsInCelsius = GetTempIn.getTemp(TempUnit.CELSIUS);
        double sumCelsius = 0;
        for (double tempIn : tempsInCelsius) {
            sumCelsius += tempIn;
        }
        double averageCelsius = sumCelsius / tempsInCelsius.length;
        switch (unitOut) {
            case FAHRENHEIT:
                int i = tempsInCelsius.length;
                double[] tempsOutFahrenheit = new double [i];
                i = 0;
                for (double tempIn : tempsInCelsius){
                    double tempOutFahrenheit = tempIn * 9.0 / 5 + 32;
                    System.out.printf("A temperatura em Celsius é %.2f\n", tempIn);
                    System.out.printf("A temperatura em Fahrenheit é %.2f\n", tempOutFahrenheit);
                    tempsOutFahrenheit[i] = tempOutFahrenheit;
                    i++;
                }
                double sumFahrenheit = 0;
                for (double tempIn : tempsOutFahrenheit) {
                    sumFahrenheit += tempIn;
                }
                double averageFahrenheit = sumFahrenheit / tempsOutFahrenheit.length;
                System.out.printf("A média das temperaturas em Celsius é %.2f\n", averageCelsius);
                System.out.printf("A média das temperaturas em Fahrenheit é %.2f\n", averageFahrenheit);
                break;
            case KELVIN:
                i = tempsInCelsius.length;
                double[] tempsOutKelvin = new double [i];
                i = 0;
                for (double tempIn : tempsInCelsius) {
                    double tempOutKelvin = tempIn + 273.15;
                    System.out.printf("A temperatura em Celsius é %.2f\n", tempIn);
                    System.out.printf("A temperatura em Kelvin é %.2f\n", tempOutKelvin);
                    tempsOutKelvin[i] = tempOutKelvin;
                    i++;
                }
                double sumKelvin = 0;
                for (double tempIn : tempsOutKelvin) {
                    sumKelvin += tempIn;
                }
                double averageKelvin = sumKelvin / tempsOutKelvin.length;
                System.out.printf("A média das temperaturas em Celsius é %.2f\n", averageCelsius);
                System.out.printf("A média das temperaturas em Kelvin é %.2f\n", averageKelvin);
                break;
            default:
                for (double tempIn : tempsInCelsius) {
                    System.out.printf("A temperatura em Celsius é %.2f\n", tempIn);
                }
                System.out.printf("A média das temperaturas em Celsius é %.2f\n", averageCelsius);
                break;
        }
    }
}


