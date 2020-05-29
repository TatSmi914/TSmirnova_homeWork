package tSmirnova_hW07_all.Stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamMain_1_2 {

    public static void main(String[] args) {

        System.out.println("Insert file path : ");

        try (FileInputStream file = new FileInputStream(
                new BufferedReader(
                        new InputStreamReader(System.in)).readLine())) {
            int max = file.read();
            int min = max;
            while (file.available() > 0) {
                int data = file.read();
                if (data > max) {
                    max = data;
                }
                if (data < min) {
                    min = data;
                }
            }
            System.out.println("Maximum byte in the file is : " + max + "\nMinimum byte in the file is : " + min);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}