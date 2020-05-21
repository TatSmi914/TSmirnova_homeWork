package tSmirnova_hW07_all.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpMainRegex {

    private final String IP_ADDRESS_PATTERN
            = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public static void main(String[] args) {
        IpMainRegex ip = new IpMainRegex();
        ip.start();
    }

    public boolean validate(String ipAddress) {
        Pattern pattern = Pattern.compile(IP_ADDRESS_PATTERN);
        Matcher matcher = pattern.matcher(ipAddress);
        return matcher.matches();
    }

    private void start() {
        String ipCheck;
        boolean ipValidate;
        System.out.println("Введите IP адрес : ");
        Scanner scanner = new Scanner(System.in);

        ipCheck = scanner.next();
        ipValidate = validate(ipCheck);
        if (ipValidate == true) {
            System.out.println("Строка является IP адресом");
        } else {
            System.out.println("Строка не является IP адресом");
        }
    }
}