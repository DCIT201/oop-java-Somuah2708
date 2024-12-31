package VRMS;

public class TestCustomerClass {
    public static void main(String[] args) {
        // Create Customer
        Customer customer = new Customer("Somuah Kofi ");

        // Create Vehicles
        Vehicle car = new Car("C001", "Kia Picanto", 50.0, true, true);
        Vehicle truck = new Truck("T001", "Ford F-150", 100.0, true, 2000);

        // Add rentals
        customer.addRental(car);
        customer.addRental(truck);

        // Complete rentals
        customer.completeRental(car);

        // Print rental history and current rentals
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Current Rentals: " + customer.currentRentals.size());
        System.out.println("Rental History: " + customer.rentalHistory.size());
    }
}
