//Implement Abstract Factory Pattern to create cars of different categories from different countries.

package DesignJava;

enum CarType{

    Hatchback,Sedan,SUV
}

enum Location {
    India , UK , China ;
}

abstract class Car {
    CarType carType;
    Location location;

    public Car(CarType carType, Location location) {
        this.carType = carType;
        this.location = location;
    }

    abstract void construct();

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", location=" + location +
                '}';
    }
}

class SUV extends Car {

    public SUV(Location location) {
        super(CarType.SUV, location);
    }

    @Override
    void construct() {
        System.out.println("connecting to Luxury Car");
    }
}

class Sedan extends Car {

    public Sedan(Location location) {
        super(CarType.Sedan, location);
    }

    @Override
    void construct() {
        System.out.println("connecting to Mini Car");
    }
}

class Hatchback extends Car {

    public Hatchback(Location location) {
        super(CarType.Hatchback, location);
    }

    @Override
    void construct() {
        System.out.println("connecting to Micro Car");
    }
}

class IndianCarFactory {

    static Car buildCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case Hatchback:
                car = new Hatchback(Location.India);
                break;
            case Sedan:
                car = new Sedan(Location.India);
                break;
            case SUV:
                car = new SUV(Location.India);
                break;
        }
        return car;
    }

}

class UkCarFactory {

    static Car buildCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case Hatchback:
                car = new Hatchback(Location.UK);
                break;
            case Sedan:
                car = new Sedan(Location.UK);
                break;
            case SUV:
                car = new SUV(Location.UK);
                break;
        }
        return car;
    }

}


class ChinaCarFactory {

    static Car buildCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case Hatchback:
                car = new Hatchback(Location.China);
                break;
            case Sedan:
                car = new Sedan(Location.China);
                break;
            case SUV:
                car = new SUV(Location.China);
                break;
        }
        return car;
    }
}

class CarFactory {
    Car car = null;

    static Car buildCar(CarType carType, Location location) {
        Car car = null;
        switch (location) {
            case India:
                car = IndianCarFactory.buildCar(carType);
                break;
            case China:
                car = ChinaCarFactory.buildCar(carType);
                break;
            case UK:
                car = UkCarFactory.buildCar(carType);
                break;
        }
        return car;
    }
}




public class AbstractFactoryCar {
    public static void main(String[] args) {

        System.out.println(
                CarFactory.buildCar(CarType.Hatchback, Location.UK)
        );

        System.out.println(
                CarFactory.buildCar(CarType.SUV, Location.India)
        );
    }
}