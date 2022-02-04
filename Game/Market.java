import java.util.HashMap;
import java.io.*;  
import java.util.Scanner;  

public class Market{
    private HashMap<String, Integer> market;
    private int type;
    private static HashMap<String, Object[]> commodities = new HashMap<String, Object[]>();
    
    Scanner sc = new Scanner(new File("commodities.csv"));  

    public Market(int i){
        market = new HashMap<String, Integer>();
        type = i;
    }
    
    public void populate(){
        
    }
    
    public HashMap getMarket(){
        return market;
    }
}