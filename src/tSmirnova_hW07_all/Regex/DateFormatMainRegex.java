package tSmirnova_hW07_all.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormatMainRegex {

    private final String DATE_PATTERN = "^(\\d{4})\\/(0\\d|1[0-2])\\/([0-2]\\d|3[0-1])\\s([0-1]\\d|2[0-3]):([0-5]\\d):([0-5]\\d)$";

    public static void main(String[] args) {
        DateFormatMainRegex date = new DateFormatMainRegex();
        date.start();
    }

    private void start() {
        String dateCheck;
        boolean dateValidate;
        System.out.println("Insert Date : ");
        Scanner scanner = new Scanner(System.in);

        dateCheck = scanner.nextLine();
        dateValidate = validate(dateCheck);
        if (dateValidate == true) {
            System.out.println("Date format is CORRECT");
        } else {
            System.out.println("Date format is NOT CORRECT");
        }
    }

    public boolean validate(String dateFormat) {
        Pattern pattern = Pattern.compile(DATE_PATTERN);
        Matcher matcher = pattern.matcher(dateFormat);
        return matcher.matches();
    }
}