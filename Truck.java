public class Truck implements Vehicle{
    private String type;
    private int week;

    public Truck(String type, int week) {
        this.type = type;
        this.week = week;
    }

    public String getType() {
        return type;
    }

    public int getWeek() {
        return week;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    @Override
    public double calculateRentalCost() {
        return 500*week;
    }

    @Override
    public void displayDetails() {
        System.out.println(
                "Truck: " +
                "\n\tType: " + type +
                "\n\tWeekly Rental Rate: $500" +
                "\n\tRental Cost: $" + calculateRentalCost()
        );
    }
}
