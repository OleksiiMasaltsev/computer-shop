package masaltsev.db;

import masaltsev.model.Component;
import java.util.HashMap;
import java.util.Map;

public enum ComponentStorage {
    INSTANCE;
    private final Map<Component, Integer> storage;

    ComponentStorage() {
        this.storage = new HashMap<>();
    }

    public ComponentStorage getInstance() {
        return INSTANCE;
    }

    public Map<Component, Integer> getStorage() {
        return storage;
    }
}
