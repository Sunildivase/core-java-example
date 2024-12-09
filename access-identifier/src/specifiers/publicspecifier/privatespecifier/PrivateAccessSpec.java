package specifiers.publicspecifier.privatespecifier;

public class PrivateAccessSpec {

    // private access specifier is accessible only inside class

    private int id;
    private String make;
    private String model;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "specifiers.publicspecifier.privatespecifier.PrivateAccessSpec{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';

    }
}
