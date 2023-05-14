package Glava3;

public class Vehicle2 {
    int passengers; // кол-во пассажиров
    int wheels; // кол-во колес
    int maxspeed; // макс. скорость
    int burnup; // расход топлива
} // Vehicle class
class VehicleDemo {
    public static void main(String[] args) {
        Vehicle2 car1 = new Vehicle2();
        car1.passengers = 2; // два пассажира
        car1.wheels = 6; // шесть колес
        car1.maxspeed = 130; // макс. скорость 130 км/ч
        car1.burnup = 30; // расход топлива 30 литров на 100 км
        double distance = car1.maxspeed * 0.5;

        System.out.print("За пол часа car1 может проехать");
        System.out.println(distance + "км.");
        car1 = null;
    }

        }
