package masaltsev.model;

import masaltsev.model.abstr.Component;

public class Display extends Component {
    private int screenSize;
    private DisplayType displayType;

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
