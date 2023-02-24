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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Disc disc = (Disc) o;
        if (capacity != disc.capacity) {
            return false;
        }
        return discType == disc.discType;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + capacity;
        result = 31 * result + (discType != null ? discType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Disc "
                + "capacity: " + capacity
                + ", discType: " + discType + ", "
                + super.toString();
    }
}
