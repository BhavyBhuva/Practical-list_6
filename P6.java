// Bhavy Bhuva
// 220130318038
/*Append a new line to the “myFile.txt” file: 
 
Java Programming is awesome! */
import java.io.*;

public class P6 {
    public static void main(String[] args) {
        String fileName = "myFile.txt";

        String newLine = "Java Programming is awesome!";

        try {
            FileWriter writer = new FileWriter(fileName, true);

            writer.write("\n" + newLine);

            writer.close();

            System.out.println("New line has been appended to the file '" + fileName + "' successfully!");
        } 
        catch (IOException e) {
            System.out.println("An error occurred while appending to the file!");
            e.printStackTrace();
        }
    }
}
