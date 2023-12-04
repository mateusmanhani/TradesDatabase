package tradesdatabase;

import java.util.ArrayList;

/**
 *
 * @author Mateus Manhani
 */
public class Trade {
    private String tradeOrigin;
    private String tradeDestination;
    private double tradePrice;
    private int tradeAmount;
    private String tradeType;
    private final ArrayList<String> tradeInfo = new ArrayList<>();
    
    // Default constrcutor
    public Trade(){
        // Initialize with default values or leave fields uninitialized
        tradeOrigin = "";
        tradeDestination = "";
        tradePrice = 0.0;
        tradeAmount = 0;
        tradeType = "";
    }
    
    //create constructor for a trade w/ origin,destination, price, amount and type
    public Trade (String tradeOrigin, String tradeDestination,double tradePrice,int tradeAmount, String tradeType){
        this.tradeOrigin = tradeOrigin;
        this.tradeDestination = tradeDestination;
        this.tradePrice = tradePrice;
        this.tradeAmount = tradeAmount;
        this.tradeType = tradeType;
    }    
}
