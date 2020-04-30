package tSmirnova_hW04_all.Converter;

public class CelsiusConverter implements IConverter{

    String type = "Celsius";

    @Override
    public double convert(double grade, IConverter converter) {
        if (converter.getType().equals("Fahrenheit")) {
            return ((grade - 32)* 5 / 9);
        } else if (converter.getType().equals("Kelvin")) {
            return grade - 273.15;
        } else {
            return grade;
        }
    }

    @Override
    public String getType() {
        return this.type;
    }
}