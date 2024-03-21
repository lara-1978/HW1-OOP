public class HotDrink {
    
    private String name;
    private double cost;
    private int temp;
}

    public HotDrink(String name, int cost, int temp){
        
        this.name = name;
        this.cost = cost;
        this.temp = temp;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getTemp() {
        return temp;
    }

    @Override
    public String toString(){
        return {"+
        "name="+ name +'\''+
        ", cost="+ cost+ '\''+
        ", temp="+ temp+'}';
        
        }
    }


    
    
