package Glava3;

public class Vehicle8 {
    int passengers; // кол-во пассажиров
    private int wheels; // кол-во колес
    private int maxspeed; // макс. скорость
    int burnup; // расход топлива

    Vehicle8(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.setWheels (wheels);
        this.maxspeed = maxspeed;
        this.burnup = burnup ;
    }
    // расчет пройденного пути
    double distance (double interval) {
        double val = this.maxspeed * interval;
        return val;
    }
    // метод чтения значения maxspeed
    int hetMaxSpeed() {
        return this.maxspeed;
    }
    // метод чтения значения количества колес
    int getWheels() {
        return this.wheels;
    }
    // метод записи количества колес
    void setWheels (int wheels) {
        if ((wheels<1) || (wheels>24)) {
            System.out.println("Неверно указано число колес.");
            return;
        }
        this.wheels = wheels;
    }

    public String getMaxSpeed() {
        return null;
    }
}
class VehicleGetSetMethod {
    public static void main(String[] args) {
        Vehicle8 ferrari = new Vehicle8(2,-2,360,12);
        System.out.println("Max скорость: " + ferrari.getMaxSpeed() + "км/ч");
        System.out.println("Число колес: " + ferrari.getWheels());

        ferrari.setWheels(4);
        System.out.println("Число колес (повторно): " +ferrari.getWheels());

    }
}
