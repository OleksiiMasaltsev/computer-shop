package masaltsev.model.component;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Component {
    private String brand;
    private String model;
    private BigDecimal price;

    public Component(String brand, String model, BigDecimal price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Component component = (Component) o;
        if (!Objects.equals(brand, component.brand)) {
            return false;
        }
        if (!Objects.equals(model, component.model)) {
            return false;
        }
        return Objects.equals(price, component.price);
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "brand: '" + brand + '\''
                + ", model: '" + model + '\''
                + ", price: " + price;
    }
}
