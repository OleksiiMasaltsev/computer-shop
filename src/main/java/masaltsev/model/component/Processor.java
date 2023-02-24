package masaltsev.model.component;

import java.math.BigDecimal;

public class Processor extends Component {
    private SocketType socketType;

    public Processor(String brand, String model, SocketType socketType, BigDecimal price) {
        super(brand, model, price);
        this.socketType = socketType;
    }

    public enum SocketType {
        LGA1200,
        LGA1700,
        LGA4189,
        AM4,
        AM5,
        SP3
    }

    public SocketType getSocketType() {
        return socketType;
    }

    public void setSocketType(SocketType socketType) {
        this.socketType = socketType;
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
        Processor processor = (Processor) o;
        return socketType == processor.socketType;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (socketType != null ? socketType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Processor "
                + "socketType: " + socketType + ", "
                + super.toString();
    }
}
