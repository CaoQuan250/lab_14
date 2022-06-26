package Generics.Part2;

import java.util.LinkedList;
import java.util.Scanner;

public class GenericCar <T extends Car>{
    private LinkedList<T> list;

    public GenericCar(){
        list = new LinkedList<>();
    }
    public void add(Car c){
        list.add((T) c);
    }
    public void remove(int id){
        boolean found = false;
        for(Car car: list){
            if (car.getId() == id){
                int choice;
                System.out.println("Are you sure deleting this car? (1.Yes 2.No");
                choice = new Scanner(System.in).nextInt();
                if (choice == 1)
                    list.remove(car);
                found = true;
            }
        }
        if (found = false) {
            System.out.println("Can not find car with id" + id);
        }
    }
    public void showList(){
        for(Car c: list){
            c.printInfo();
        }
    }

    public void showList(LinkedList<T> clist) {
        for(Car c: list) {
            c.printInfo();
        }
    }

}
