package masaltsev.model;

import masaltsev.model.abstr.Component;

public class Ram extends Component {
    private int capacity;
    private RamType ramType;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public RamType getRamType() {
        return ramType;
    }

    public void setRamType(RamType ramType) {
        this.ramType = ramType;
    }
}
