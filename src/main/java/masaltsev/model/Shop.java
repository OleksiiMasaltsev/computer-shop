package masaltsev.model;

import java.util.Map;
import masaltsev.db.ComponentStorage;
import masaltsev.model.component.Component;

public class Shop {
    private ComponentStorage storage;

    public Shop(ComponentStorage storage) {
        this.storage = storage;
    }

    public ComponentStorage getStorage() {
        return storage;
    }
}
