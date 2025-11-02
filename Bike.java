public class Bike implements Vehicle{
    private String brand;
    private int hours;

    public Bike(String brand, int hours) {
        this.brand = brand;
        this.hours = hours;
    }

    public String getBrand() {
        return brand;
    }

    public int getHours() {
        return hours;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double calculateRentalCost() {
        return 10*hours;
    }

    @Override
    public void displayDetails() {
        System.out.println(
                "Bike:" +
                "\n\tBrand: " + brand +
                "\n\tHourly Rental Rate: $10" +
                "\n\tRental Cost: $" + calculateRentalCost()
        );
    }
}
