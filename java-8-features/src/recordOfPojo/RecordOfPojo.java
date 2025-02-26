package recordOfPojo;

// public class RecordOfPojo {
//
//    // number of line code optimize by using of records of pojo
//    // ex:- if there is 5 attributes id,name,age,gender,contact
//    // we have to write getter and setter methods for it.
//    // it gets big code
//
//    int id;
//    String name;
//    int age;
//    String gender;
//    Long contact;
//
//    public RecordOfPojo(int id, String name, int age, String gender, Long contact) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//        this.contact = contact;
//    }
//}

    record RecordOfPojo(int id, String name, int age, String gender, Long contact){
     // this is example of records of pojo class.
        // no need to write getter setter method and constructor.
    }

