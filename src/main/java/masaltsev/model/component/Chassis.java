package masaltsev.model.component;

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
        Chassis chassis = (Chassis) o;
        return chassisType == chassis.chassisType;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (chassisType != null ? chassisType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Chassis "
                + "type: " + chassisType + ", "
                + super.toString();
    }
}
