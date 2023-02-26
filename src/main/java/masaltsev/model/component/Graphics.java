package masaltsev.model.component;

import java.math.BigDecimal;

public class Graphics extends Component {
    private int memorySize;

    public Graphics(String brand, String model, int memorySize, BigDecimal price) {
        super(brand, model, price);
        this.memorySize = memorySize;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
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
        return memorySize == graphics.memorySize;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + memorySize;
        return result;
    }

    @Override
    public String toString() {
        return "Graphics "
                + "capacity: " + memorySize + ", "
                + super.toString();
    }
}
