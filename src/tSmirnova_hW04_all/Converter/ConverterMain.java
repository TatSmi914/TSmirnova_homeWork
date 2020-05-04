package tSmirnova_hW04_all.Converter;

public class ConverterMain {
    public static void main(String[] args) {

        double result;

        IConverter converterCelsius = new CelsiusConverter();
        IConverter converterKelvin = new KelvinConverter();
        IConverter converterFahrenheit = new FahrenheitConverter();

        //result = converterCelsius.convert(73, "Kelvin");
        System.out.println(converterCelsius.convert(323, converterKelvin));
        System.out.println(converterCelsius.convert(100, converterFahrenheit));
        System.out.println(converterFahrenheit.convert(266, converterKelvin));
        System.out.println(converterFahrenheit.convert(37.77, converterCelsius));
        System.out.println(converterKelvin.convert(50, converterCelsius));
        System.out.println(converterKelvin.convert(20, converterFahrenheit));
        System.out.println(converterCelsius.convert(20, converterCelsius));
    }
}