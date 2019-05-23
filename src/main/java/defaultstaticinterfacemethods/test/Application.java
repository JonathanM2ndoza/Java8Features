package defaultstaticinterfacemethods.test;

import defaultstaticinterfacemethods.model.Car;
import defaultstaticinterfacemethods.model.MultiAlarmCar;
import defaultstaticinterfacemethods.model.Vehicle;

public class Application {

    public static void main(String[] args) {

        Vehicle car = new Car("BMW");
        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());
        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff());
        System.out.println(Vehicle.getHorsePower(2500, 480));

        System.out.println("===================================");
        
        Vehicle vehicle = new MultiAlarmCar("Audi");
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.speedUp());
        System.out.println(vehicle.slowDown());
        System.out.println(vehicle.turnAlarmOn());
        System.out.println(vehicle.turnAlarmOff());
        System.out.println(Vehicle.getHorsePower(2500, 480));
    }
}
