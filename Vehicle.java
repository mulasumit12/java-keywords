class Vehicle {
    private static double registrationFee = 5000.0; // Shared registration fee for all vehicles

    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    // Constructor using 'this' keyword
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Method to display vehicle details with instanceof check
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("Invalid Vehicle Object");
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Sumit Mula", "Car", "WB123456");
        vehicle1.displayVehicleDetails();

        updateRegistrationFee(5500.0);
        System.out.println("Updated Registration Fee:");
        vehicle1.displayVehicleDetails();
    }
}
