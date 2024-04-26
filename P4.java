// Bhavy Bhuva
// 220130318038
/*Create a new file called “myFile.txt” file and write the following data to it: 
 
Hello World! */
import java.io.*;

public class P4 {
    public static void main(String[] args) {
        String fileName = "myFile.txt";

        String content = "Hello World!";

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
