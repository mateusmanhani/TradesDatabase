
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Mateus Manhani
 */
public class TradeParser {
        // Method to parse each trade string and create a Trade onject
    public Trade parseTrade(String tradeStr) {

        // Declare RegEx pattern in order to get a match
        String regEx = "([A-Z]{3})([A-Z]{3})(\\d+)-(\\d+)([RO])";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(tradeStr);
        
        Trade trade = null;
        // Validate each element of each trade    
        if (matcher.matches()) {
            trade = new Trade();
            // add attributes to the trade object
            trade.setTradeOrigin(matcher.group(1));
            trade.setTradeDestination(matcher.group(2));
            trade.setTradePrice(Double.parseDouble(matcher.group(3)));
            trade.setTradeAmount(Integer.parseInt(matcher.group(4)));
            trade.setTradeType(matcher.group(5));
        }else
            System.out.println("Error: This trade does not match the required pattern.");
        
        return trade;
    }
}
