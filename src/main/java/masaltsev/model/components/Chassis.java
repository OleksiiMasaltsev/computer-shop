package masaltsev.model.components;

import java.math.BigDecimal;
import masaltsev.model.Component;

public class Chassis extends Component {
    private ChassisType chassisType;

    public Chassis(String brand, String model, ChassisType chassisType, BigDecimal price) {
        super(brand, model, price);
        this.chassisType = chassisType;
    }

    public ChassisType getCaseType() {
        return chassisType;
    }

    public void setCaseType(ChassisType chassisType) {
        this.chassisType = chassisType;
    }

    enum ChassisType {
        MINI_ITX,
        MICRO_ATX,
        ATX,
        E_ATX
    }
}
