package tSmirnova_hW3_allTasks.Card;

public class ProgramCard {
    public static void main(String[] args) {

        //HW2 TASK1 - Протестируйте работу класса Card
        String nameOwner = "LENA";
        String cardNumber = "1111 1111 4112 1111";
        String cardType = "VIZA";
        String cardDate = "02/01";
        String cvv = "212";

        CardValidatorTest.executeTests(cardNumber, cardType, nameOwner, cardDate, cvv);
    }
}