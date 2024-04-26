// Bhavy Bhuva
// 220130318038
/*Write a program in Java to create a file and perform read operation on this file. */
import java.io.*;

public class P1 {
    public static void main(String[] args) {
        String fileName = "example.txt";

        String content = "Hello, this is some text that will be written to the file....!";

        try {
            FileWriter writer = new FileWriter(fileName);

            writer.write(content);

            writer.close();

            System.out.println("File '" + fileName + "' created successfully....!");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file....!");
            e.printStackTrace();
        }

        try {
            FileReader reader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            System.out.println("Contents of the file '" + fileName + "':");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } 
        catch (IOException e) {
            System.out.println("An error occurred while reading the file....!");
            e.printStackTrace();
        }
    }
}