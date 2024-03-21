import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        

        HotDrink hotdrink1= new HotDrink("Tea", 122, 85);
        HotDrink hotDrink2 = new HotDrink("Coffe", 200, 90);
        HotDrink hotDrink3 = new HotDrink("Turkey coffe", 400, 87);
        System.out.println("Tea");
        System.out.println("Coffe");
        System.out.println("Turkey coffe");

        HotDrinkAutomat automat = new HotDrinkAutomat(new ArrayList<>());



    }
}