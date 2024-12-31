package VRMS;

public class TestRentalAgency {
    public static void main(String[] args) {
        // Create RentalAgency
        RentalAgency agency = new RentalAgency();

        // Create Vehicles
        Vehicle car = new Car("C001", "Kia Picanto", 50.0, true, true);
        Vehicle truck = new Truck("T001", "Ford F-150", 100.0, true, 2000);

        // Add Vehicles to Fleet
        agency.addVehicle(car);
        agency.addVehicle(truck);

        // Create Customer
        Customer customer = new Customer("Somuah Kofi");

        // Process Rentals
        agency.processRental(customer, "C001", 3); // Rent Car
        agency.processRental(customer, "T001", 2); // Rent Truck

        // Return Vehicle
        agency.returnVehicle(customer, "C001");

        // Generate Report
        agency.generateReport();
    }
}
