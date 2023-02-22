package masaltsev.model;

import masaltsev.model.abstr.Component;

public class Speaker extends Component {
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
