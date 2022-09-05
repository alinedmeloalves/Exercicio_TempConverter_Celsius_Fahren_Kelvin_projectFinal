public class KelvinTo {
    public static void transform() {
        TempUnit unitOut = GetTempUnit.getTempUnit("de saída");
        double[] tempsInKelvin = GetTempIn.getTemp(TempUnit.KELVIN);
        double sumKelvin = 0;
        for (double tempIn : tempsInKelvin) {
            sumKelvin += tempIn;
        }
        double averageKelvin = sumKelvin / tempsInKelvin.length;
        switch (unitOut) {
            case CELSIUS:
                int i = tempsInKelvin.length;
                double[] tempsOutCelsius = new double [i];
                i = 0;
                for (double tempIn : tempsInKelvin) {
                    double tempOutCelsius = tempIn - 273.15;
                    System.out.printf("A temperatura em Kelvin é %.2f\n", tempIn);
                    System.out.printf("A temperatura em Celsius é %.2f\n", tempOutCelsius);
                    tempsOutCelsius[i] = tempOutCelsius;
                    i++;
                }
                double sumCelsius = 0;
                for (double tempIn : tempsOutCelsius) {
                    sumCelsius += tempIn;
                }
                double averageCelsius = sumCelsius / tempsOutCelsius.length;
                System.out.printf("A média das temperaturas em Kelvin é %.2f\n", averageKelvin);
                System.out.printf("A média das temperaturas em Celsius é %.2f\n", averageCelsius);
                break;
            case FAHRENHEIT:
                i = tempsInKelvin.length;
                double[] tempsOutFahrenheit = new double [i];
                i = 0;
                for (double tempIn : tempsInKelvin) {
                    double tempOutFahrenheit = 9.0 / 5 * (tempIn - 273.15) + 32;
                    System.out.printf("A temperatura em Kelvin é %.2f\n", tempIn);
                    System.out.printf("A temperatura em Fahrenheit é %.2f\n", tempOutFahrenheit);
                    tempsOutFahrenheit[i] = tempOutFahrenheit;
                    i++;
                }
                double sumFahrenheit = 0;
                for (double tempIn : tempsOutFahrenheit) {
                    sumFahrenheit += tempIn;
                }
                double averageFahrenheit = sumFahrenheit / tempsOutFahrenheit.length;
                System.out.printf("A média das temperaturas em Kelvin é %.2f\n", averageKelvin);
                System.out.printf("A média das temperaturas em Fahrenheit é %.2f\n", averageFahrenheit);
                break;
            default:
                for (double tempIn : tempsInKelvin) {
                    System.out.printf("A temperatura em Kelvin é %.2f\n", tempIn);
                }
                System.out.printf("A média das temperaturas em Kelvin é %.2f\n", averageKelvin);
                break;
        }
    }
}

