package Inheritance.SingleInheritance.Vehicles;

public class VehiclesDemo {

    public static void main(String[] args) {

//        VehiclesService = new VehiclesService();
        CarService carService = new CarService();
        TrucksService trucksService = new TrucksService();

//        vehiclesService.rent();

        carService.rent();    // parent method
        carService.carRent(); // own method

        trucksService.rent();  // parent method
        trucksService.truckRent(); // own method

    }
}
