package masaltsev.db;

import java.util.HashMap;
import java.util.Map;
import masaltsev.model.Component;

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
