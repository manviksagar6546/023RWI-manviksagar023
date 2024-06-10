import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Checkedexception {
    public static void main(String[] args) {
        String filePath = "example.txt";

        try {
            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file);
            System.out.println("File opened successfully.");
            fis.close();
        } 
        catch (IOException e) {
            // Handle the IOException
            System.out.println("An error occurred while opening the file: " + e.getMessage());
        }
    }
}
