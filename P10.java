// Bhavy Bhuva
// 220130318038
/*Update the age of “David Lee” to 21 in the “myData.csv” file.  */
import java.io.*;

public class P10 {
    public static void main(String[] args) {
        String fileName = "myData.csv";

        String tempFileName = "tempData.csv";

        String updateName = "David Lee";
        int updateAge = 21;

        try {
            FileReader reader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(reader);

            FileWriter writer = new FileWriter(tempFileName);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(updateName)) {
                    String[] parts = line.split(",");
                    parts[2] = " " + updateAge;
                    line = String.join(",", parts);
                }
                writer.write(line + "\n");
            }

            reader.close();
            writer.close();

            File oldFile = new File(fileName);
            File newFile = new File(tempFileName);
            newFile.renameTo(oldFile);

            System.out.println("Age of '" + updateName + "' has been updated to " + updateAge + " successfully!");
        } 
        catch (IOException e) {
            System.out.println("An error occurred while updating the file!");
            e.printStackTrace();
        }
    }
}
