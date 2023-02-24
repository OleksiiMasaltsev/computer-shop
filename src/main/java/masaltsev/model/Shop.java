package masaltsev.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import masaltsev.model.component.Chassis;
import masaltsev.model.component.Component;
import masaltsev.model.component.Disc;
import masaltsev.model.component.Graphics;
import masaltsev.model.component.Motherboard;
import masaltsev.model.component.Processor;
import masaltsev.model.component.Ram;

public class Shop {
    private final Set<Component> storage;

    public Shop() {
        storage = new HashSet<>();
        fillStorage();
    }

    public Set<Component> getStorage() {
        return storage;
    }

    private void fillStorage() {
        Chassis chassis1 = new Chassis("Deepcool", "mod1", Chassis.ChassisType.ATX,
                BigDecimal.valueOf(14.56));
        Chassis chassis2 = new Chassis("Fractial Design", "mod2", Chassis.ChassisType.MINI_ITX,
                BigDecimal.valueOf(12.44));
        Chassis chassis3 = new Chassis("Deepcool", "mod3", Chassis.ChassisType.E_ATX,
                BigDecimal.valueOf(19.66));

        Disc disc1 = new Disc("WD", "mod1", 1000, Disc.DiscType.HDD,
                BigDecimal.valueOf(45.70));
        Disc disc2 = new Disc("Verbatim", "mod2", 2000, Disc.DiscType.HDD,
                BigDecimal.valueOf(87.66));
        Disc disc3 = new Disc("SanDisc", "mod3", 500, Disc.DiscType.SSD,
                BigDecimal.valueOf(32.55));
        Disc disc4 = new Disc("Crucial", "mod4", 1000, Disc.DiscType.SSD,
                BigDecimal.valueOf(53.55));

        Graphics graphics1 = new Graphics("Asus", "3070", 8000, BigDecimal.valueOf(614.2));
        Graphics graphics2 = new Graphics("Gigabyte", "3060Ti", 8000, BigDecimal.valueOf(554));
        Graphics graphics3 = new Graphics("Gigabyte", "6650", 8000, BigDecimal.valueOf(426));
        Graphics graphics4 = new Graphics("MSI", "3080Ti", 12000, BigDecimal.valueOf(999.99));

        Motherboard motherboard1 = new Motherboard("AsRock", "mod1",
                Processor.SocketType.LGA1700, Ram.RamType.DDR5, BigDecimal.valueOf(180.4));
        Motherboard motherboard2 = new Motherboard("MSI", "mod2",
                Processor.SocketType.AM5, Ram.RamType.DDR5, BigDecimal.valueOf(165.44));
        Motherboard motherboard3 = new Motherboard("Gigabyte", "mod3",
                Processor.SocketType.LGA1700, Ram.RamType.DDR4, BigDecimal.valueOf(210));

        Processor processor1 = new Processor("Intel", "12400F", Processor.SocketType.LGA1700,
                BigDecimal.valueOf(165.99));
        Processor processor2 = new Processor("Intel", "13600K", Processor.SocketType.LGA1700,
                BigDecimal.valueOf(350));
        Processor processor3 = new Processor("AMD", "7600X", Processor.SocketType.AM5,
                BigDecimal.valueOf(270));
        Processor processor4 = new Processor("AMD", "5600", Processor.SocketType.AM4,
                BigDecimal.valueOf(158));

        Ram ram1 = new Ram("Crucial", "mod1", 16000, Ram.RamType.DDR4, BigDecimal.valueOf(125));
        Ram ram2 = new Ram("G.Skill", "mod2", 32000, Ram.RamType.DDR5, BigDecimal.valueOf(260));
        Ram ram3 = new Ram("Goodram", "mod3", 16000, Ram.RamType.DDR4, BigDecimal.valueOf(45));

        storage.add(chassis1);
        storage.add(chassis2);
        storage.add(chassis3);
        storage.add(disc1);
        storage.add(disc2);
        storage.add(disc3);
        storage.add(disc4);
        storage.add(graphics1);
        storage.add(graphics2);
        storage.add(graphics3);
        storage.add(graphics4);
        storage.add(motherboard1);
        storage.add(motherboard2);
        storage.add(motherboard3);
        storage.add(processor1);
        storage.add(processor2);
        storage.add(processor3);
        storage.add(processor4);
        storage.add(ram1);
        storage.add(ram2);
        storage.add(ram3);
    }
}
