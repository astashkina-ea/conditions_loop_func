public class Rec_09 {
    public static void main(String[] args) {
        // рекурсия - функция которая вызывает сама себя
        int result = fact(5);
        System.out.println(result);
        int result2 = factRec(5);
        System.out.println(result2);

        System.out.println(fact1(5));
    }

    //факториал обычным образом
    public static int fact(int number) {
        if (number == 0) {
            return 1;
        }
        int res = 1;
        for (int i = 1; i <= number; i++) {
            res = res * i;
        }
        return res;
    }

    //2 способ
    public static int fact1(int number) {
        if (number == 0) {
            return 1;
        }
        int res = 1;
        for (int i = number; i > 0; i--) {
            res = res * i;
        }
        return res;
    }

    //факториал рекурсивно
    public static int factRec(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factRec(number - 1);
    }

}