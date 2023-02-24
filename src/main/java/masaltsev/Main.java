package masaltsev;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import masaltsev.model.Customer;
import masaltsev.model.Shop;
import masaltsev.model.component.Component;
import masaltsev.util.ChatBot;

public class Main {
    public static void main(String[] args) {
        Shop shop;
        Customer customer;
        if (ChatBot.askToStart().equals("1")) {
            shop = new Shop();
            customer = new Customer(ChatBot.askNameAndSayHello());
            Set<Component> storage = shop.getStorage();

            List<String> componentTypes = storage.stream()
                    .map(component -> component.getClass().getSimpleName())
                    .distinct()
                    .toList();

            for (String type : componentTypes) {
                List<Component> components = storage.stream()
                        .filter(component -> component.getClass().getSimpleName().equals(type))
                        .toList();

                int index;
                while (true) {
                    String input = ChatBot.askComponentId(type,
                            components.stream().map(Object::toString).toList());
                    try {
                        index = Integer.parseInt(input) - 1;
                    } catch (NumberFormatException e) {
                        ChatBot.askRepeat();
                        continue;
                    }
                    if (index >= 0 && index < components.size()) {
                        break;
                    }
                    ChatBot.askRepeat();
                }
                customer.getCart().add(components.get(index));
            }

            BigDecimal price = customer.getCart().stream()
                    .map(Component::getPrice)
                    .reduce(BigDecimal::add)
                    .orElse(BigDecimal.ZERO);

            ChatBot.showPrice(price);
        }
    }
}
