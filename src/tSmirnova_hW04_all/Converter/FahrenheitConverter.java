package tSmirnova_hW04_all.Converter;

public class FahrenheitConverter implements IConverter{

    String type = "Fahrenheit";

    @Override
    public double convert(double grade, IConverter converter) {
        if (converter.getType().equals("Celsius")) {
            return ((grade * 9 / 5) + 32);
        } else {
            return ((grade - 273.15) * 9 / 5 + 32);
        }
    }

    @Override
    public String getType() {
        return this.type;
    }
}