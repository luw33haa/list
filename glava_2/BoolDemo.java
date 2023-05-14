public class BoolDemo {
    public static void main(String[] args) {
        boolean b;
        b= false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println("b равно" + b);
        //переменная логического типа может стоять
        //в условии оператора if
        if (b) System.out.println("Как вы думаете, увидите ли вы эту строку?");
        System.out.println("Выражение 10>9 имеет" + (10>9));
    }
}
