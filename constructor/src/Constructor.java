public class Constructor {

    private int id;
    private String name;

    //default constructor(non parameterized):- means it gives output null and 0

//    public Constructor(){
//
//    }

    //parameterized constructor:-

    public Constructor(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "ConstructorDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
