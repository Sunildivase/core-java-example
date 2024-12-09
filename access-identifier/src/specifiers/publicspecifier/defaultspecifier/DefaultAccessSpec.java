package specifiers.publicspecifier.defaultspecifier;

public class DefaultAccessSpec {

    // default access specifier is accessible only inside class

    int id;
    String state;
    int pincode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String  getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "specifiers.publicspecifier.defaultspecifier.DefaultAccessSpec{" +
                "id=" + id +
                ", state=" + state +
                ", pincode=" + pincode +
                '}';
    }
}
