package tSmirnova_hW07_all.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DomainNameMainRegex {

    private final String DOMAIN_NAME_PATTERN = "^(http|https):\\/\\/(.*?)\\/$";

    public static void main(String[] args) {
        DomainNameMainRegex domainName = new DomainNameMainRegex();
        domainName.start();
    }

    private void start() {
        String domainNameCheck;
        boolean domainNameValidate;
        System.out.println("Insert Domain Name : ");
        Scanner scanner = new Scanner(System.in);

        domainNameCheck = scanner.nextLine();
        domainNameValidate = validate(domainNameCheck);
        if (domainNameValidate == true) {
            System.out.println("Domain Name address format is CORRECT");
        } else {
            System.out.println("Domain Name address format is NOT CORRECT");
        }
    }

    public boolean validate(String domainNameFormat) {
        Pattern pattern = Pattern.compile(DOMAIN_NAME_PATTERN);
        Matcher matcher = pattern.matcher(domainNameFormat);
        return matcher.matches();
    }
}