package masaltsev.model;

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
}
