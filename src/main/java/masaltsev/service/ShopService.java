package masaltsev.service;

import java.util.List;
import masaltsev.model.component.Component;

public interface ShopService {
    void save(Component component);
    List<Component> getAll();
    void remove(Component component);
}
