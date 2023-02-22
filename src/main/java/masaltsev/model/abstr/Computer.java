package masaltsev.model.abstr;

import masaltsev.model.Disc;
import masaltsev.model.Motherboard;
import masaltsev.model.Processor;
import masaltsev.model.Ram;

public abstract class Computer {
    private Processor processor;
    private Motherboard motherboard;
    private Disc disc;
    private Ram ram;

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Disc getDisc() {
        return disc;
    }

    public void setDisc(Disc disc) {
        this.disc = disc;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }
}
