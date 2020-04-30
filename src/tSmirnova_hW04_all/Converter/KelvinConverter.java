package tSmirnova_hW04_all.Converter;

public class KelvinConverter implements IConverter{

    String type = "Kelvin";

    @Override
    public double convert(double grade, IConverter converter) {
        if (converter.getType().equals("Fahrenheit")) {
            return ((grade - 32)* 5 / 9 + 273.15);
        } else {
            return grade + 273.15;
        }
    }

    @Override
    public String getType() {
        return this.type;
    }
}