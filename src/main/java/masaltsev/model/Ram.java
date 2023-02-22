package masaltsev.model;

import java.math.BigDecimal;

public class Ram extends Component {
    private int capacity;
    private RamType ramType;

    public Ram(String brand, String model, int capacity, RamType ramType, BigDecimal price) {
        super(brand, model, price);
        this.capacity = capacity;
        this.ramType = ramType;
    }

    enum RamType {
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
}
