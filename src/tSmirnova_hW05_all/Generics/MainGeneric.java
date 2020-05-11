package tSmirnova_hW05_all.Generics;

public class MainGeneric {
    public static void main(String[] args) {

        String[] arrayString = {"abc", "def", "gth"};
        Integer[] arrayInteger = {1, 2, 3};
        Boolean[] arrayBoolean = {true, false, true};
        Double[] arrayDouble = {1.2, 5.9, 5.7};

        GenericClass<String> genericVariable = new GenericClass<>(arrayString);
        System.out.println(genericVariable.getElementByIndex(0));

        GenericClass<Integer> genericVariable1 = new GenericClass<>(arrayInteger);
        System.out.println(genericVariable1.getElementByIndex(1));

        GenericClass<Boolean> genericVariable2 = new GenericClass<>(arrayBoolean);
        System.out.println(genericVariable2.getElementByIndex(1));

        GenericClass<Double> genericVariable3 = new GenericClass<>(arrayDouble);
        System.out.println(genericVariable3.getElementByIndex(0));
    }
}