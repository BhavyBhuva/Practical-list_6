// Bhavy Bhuva
// 220130318038
/* Create a new file called “myData.csv” and write the following data to it: 
  Name, Age, Gender 
  John Doe, 25, Male 
  John Smith, 30, Female 
  David Lee, 20, Male*/
import java.io.*;

public class P8 {
    public static void main(String[] args) {
        // Name of the CSV file to create
        String fileName = "myData.csv";

        // Data to write to the file
        String[] data = {
            "Name, Age, Gender",
            "John Doe, 25, Male",
            "John Smith, 30, Female",
            "David Lee, 20, Male"
        };

        try {
            FileWriter writer = new FileWriter(fileName);

            for (String line : data) {
                writer.write(line + "\n");
            }

            writer.close();

            System.out.println("Data has been written to the file '" + fileName + "' successfully....!");
        } 
        catch (IOException e) {
            System.out.println("An error occurred while writing to the file....!");
            e.printStackTrace();
        }
    }
}
