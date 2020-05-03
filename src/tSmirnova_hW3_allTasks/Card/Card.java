package tSmirnova_hW3_allTasks.Card;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Card {
    private String cardNumber;
    private String cardType;
    private String nameOwner;
    private String cardDate;
    private String cvv;
    //static Validator validator = new Validator();

    public Card(String cardNumber, String cardType, String nameOwner, String cardDate, String cvv) {
        setCardNumber(cardNumber);
        setCardType(cardType);
        setNameOwner(nameOwner);
        setCardDate(cardDate);
        setCvv(cvv);
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = Validator.validateCardNumber(cardNumber);
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = Validator.validateCardType(cardType);
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        if (Validator.validateNameOwner(nameOwner).equals("error")) {
            System.out.println("ERROR !!!!!");
        } else {
            this.nameOwner = Validator.validateNameOwner(nameOwner);
        }
    }

    public String getCardDate() {
        return cardDate;
    }

    public void setCardDate(String cardDate) {
        this.cardDate = cardDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    static class Validator {

        static String validateCardNumber(String cardNumber) {
            final String DEFAULT_VALUE = "0000 0000 0000 0000";
            Pattern cardNumberPattern = Pattern.compile("^[0-9]{4}\\s[0-9]{4}\\s[0-9]{4}\\s[0-9]{4}$");
            Matcher cardNumberMather = cardNumberPattern.matcher(cardNumber);
            if (cardNumberMather.matches()) {
                return cardNumber;
            } else {
                return DEFAULT_VALUE;
            }
        }

        static String validateCardType(String cardType) {
            final String VIZA = "VIZA";
            final String ERROR = "error";
            if (cardType.equals(VIZA)) {
                return cardType;
            } else {
                return ERROR;
            }
        }

        static String validateNameOwner(String nameOwner) {
            final String ERROR = "error";
            Pattern nameOwnerPattern = Pattern.compile("^[A-Z]{2,15}\\s[A-Z]{2,15}$");
            Matcher nameOwnerMather = nameOwnerPattern.matcher(nameOwner);
            if (nameOwnerMather.matches()) {
                return nameOwner;
            } else {
                return ERROR;
            }
        }

        static String validateCardDate(String cardDate) {
            final String DEFAULT_VALUE = "00/00";
            Pattern cardDatePattern = Pattern.compile("^(0[1-9]|1[0-2])/([0-9]{2})$");
            Matcher cardDateMather = cardDatePattern.matcher(cardDate);
            if (cardDateMather.matches()) {
                return cardDate;
            } else {
                return DEFAULT_VALUE;
            }
        }

        static String validateCardCvv(String cvv) {
            final String DEFAULT_VALUE = "000";
            Pattern cvvPattern = Pattern.compile("^([0-9]{3})$");
            Matcher cvvMather = cvvPattern.matcher(cvv);
            if (cvvMather.matches()) {
                return cvv;
            } else {
                return DEFAULT_VALUE;
            }
        }
    }
}