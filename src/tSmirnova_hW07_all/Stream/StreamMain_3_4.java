package tSmirnova_hW07_all.Stream;

import java.io.IOException;
import java.util.Scanner;

public class StreamMain_3_4 {
    public static void main(String[] args) throws IOException {

        System.out.println(Stream_3_4.readUsingFiles("d:\\test.txt"));

        Scanner in = new Scanner(System.in);
        System.out.println("\nWrite any raw : ");
        String stringFromConsole = in.nextLine();

        String result = Stream_3_4.revertString(stringFromConsole);
        System.out.println(result);
        Stream_3_4.writeRaw(result);
    }
}