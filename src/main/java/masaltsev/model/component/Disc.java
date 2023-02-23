package masaltsev.model.component;

import java.math.BigDecimal;

public class Disc extends Component {
    private int capacity;
    private DiscType discType;

    public Disc(String brand, String model, int capacity, DiscType discType, BigDecimal price) {
        super(brand, model, price);
        this.capacity = capacity;
        this.discType = discType;
    }

    public enum DiscType {
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
