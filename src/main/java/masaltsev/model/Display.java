package masaltsev.model;

import java.math.BigDecimal;

public class Display extends Component {
    private int screenSize;
    private DisplayType displayType;

    public Display(String brand, String model, int screenSize,
                   DisplayType displayType, BigDecimal price) {
        super(brand, model, price);
        this.screenSize = screenSize;
        this.displayType = displayType;
    }

    enum DisplayType {
        IPS,
        TN,
        VA
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public DisplayType getDisplayType() {
        return displayType;
    }

    public void setDisplayType(DisplayType displayType) {
        this.displayType = displayType;
    }
}
