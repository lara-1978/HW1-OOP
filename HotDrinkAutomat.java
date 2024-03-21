public class HotDrinkAutomat  implements VendingMachin {

    @Override
    pablic HotDrink getProduct  (String name) {
        
        return new HotDrink(name);
    }


}