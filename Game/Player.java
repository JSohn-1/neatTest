import java.util.ArrayList;

public class Player{
    private int money;
    private int group;
    private Cargo cargo;
    
    public Player(int p){
        money = 1000;
        group = p;
        cargo = new Cargo(10);
        
        cargo.addItem("Iron", 10);
        cargo.addItem("Iron", 20);


    }
    
    public String toString(){
        return "You have $" + money + ", " + cargo.capacity() + " units of storage";
    }
}