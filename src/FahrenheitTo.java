public class FahrenheitTo {
    public static void transform() {
        TempUnit unitOut = GetTempUnit.getTempUnit("de saída");
        double[] tempsInFahrenheit = GetTempIn.getTemp(TempUnit.FAHRENHEIT);
        double sumFahrenheit = 0;
        for (double tempIn : tempsInFahrenheit) {
            sumFahrenheit += tempIn;
        }
        double averageFahrenheit = sumFahrenheit / tempsInFahrenheit.length;
        switch (unitOut) {
            case CELSIUS:
                int i = tempsInFahrenheit.length;
                double[] tempsOutCelsius = new double [i];
                i = 0;
                for (double tempIn : tempsInFahrenheit){
                    double tempOutCelsius = (tempIn - 32) * 5.0 / 9;
                    System.out.printf("A temperatura em Fahrenheit é %.2f\n", tempIn);
                    System.out.printf("A temperatura em Celsius é %.2f\n", tempOutCelsius);
                    tempsOutCelsius[i] = tempOutCelsius;
                    i++;
                }
                double sumCelsius = 0;
                for (double tempIn : tempsOutCelsius) {
                    sumCelsius += tempIn;
                }
                double averageCelsius = sumCelsius / tempsOutCelsius.length;
                System.out.printf("A média das temperaturas em Fahrenheit é %.2f\n", averageFahrenheit);
                System.out.printf("A média das temperaturas em Celsius é %.2f\n", averageCelsius);
                break;
            case KELVIN:
                i = tempsInFahrenheit.length;
                double[] tempsOutKelvin = new double [i];
                i = 0;
                for (double tempIn : tempsInFahrenheit) {
                    double tempOutKelvin = ((tempIn - 32) * 5.0 / 9) + 273.15;
                    System.out.printf("A temperatura em Fahrenheit é %.2f\n", tempIn);
                    System.out.printf("A temperatura em Kelvin é %.2f\n", tempOutKelvin);
                    tempsOutKelvin[i] = tempOutKelvin;
                    i++;
                }
                double sumKelvin = 0;
                for (double tempIn : tempsOutKelvin) {
                    sumKelvin += tempIn;
                }
                double averageKelvin = sumKelvin / tempsOutKelvin.length;
                System.out.printf("A média das temperaturas em Fahrenheit é %.2f\n", averageFahrenheit);
                System.out.printf("A média das temperaturas em Kelvin é %.2f\n", averageKelvin);
                break;
            default:
                for (double tempIn : tempsInFahrenheit) {
                    System.out.printf("A temperatura em Fahrenheit é %.2f\n", tempIn);
                }
                System.out.printf("A média das temperaturas em Fahrenheit é %.2f\n", averageFahrenheit);
                break;
        }
    }
}