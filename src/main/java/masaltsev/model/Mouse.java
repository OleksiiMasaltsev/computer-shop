package masaltsev.model;

import masaltsev.model.abstr.Component;

public class Mouse extends Component {
    private boolean isWired;

    public boolean isWired() {
        return isWired;
    }

    public void setWired(boolean wired) {
        isWired = wired;
    }
}
