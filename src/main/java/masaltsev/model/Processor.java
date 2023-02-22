package masaltsev.model;

import masaltsev.model.abstr.Component;

public class Processor extends Component {
    private SocketType socketType;

    public SocketType getSocketType() {
        return socketType;
    }

    public void setSocketType(SocketType socketType) {
        this.socketType = socketType;
    }
}
