import java.util.HashMap;

public class Cargo{
    private HashMap<String, Integer> cargo;
    private int cap;
    
    public Cargo(int cap){
        cargo = new HashMap<String, Integer>();
        this.cap = cap;
    }
    
    public int capacity(){
        int i = 0;
        for (String key : cargo.keySet()) {
            i += cargo.get(key);
        }
        
        return i;
    }
    
    public void addItem(String item, int amount){
        if(isValidAdd(amount)){
            if(cargo.containsKey(item)){
                cargo.put(item, cargo.get(item) + amount);
            }else{
                cargo.put(item, amount);
            }
        }
    }
    
    public void removeItem(String item, int amount){
        if(isValidRemove(item, amount)){
            if(cargo.get(item) - amount != 0){
                cargo.put(item, cargo.get(item) - amount);
            }else{
                cargo.remove(item);
            }
        }
    }
    
    public boolean isValidAdd(int amount){
        if(this.capacity() + amount <= this.cap){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isValidRemove(String item, int amount){
        if(cargo.containsKey(item) && cargo.get(item) >= amount ){
            return true;
        }else{
            return false;
        }
    }
    
    public String toString(){
        return cargo.toString();
    }
}