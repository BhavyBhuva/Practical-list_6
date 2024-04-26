// Bhavy Bhuva
// 220130318038
/*Create a new directory called “myDirectory” and move the “myFile.txt” file into it.  */
import java.io.File;

public class P13 {
    public static void main(String[] args) {
        String directoryName = "myDirectory";

        String fileName = "myFile.txt";

        File directory = new File(directoryName);

        if (!directory.exists()) {
            if (directory.mkdir()) {
                System.out.println("Directory '" + directoryName + "' created successfully!");
            } 
            else {
                System.out.println("Failed to create directory '" + directoryName + "'.");
                return;
            }
        }

        File file = new File(fileName);

        File newFile = new File(directory, fileName);
        if (file.renameTo(newFile)) {
            System.out.println("File '" + fileName + "' moved to directory '" + directoryName + "' successfully!");
        } 
        else {
            System.out.println("Failed to move file '" + fileName + "' to directory '" + directoryName + "'.");
        }
    }
}
