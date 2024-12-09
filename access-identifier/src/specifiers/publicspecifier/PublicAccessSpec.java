package specifiers.publicspecifier;

public class PublicAccessSpec {

    // public access specifier is accessible from anywhere

   public int id;
   public String name;
   public String city;

    @Override
    public String toString() {
        return "specifiers.publicspecifier.PublicAccessSpec{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
