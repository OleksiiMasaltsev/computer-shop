package masaltsev.model;

import java.math.BigDecimal;

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

    public enum ChassisType {
        MINI_ITX,
        MICRO_ATX,
        ATX,
        E_ATX
    }
}
