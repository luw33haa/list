public class ExtendedBreakDemo {
    public static void main(String[] args) {
        for(int i=1; i<4; i++){
            Блок1:{
            Блок2:{
                Блок3:{
                System.out.println("\ni равно"+ i);
                if(i ==1)break Блок1;
                if(i ==2)break Блок2;
                if(i ==3)break Блок3;
                System.out.println("Эта строка никогда не будет напечатана");
                }
            }System.out.println("Завершен блок 3");
            }System.out.println("Завершен блок 2");
        }System.out.println("Завершен блок 1");
    }
}
