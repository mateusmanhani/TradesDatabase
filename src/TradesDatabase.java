

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
          
            String line;
            TradeParser tradeParser = new TradeParser(); // Create an instance of TradeParser
            while ((line = br.readLine()) != null) {
                //Split the line by whitespace into an array of Strings, in which each element will be one trade
                String[] trades = line.split("\\s+");
                               
                // Iterate through the trades to separate elements of each trade
                for (String tradeStr : trades) {
                    // Retrieve and store trade Elements
                    Trade tradeObj = tradeParser.parseTrade(tradeStr);
                    
                    if(tradeObj != null){
                        //Write trade attributes into a CSV file
                        String currentTradeAttributes = String.join(",", tradeObj.getTradeInfo());
                        writer.write(currentTradeAttributes + "\n");  
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error: Unable to open file.");
        }
    }
}
