package VRMS;

public class TestRentalTransaction {
    public static void main(String[] args) {
        // Create Vehicle and Customer
        Vehicle car = new Car("C001", "Kia Picanto", 50.0, true, true);
        Customer customer = new Customer("Somuah Kofi");

        // Create Rental Transaction
        RentalTransaction transaction = new RentalTransaction(car, customer, 4);

        // Print transaction details
        System.out.println("Transaction Details:");
        System.out.println("Vehicle: " + transaction.getVehicle().getModel());
        System.out.println("Customer: " + transaction.getCustomer().getName());
        System.out.println("Rental Days: " + transaction.getRentalDays());
        System.out.println("Total Cost: " + transaction.getTotalCost());
    }
}
