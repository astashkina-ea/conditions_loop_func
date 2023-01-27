public class While_06 {
    public static void main(String[] args) {
        //цикл while
        // while(Логическое выражение) { операторы } //пока логическое выражение верно то выполняем тело цикла
        int cash = 100;
        while (cash > 0) {
            System.out.println("Купил что то очень нужное");
            cash = cash - 20;
        }

        //бесконечный цикл - 1
//        int cash1 = 100;
//        while (cash1 > 0) {
//            System.out.println("Купил что то очень нужное");
//        }

        //бесконечный цикл - 2
//        while (true) {
//            System.out.println("Купил что то очень нужное");
//        }
    }
}