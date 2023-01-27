public class If_04 {
    public static void main(String[] args) {
        //условия
        //if (true) делаем что-то, иначе не делаем
        //или делаем то, что после else если есть
        if (10 > 2) {
            System.out.println("Правда1");
        }

        int a = 10;
        int b = 15;
        if (a > b) {
            System.out.println("Правда1");
        } else {
            System.out.println("Не правда2");
        }

        //тернарный оператор
        //обычный if-else
        int cash = 100;
        String result;
        if (cash > 60){
            result = "Покупка успешна";
        } else {
            result = "Недостаточно средств";
        }
        System.out.println(result);

        //тернарный if-else
        int cash1 = 100;
        String result1;
        result1 = cash1 > 600 ? "Покупка успешна" : "Недостаточно средств"; //условие ? выражение если true : выражение если false
        System.out.println(result1);

        int cash2 = 10;
        if (cash2 > 60) {
            System.out.println("Одно условие");
        } else if (cash2 < 22) {
            System.out.println("Другое условие");
        } else if (cash2 == 22) {
            System.out.println("Третье условие");
        }
    }
}