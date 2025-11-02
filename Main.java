import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static ArrayList<Vehicle> vehicles = new ArrayList<>();
    public static void main(String[] args) {

        displayMenu();
        while (true){
            try {
                int choice = in.nextInt();
                in.nextLine();
                switch (choice){
                    case 1 -> rentCar();
                    case 2 -> rentBike();
                    case 3 -> rentTruck();
                    case 4 -> displayRentedVehicles();
                    case 5 -> {
                        System.out.println("Thank you for visiting vehicle rental system.");
                        in.close();
                        System.exit(0);
                    }
                    default -> throw new Exception("You should choose from menu: ");
                }
                if(choice <= 3){
                    System.out.println("Rental Details:");
                    vehicles.getLast().displayDetails();
                    System.out.println("============================");
                }
                displayMenu();
            }catch(InputMismatchException e){
                System.out.print("Your input should be an integer number: ");
            }catch(Exception e){
                System.out.print(e.getMessage());
            }
        }
    }

    public static void displayMenu(){
        System.out.print("""
                Menu:\
                
                1- Rent a car.\
                
                2- Rent a bike.\
                
                3- Rent a track.\
                
                4- display all rented vehicles\
                
                5- Exit\
                
                Choose from the above menu:\s"""
        );
    }

    public static void rentCar(){
        System.out.print("Enter the car model: ");
        String model = in.nextLine();
        System.out.print("How many days you want to rent: ");
        vehicles.add(new Car(model,in.nextInt()));
    }

    public static void rentBike(){
        System.out.print("Enter the bike's brand: ");
        String brand = in.nextLine();
        System.out.print("How many hours you want to rent: ");
        vehicles.add(new Bike(brand,in.nextInt()));
    }

    public static void rentTruck(){
        System.out.print("Enter the truck type: ");
        String type = in.nextLine();
        System.out.print("How many weeks you want to rent: ");
        vehicles.add(new Truck(type,in.nextInt()));
    }

    public static void displayRentedVehicles(){
        System.out.println("----All rented vehicles: ----");
        for(Vehicle v : vehicles){
            v.displayDetails();
            System.out.println("================================");
        }
    }

}
