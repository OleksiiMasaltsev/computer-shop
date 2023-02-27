package masaltsev.dao;

import java.util.List;
import masaltsev.model.component.Component;

public interface ShopDao {
    void save(Component component);
    List<Component> getAll();
    void remove(Component component);
}
