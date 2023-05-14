package Glava3;

public class Vehicle5 {
    int passengers; // кол-во пассажиров
    int wheels; // кол-во колес
    int maxspeed; // макс. скорость
    int burnup; // расход топлива

    //конструктор с праметрами
    Vehicle5 (int p, int w, int ms, int bu) {
        passengers = p;
        wheels = w;
        maxspeed = ms;
        burnup = bu;
    }
    double distance (double interval) {
        double value = maxspeed * interval;
        return value;
    }
}
class VehicleConstrDemo {
    public static void main(String[] args) {
        Vehicle5 car = new Vehicle5(2,4,130,30);
        Vehicle5 bus = new Vehicle5(45,4,120,25);

        double interval = 1;
        double distanceCar = car.distance(interval);
        double distanceBus = bus.distance(interval);

        System.out.println("Автомобиль с" + car.passengers + "пассажирами" + "проедет за 1 час" + distanceCar + "км.");
        System.out.println("Автобус с" + bus.passengers + "пассажирами" + "проедет за 1 час" + distanceBus + "км.");
    }
}
