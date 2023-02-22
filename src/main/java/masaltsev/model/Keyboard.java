package masaltsev.model;

import java.math.BigDecimal;

public class Keyboard extends Component {
    private boolean isMechanical;
    private boolean isWired;

    public Keyboard(String brand, String model,
                    boolean isWired, BigDecimal price) {
        super(brand, model, price);
        this.isWired = isWired;
    }

    public boolean isWired() {
        return isWired;
    }

    public void setWired(boolean wired) {
        isWired = wired;
    }

    public boolean isMechanical() {
        return isMechanical;
    }

    public void setMechanical(boolean mechanical) {
        isMechanical = mechanical;
    }
}
