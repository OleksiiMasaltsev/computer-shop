package masaltsev.model;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import masaltsev.model.component.Chassis;
import masaltsev.model.component.Component;
import masaltsev.model.component.Disc;
import masaltsev.model.component.Graphics;
import masaltsev.model.component.Motherboard;
import masaltsev.model.component.Processor;
import masaltsev.model.component.Ram;
import masaltsev.util.ChatBot;

public class Shop {
    private final List<Component> storage;

    public Shop() {
        this.storage = new LinkedList<>();
        fillStorage();
    }

    public List<Component> getStorage() {
        return storage;
    }

    public void beginShopping(Customer customer) {
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
                if (index >= -1 && index < components.size()) {
                    break;
                }
                ChatBot.askRepeat();
            }
            if (index != -1) {
                Component component = components.get(index);
                customer.getCart().add(component);
                storage.remove(component);
            }
        }
        ChatBot.displayList(customer.getCart().stream().map(Component::toString).toList());
        ChatBot.showPriceAndSayBye(calculatePrice(customer));
    }

    public BigDecimal calculatePrice(Customer customer) {
        return customer.getCart().stream()
                .map(Component::getPrice)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
    }

    private void fillStorage() {
    }
}
