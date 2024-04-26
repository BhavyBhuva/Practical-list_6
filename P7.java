// Bhavy Bhuva
// 220130318038
/*Read the data from the “myFile.txt” file again and display it on the console to verify that the new line has been added. */
import java.io.*;

public class P7 {
    public static void main(String[] args) {
        String fileName = "myFile.txt";

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
            System.out.println("An error occurred while reading the file!");
            e.printStackTrace();
        }
    }
}
