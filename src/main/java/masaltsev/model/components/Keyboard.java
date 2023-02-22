package masaltsev.model.components;

import java.math.BigDecimal;
import masaltsev.model.Component;

public class Keyboard extends Component {
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
}
