public class HypotDemo {
    public static void main(String[] args) {
        double cathetus1, cathetus2, hypot;
            cathetus1 = 3; //Длина первого катета
        cathetus2 = 4; // Длина второго катета
        hypot = Math.sqrt((cathetus1 * cathetus1) + (cathetus2 * cathetus2));
        System.out.println("Длина гипотенузы равна" + hypot);
    }//main (String[])
}//class HypotDemo
