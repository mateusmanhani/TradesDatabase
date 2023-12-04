package tradesdatabase;

/**
 *
 * @author Mateus Manhani
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class TradesDatabase {

    public static void main(String[] args) {
        String inputFile = "trades.txt";
        String outputFile = "trades.csv";
        // Using Try-with-resources statement to automatically close resources (reader and writer)
        try (FileReader reader = new FileReader(inputFile);
             BufferedReader br = new BufferedReader(reader);
             FileWriter writer = new FileWriter(outputFile)) {
    } catch (IOException e) {
            System.out.println("Error: Unable to open file.");
        }
    
}
