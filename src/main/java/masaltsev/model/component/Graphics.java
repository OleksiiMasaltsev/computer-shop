package masaltsev.model.component;

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
        Graphics graphics = (Graphics) o;
        return capacity == graphics.capacity;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + capacity;
        return result;
    }

    @Override
    public String toString() {
        return "Graphics "
                + "capacity: " + capacity + ", "
                + super.toString();
    }
}
