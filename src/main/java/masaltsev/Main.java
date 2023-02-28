package masaltsev;

import java.util.ArrayList;
import java.util.LinkedList;
import masaltsev.dao.ShopDao;
import masaltsev.dao.ShopDaoImpl;
import masaltsev.db.Storage;
import masaltsev.model.Customer;
import masaltsev.service.PrintService;
import masaltsev.service.ShopService;
import masaltsev.service.ShopServiceImpl;

public class Main {
    public static void main(String[] args) {
        ShopDao shopDao = new ShopDaoImpl(new Storage(new LinkedList<>()));
        PrintService printService = new PrintService();
        Customer customer = new Customer(new ArrayList<>());
        ShopService shopService = new ShopServiceImpl(customer, shopDao, printService);
        shopService.beginShopping();
    }
}
