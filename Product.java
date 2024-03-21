
public abstract class Product{ //создаем класс продукт содержащий данные о товаре

        //сделаем инкапсуляцю (privat)
    private String name;
    private double cost;
    private int temp;
            
        
        
        public Product(String name, double cost, int temp) { //этот кнструктор выполнится при создании нашего экземпляра класса
            this.name = name;
            this.cost = cost;
    

        }
            // и теперь  нужно создать getter, setter
            
        public String getName() { //получаем имя
            return name;
        }
        
        public void setName(String name) { //в setNAme мы уже ничего не возвращаем
            this.name = name; // обновляем на имя которое приняли
        }
        
        public double getCost() {
            return cost;  //возвращаем нашу цену
        }
        
        public void setCost(double cost) { //принимает новую цену
            this.cost = cost;  //обновляет её в нашу переменную
        }
        public int getTemp(Integer temp) { // принимаем  темпер.
            return temp;   // возвращаем её

        }
        public void setTemp(Integer temp){ //принимает темпер.
            this.temp = temp; // обновляет её
        }
@Override
public String toString() {
        
    return "Product{"+
            "name="+ name +'\''+
            ", cost="+ cost+ '\''+
            ", temp="+ temp+'}';
            
        
    }
}
