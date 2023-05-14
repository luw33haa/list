package Glava3;

public class Vehicle9 {
    int passengers; // кол-во пассажиров
    private int wheels; // кол-во колес
    private int maxspeed; // макс. скорость
    int burnup; // расход топлива

    Vehicle9() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup =13;
    }

    Vehicle9(int passengers,int wheels,int maxspeed,int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup ;
    }

    Vehicle9 ferrari;

    {
        ferrari = new Vehicle9(2, 4, 360, 12);
    }

    Vehicle9 moskvich = new Vehicle9();
}


