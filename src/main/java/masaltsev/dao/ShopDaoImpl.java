package masaltsev.dao;

import java.util.List;
import masaltsev.db.Storage;
import masaltsev.model.component.Component;

public class ShopDaoImpl implements ShopDao {
    private final Storage storage;

    public ShopDaoImpl(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void save(Component component) {
        storage.getComponents().add(component);
    }

    @Override
    public List<Component> getAll() {
        return storage.getComponents();
    }

    @Override
    public void remove(Component component) {
        storage.getComponents().remove(component);
    }
}
