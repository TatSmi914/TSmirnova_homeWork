package tSmirnova_hW04_all.Converter;

public interface IConverter {

    double convert(double grade, IConverter converter);

    String getType ();
}