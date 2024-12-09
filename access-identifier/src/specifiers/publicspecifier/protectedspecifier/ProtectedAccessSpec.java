package specifiers.publicspecifier.protectedspecifier;

public class ProtectedAccessSpec {

    // protected access specifier is accessible only inside package
    // if we use different package then we have to use set method
    // in same package it will automatically set values when create object

    protected int id;
    protected String bName;
    protected String bCity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbCity() {
        return bCity;
    }

    public void setbCity(String bCity) {
        this.bCity = bCity;
    }

    @Override
    public String toString() {
        return "ProtectedAccessSpec{" +
                "id=" + id +
                ", bName='" + bName + '\'' +
                ", bCity='" + bCity + '\'' +
                '}';
    }
}
