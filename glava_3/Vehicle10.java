package Glava3;

public class Vehicle10 {
    int passengers; // кол-во пассажиров
    private int wheels; // кол-во колес
    private int maxspeed; // макс. скорость
    int burnup; // расход топлива

    Vehicle10(int passengers, int wheels, int maxspeed, int burnup) {
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
    Vehicle10() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup =13;
    }
}

class Auto extends Vehicle10 {
    boolean sunroof;
}

public class ExtendsVehicle10Demo {
    public static void main(String[] args) {
        Auto bmw = new Auto ();
        bmw.sunroof = true;

        System.out.println("Путь, пройденный за 1.5 часа: " +bmw.distance(1.5) + " км");
        System.out.println("Max.скорость: " +bmw.getMaxSpeed() + " км/ч");
        System.out.println("Наличие люка: " +bmw.sunroof);

    }
}