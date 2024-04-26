// Bhavy Bhuva
// 220130318038
/*Write a program in Java to create, write, modify, read operations on a Text file. */
import java.io.*;

public class P3 {
    public static void main(String[] args) {
        String fileName = "example.txt";

        String content = "Hello, this is some initial text.";

        try {
            FileWriter writer = new FileWriter(fileName);

            writer.write(content);

            writer.close();

            System.out.println("Initial content has been written to the file '" + fileName + "' successfully....!");

            FileWriter appendWriter = new FileWriter(fileName, true);
            appendWriter.write("\nThis is some appended text.");
            appendWriter.close();

            System.out.println("Additional content has been appended to the file '" + fileName + "' successfully....!");

            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);

            System.out.println("\nContents of the file '" + fileName + "':");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

            FileWriter modifyWriter = new FileWriter(fileName);
            modifyWriter.write("This is the modified content.");
            modifyWriter.close();
            System.out.println("\nContent of the file '" + fileName + "' has been modified successfully....!");

            FileReader modifiedReader = new FileReader(fileName);
            BufferedReader modifiedBufferedReader = new BufferedReader(modifiedReader);

            System.out.println("\nModified contents of the file '" + fileName + "':");

            String modifiedLine;
            while ((modifiedLine = modifiedBufferedReader.readLine()) != null) {
                System.out.println(modifiedLine);
            }

            modifiedReader.close();
        } 
        catch (IOException e) {
            System.out.println("An error occurred while performing file operations....!");
            e.printStackTrace();
        }
    }
}
