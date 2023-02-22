package masaltsev.model;

import java.util.List;
import masaltsev.model.components.Chassis;
import masaltsev.model.components.Disc;
import masaltsev.model.components.Motherboard;
import masaltsev.model.components.Processor;
import masaltsev.model.components.Ram;

public abstract class Computer {
    private Motherboard motherboard;
    private Chassis chassis;
    private List<Processor> processors;
    private List<Disc> discs;
    private List<Ram> rams;

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Chassis getaCase() {
        return chassis;
    }

    public void setaCase(Chassis chassis) {
        this.chassis = chassis;
    }

    public List<Processor> getProcessors() {
        return processors;
    }

    public void setProcessors(List<Processor> processors) {
        this.processors = processors;
    }

    public List<Disc> getDiscs() {
        return discs;
    }

    public void setDiscs(List<Disc> discs) {
        this.discs = discs;
    }

    public List<Ram> getRams() {
        return rams;
    }

    public void setRams(List<Ram> rams) {
        this.rams = rams;
    }
}
