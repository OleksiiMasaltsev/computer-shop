package masaltsev.model.components;

import java.math.BigDecimal;
import masaltsev.model.Component;

public class Processor extends Component {
    private SocketType socketType;

    public Processor(String brand, String model, SocketType socketType, BigDecimal price) {
        super(brand, model, price);
        this.socketType = socketType;
    }

    enum SocketType {
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
}
