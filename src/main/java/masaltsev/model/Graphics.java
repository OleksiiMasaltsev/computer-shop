package masaltsev.model;

import java.math.BigDecimal;

public class Graphics extends Component {
    private int capacity;

    public Graphics(String brand, String model, int capacity, BigDecimal price) {
        super(brand, model, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
