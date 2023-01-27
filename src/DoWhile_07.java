public class DoWhile_07 {
    //цикл do-while
    //do { операторы } while(логическое выражение);
    public static void main(String[] args) {
        //когда нужно сделать что то один раз точно
        int cash = 100;
        do {
            System.out.println("Купил что то очень нужное");
            cash = cash - 20;
        } while (cash > 0);

        int cash1 = 0;
        do {
            System.out.println("Работаю....");
            cash1 = cash1 + 34;
            System.out.println("В кармане денег - " + cash1);
        } while (cash1 < 100);
        System.out.println("Накопил - " + cash1);
    }
}