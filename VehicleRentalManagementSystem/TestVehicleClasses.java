package VRMS;

public class TestVehicleClasses {
    public static void main(String[] args) {
        // Test Car
        Vehicle car = new Car("C001", "Toyota Corolla", 50.0, true, true);
        System.out.println("Car Rental Cost for 3 days: " + car.calculateRentalCost(3));
        System.out.println("Car Availability: " + car.isAvailableForRental());

        // Test Truck
        Vehicle truck = new Truck("T001", "Ford F-150", 100.0, true, 2000);
        System.out.println("Truck Rental Cost for 2 days: " + truck.calculateRentalCost(2));
        System.out.println("Truck Availability: " + truck.isAvailableForRental());

        // Test Motorcycle
        Vehicle motorcycle = new Motorcycle("M001", "Harley Davidson", 30.0, true);
        System.out.println("Motorcycle Rental Cost for 5 days: " + motorcycle.calculateRentalCost(5));
        System.out.println("Motorcycle Availability: " + motorcycle.isAvailableForRental());
    }
}
