package Components;

public abstract class Component {

    private String model;
    private String brand;

    public Component(String model, String brand){
        this.model = model;
        this.brand = brand;

    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }
}
