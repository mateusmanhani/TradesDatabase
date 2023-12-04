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
        // Getter for trade origin
    public  String getTradeOrigin(){
        return tradeOrigin;
    }       
    // Getter for trade destination
    public String getTradeDestination(){
        return tradeDestination;
    }
    // Getter for trade price
    public double getTradePrice(){
        return tradePrice;
    }
    // Getter for trade amount
    public int getTradeAmount(){
        return tradeAmount;
    }
    // Getter for trade type
    public String getTradeType(){
        return tradeType;
    }
    //Getter for whole trade info| returns an arrayList of attributes
    public ArrayList<String> getTradeInfo(){
        if(tradeInfo.isEmpty()) { 
            tradeInfo.add(tradeOrigin);
            tradeInfo.add(tradeDestination);
            tradeInfo.add(String.valueOf(tradePrice));
            tradeInfo.add(String.valueOf(tradeAmount));
            tradeInfo.add(tradeType);
        }
        return tradeInfo;
    }
}
