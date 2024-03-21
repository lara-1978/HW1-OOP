public interface VendingMachin {



    Product getProduct(String name);     //гет продукт будет брать продукт по имени
    //тут мы берем класс продукт т.е. экземпляр Product
    

    Product getProduct(String name, int volume, int temp);

}

    

