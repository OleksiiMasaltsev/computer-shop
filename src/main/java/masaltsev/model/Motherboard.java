package masaltsev.model;

import masaltsev.model.abstr.Component;

public class Motherboard extends Component {
    private SocketType socketType;
    private RamType ramType;

    public SocketType getSocketType() {
        return socketType;
    }

    public void setSocketType(SocketType socketType) {
        this.socketType = socketType;
    }

    public RamType getRamType() {
        return ramType;
    }

    public void setRamType(RamType ramType) {
        this.ramType = ramType;
    }
}
