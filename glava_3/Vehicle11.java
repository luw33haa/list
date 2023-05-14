package Glava3;

public class Vehicle11 {

    int passengers; // кол-во пассажиров
    private int wheels; // кол-во колес
    private int maxspeed; // макс. скорость
    int burnup; // расход топлива

    Vehicle11(int passengers, int wheels, int maxspeed, int burnup) {
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
    Vehicle11() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup =13;
    }
    public String toString() {
        return "Vehicle(passengers=" + passengers + ";" +
                "wheels=" + wheels + ";" +
                "maxspeed=" + maxspeed + ";" +
                "burnup=" + burnup +
                ")";
    }
}
class Auto extends Vehicle11 {
    boolean sunroof;
    Auto(boolean sunroof) {
        this(4, 4, 200, 12, sunroof);
    }
    Auto(int f, int g, int h, int j, boolean sunroof) {
        super(f,g,h,j);
        this.sunroof = sunroof;
    }
}
class VehicleOverrideDemo {
    public static void main(String[] args) {
        Vehicle11 v = new Vehicle11(2, 2, 100, 9);
        Auto a = new Auto(2, 4, 180, 12, true);
        System.out.println("Vehicle.toString(): " + v.toString());
        System.out.println("Auto.toString(): " + a.toString());
    }
}