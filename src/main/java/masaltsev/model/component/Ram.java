package masaltsev.model.component;

import java.math.BigDecimal;

public class Ram extends Component {
    private int capacity;
    private RamType ramType;

    public Ram(String brand, String model, int capacity, RamType ramType, BigDecimal price) {
        super(brand, model, price);
        this.capacity = capacity;
        this.ramType = ramType;
    }

    public enum RamType {
        DDR4,
        DDR5
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public RamType getRamType() {
        return ramType;
    }

    public void setRamType(RamType ramType) {
        this.ramType = ramType;
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
        Ram ram = (Ram) o;
        if (capacity != ram.capacity) {
            return false;
        }
        return ramType == ram.ramType;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + capacity;
        result = 31 * result + (ramType != null ? ramType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Ram "
                + "capacity: " + capacity
                + ", ramType: " + ramType + ", "
                + super.toString();
    }
}
