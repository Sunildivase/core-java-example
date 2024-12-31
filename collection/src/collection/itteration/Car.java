package collection.itteration;

public class Car {
    public String model;
    public String brand;
    public int mfgYear;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", mfgYear=" + mfgYear +
                '}';
    }
}
