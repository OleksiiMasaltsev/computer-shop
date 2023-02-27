package masaltsev.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import masaltsev.dao.ShopDao;
import masaltsev.model.Customer;
import masaltsev.model.component.Component;

public class ShopServiceImpl implements ShopService {
    private final Customer customer;
    private final ShopDao shopDao;
    private final PrintService printService;

    public ShopServiceImpl(Customer customer, ShopDao shopDao, PrintService printService) {
        this.customer = customer;
        this.shopDao = shopDao;
        this.printService = printService;
    }

    @Override
    public void save(Component component) {
        shopDao.save(component);
    }

    @Override
    public List<Component> getAll() {
        return shopDao.getAll();
    }

    @Override
    public void remove(Component component) {
        shopDao.remove(component);
    }

    @Override
    public void beginShopping() {
        if (printService.isStart()) {
            customer.setName(printService.askNameAndSayHello());
            chooseComponents();
            printService.displayCart(customer.getCart().stream()
                    .map(Objects::toString).toList());
            printService.showPriceAndSayBye(calculatePrice());
        }
    }

    private void chooseComponents() {
        List<Component> components = shopDao.getAll();
        for (String type : extractTypes(components)) {
            List<Component> filteredList = components.stream()
                    .filter(component -> component.getClass().getSimpleName().equals(type))
                    .toList();
            int index;
            while (true) {
                String input = printService.askComponentId(type,
                        filteredList.stream().map(Object::toString).toList());
                try {
                    index = Integer.parseInt(input) - 1;
                } catch (NumberFormatException e) {
                    printService.askRepeat();
                    continue;
                }
                if (index >= -1 && index < filteredList.size()) {
                    break;
                }
                printService.askRepeat();
            }
            if (index != -1) {
                Component component = filteredList.get(index);
                customer.getCart().add(component);
                components.remove(component);
            }
        }
    }

    private List<String> extractTypes(List<Component> components) {
        return components.stream()
                .map(component -> component.getClass().getSimpleName())
                .distinct()
                .toList();
    }

    private BigDecimal calculatePrice() {
        return customer.getCart().stream()
                .map(Component::getPrice)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
    }
}
