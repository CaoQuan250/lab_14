package Generics.Part2;

import java.util.Scanner;

public class Run {
    private static Scanner input = new Scanner(System.in);
    private static GenericCar list;

    public static void menu(){
        System.out.println("Menu");
        System.out.println("--------------------------");
        System.out.println("1. Add");
        System.out.println("2. Display");
        System.out.println("3. Get Size");
        System.out.println("4. Check Empty");
        System.out.println("5. Grab");
        System.out.println("6. Exit");
    }
    public static void main(String[] args) {
        list = new GenericCar();
        menu();

        while(true) {
            int choice;
            System.out.println("Your choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                addCar();
                menu();
            } else if (choice == 2) {
                displayCar();
                menu();
            } else if (choice == 3) {

                menu();
            } else if (choice == 4) {

                menu();
            } else if (choice == 5) {
                deleteCar();
                menu();
            } else if (choice == 6) {
                System.exit(0);
            }
        }
    }
    public static void deleteCar() {
        int id;
        System.out.println("Enter Car id: ");
        id = input.nextInt();
        list.remove(id);
    }
    public static void addCar(){
        int id = 0;
        String name;
        double price;
        System.out.println("Enter Car ID: ");
        id = input.nextInt();
        System.out.println("Enter Car Name: ");
        name = input.next();
        System.out.println("Enter Car Price: ");
        price = input.nextDouble();
        Car c = new Car(id, name, price);
        list.add(c);
    }
    public static void displayCar() {
        list.showList();
    }
}
