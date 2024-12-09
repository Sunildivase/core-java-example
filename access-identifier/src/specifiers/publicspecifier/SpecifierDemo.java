package specifiers.publicspecifier;

import specifiers.publicspecifier.defaultspecifier.DefaultAccessSpec;
import specifiers.publicspecifier.privatespecifier.PrivateAccessSpec;
import specifiers.publicspecifier.protectedspecifier.ProtectedAccessSpec;

public class SpecifierDemo {

    public static void main(String[] args) {

        SpecifierDemo specifierDemo = new SpecifierDemo();
        specifierDemo.publicSpecifierDemo();
        specifierDemo.PrivateSpecifierDemo();
        specifierDemo.ProtectedSpecDemo();
        specifierDemo.DefaultSpecifierDemo();

    }

    void publicSpecifierDemo() {
        PublicAccessSpec publicAccessSpec = new PublicAccessSpec();
        publicAccessSpec.id = 1;
        publicAccessSpec.name = "aman";
        publicAccessSpec.city = "pune";

        System.out.println("public specifier " + publicAccessSpec);
    }

    void PrivateSpecifierDemo() {

        PrivateAccessSpec privateAccessSpec = new PrivateAccessSpec();
        privateAccessSpec.setId(1);
        privateAccessSpec.setMake("mahindra");
        privateAccessSpec.setModel("xuv700");

        System.out.println("private specifier: " + privateAccessSpec);
    }

    void ProtectedSpecDemo(){
        ProtectedAccessSpec protectedAccessSpec = new ProtectedAccessSpec();
        protectedAccessSpec.setId(1);
        protectedAccessSpec.setbName("eden garden");
        protectedAccessSpec.setbCity("mumbai");

        System.out.println("protected specifier: "+protectedAccessSpec);

    }

    void DefaultSpecifierDemo(){
        DefaultAccessSpec defaultAccessSpec = new DefaultAccessSpec();
        defaultAccessSpec.setId(1);
        defaultAccessSpec.setState("maharashtra");
        defaultAccessSpec.setPincode(400001);

        System.out.println("default protector :"+defaultAccessSpec);
    }

}