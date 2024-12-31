package VRMS;


public class Truck extends Vehicle implements Rentable {
    private double loadCapacity;

    public Truck(String vehicleId, String model, double baseRentalRate, boolean isAvailable, double loadCapacity) {
        super(vehicleId, model, baseRentalRate, isAvailable);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + (loadCapacity * 5);
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println("Truck rented to " + customer.getName() + " for " + days + " days.");
        } else {
            System.out.println("Truck is not available.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Truck returned.");
    }
}
