package masaltsev.model;

import masaltsev.model.abstr.Component;

public class Disc extends Component {
    private int capacity;
    private DiscType discType;

    enum DiscType {
        HDD,
        SSD
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public DiscType getDiscType() {
        return discType;
    }

    public void setDiscType(DiscType discType) {
        this.discType = discType;
    }
}
