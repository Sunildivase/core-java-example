package instanceofoperator;


public class InstanceOf {

    public static void main(String[] args) {

      String city = "pune";
      Integer length = 23;
      Double temperature = 36.7;

        // instanceof is used to check the datatypes are match or not

      if(city instanceof String){
          System.out.println("type of city is String");
      }
      else{
          System.out.println("type of city is not String");
      }
        if(length instanceof Integer){
            System.out.println("type of length is Integer");
        }
        else{
            System.out.println("type of length is not Integer");
        }
        if(temperature instanceof Double){
            System.out.println("type of temperature is Double");
        }
        else{
            System.out.println("type of temperature is not Double");
        }


    }
}
