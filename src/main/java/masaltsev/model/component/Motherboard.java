package masaltsev.model.component;

import java.math.BigDecimal;

public class Motherboard extends Component {
    private Processor.SocketType socketType;
    private Ram.RamType ramType;

    public Motherboard(String brand, String model, Processor.SocketType socketType,
                       Ram.RamType ramType, BigDecimal price) {
        super(brand, model, price);
        this.socketType = socketType;
        this.ramType = ramType;
    }

    public Processor.SocketType getSocketType() {
        return socketType;
    }

    public void setSocketType(Processor.SocketType socketType) {
        this.socketType = socketType;
    }

    public Ram.RamType getRamType() {
        return ramType;
    }

    public void setRamType(Ram.RamType ramType) {
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
        Motherboard that = (Motherboard) o;
        if (socketType != that.socketType) {
            return false;
        }
        return ramType == that.ramType;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (socketType != null ? socketType.hashCode() : 0);
        result = 31 * result + (ramType != null ? ramType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Motherboard "
                + "socketType: " + socketType
                + ", ramType: " + ramType + ", "
                + super.toString();
    }
}
