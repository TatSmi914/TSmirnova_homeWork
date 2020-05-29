package tSmirnova_hW07_all.Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Stream_3_4 {

    public static String readUsingFiles(String fileName) throws IOException {
        String string = new String(Files.readAllBytes(Paths.get(fileName)));
        System.out.println("Direct word order : \n" + string);
        System.out.println("\nReversed word order : ");
        return revertString(string);
    }

    public static void writeRaw(String text) {

        try (FileOutputStream fos = new FileOutputStream("d://note3.txt")) {
            // перевод в байты
            byte[] buffer = text.getBytes();
            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String revertString(String string) {
        String result = "";
        String[] reversed = string.split(" ");
        for (int i = reversed.length - 1; i >= 0; i--) {
            result += reversed[i] + " ";
        }
        return result;
    }
}