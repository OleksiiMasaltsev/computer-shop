package masaltsev.model;

import java.util.List;

public class Computer {
    private List<Component> components;

    public Computer(List<Component> components) {
        this.components = components;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }
}
