package tSmirnova_hW05_all.Generics;

public class GenericClass <T> {
    T [] array;

    public GenericClass( T [] array) {
        this.array = array;
    }

    public T getElementByIndex (int index) {
        return array[index];
    }
}