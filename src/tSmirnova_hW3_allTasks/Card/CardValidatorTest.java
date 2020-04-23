package tSmirnova_hW3_allTasks.Card;

public class CardValidatorTest {

    static void executeTests(String cardNumber, String cardType, String nameOwner, String cardDate, String cvv) {

        if (Card.Validator.validateNameOwner(nameOwner).equals("error")) {
            System.out.println("ERROR : NAME of CARD OWNER IS NOT VALID : " + " " + Card.Validator.validateNameOwner(nameOwner));
        } else {
            System.out.println("CARD OWNER IS : " + Card.Validator.validateNameOwner(nameOwner));

            testValidateCardType(cardType);
            testValidateCardNumber(cardNumber);
            testValidateCardDate(cardDate);
            testValidateCardCvv(cvv);
        }
    }

    static void testValidateCardType(String cardType) {
        boolean result = true;
        if (!cardType.equals("VIZA")) {
            result = false;
        }
        String test = result ? "TEST PASSED validateCardType " + cardType : "TEST FAILED validateCardType " + cardType;
        System.out.println(test);
    }

    static void testValidateCardNumber(String cardNumber) {
        boolean result = true;
        if (cardNumber.length() != 19) {
            result = Card.Validator.validateCardNumber(cardNumber).equals("0000 0000 0000 0000");
        } else {
            result = Card.Validator.validateCardNumber(cardNumber).equals(cardNumber);
        }
        String test = result ? "TEST PASSED validateCardNumber " + Card.Validator.validateCardNumber(cardNumber) : "TEST FAILED validateCardNumber " + Card.Validator.validateCardNumber(cardNumber);
        System.out.println(test);
    }

    static void testValidateCardDate(String cardDate) {
        boolean result = true;
        if (cardDate.length() != 5) {
            result = Card.Validator.validateCardDate(cardDate).equals("00/00");
        } else {
            result = Card.Validator.validateCardDate(cardDate).equals(cardDate);
        }
        String test = result ? "TEST PASSED validateCardDate " + Card.Validator.validateCardDate(cardDate) : "TEST FAILED validateCardDate " + Card.Validator.validateCardDate(cardDate);
        System.out.println(test);
    }

    static void testValidateCardCvv(String cvv) {
        boolean result = true;
        if (cvv.length() != 3) {
            result = Card.Validator.validateCardCvv(cvv).equals("000");
        } else {
            result = Card.Validator.validateCardCvv(cvv).equals(cvv);
        }
        String test = result ? "TEST PASSED validateCardCvv " + Card.Validator.validateCardCvv(cvv) : "TEST FAILED validateCardCvv " + Card.Validator.validateCardCvv(cvv);
        System.out.println(test);
    }
}