// Bhavy Bhuva
// 220130318038
/*Write a program in Java to create a file and perform write operation on this file. */
import java.io.*;

public class P2 {
    public static void main(String[] args) {
        String fileName = "example.txt";

        String content = "Hello, this is some text that will be written to the file....!";

        try {
            FileWriter writer = new FileWriter(fileName);

            writer.write(content);

            writer.close();

            System.out.println("Content has been written to the file '" + fileName + "' successfully....!");
        } 
        catch (IOException e) {
            System.out.println("An error occurred while writing to the file....!");
            e.printStackTrace();
        }
    }
}
