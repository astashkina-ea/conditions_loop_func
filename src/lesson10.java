import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lesson10 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int num[] = new int[3];
        int[] num2 = {1, 2, 3};

        num[0] = 1;
        num[1] = 2;
        System.out.println(num[0]);
        System.out.println(num[0] + " " + num[1]);
        System.out.println(Arrays.toString(num));
        System.out.println(num.length); //длина массива

        //листы не работают с примитивами
        List<Integer> list = new ArrayList<>();
        list.add(2); //добавляем в лист эл-ты
        list.add(3);
        System.out.println(list); //вывод листа
        System.out.println(list.get(0)); //получение эл-та листа
        System.out.println(list.size()); //длина листа

        int cash = -100;

        String result = cash > 100 ? ">100"
                : (cash == 100) ? "=100"
                : ((cash < 100) && (cash > 0)) ? "0<cash<100" : "<=0";
        System.out.println(result);

        Integer cash1 = 101;

        String result1 = cash1 > 100 ? cash1.toString()
                : (cash1 == 100) ? "=100"
                : ((cash1 < 100) && (cash1 > 0)) ? "0<cash<100" : "<=0";
        System.out.println(result1);

        int cash2 = 100;
        String result2;

        if (cash2 > 100) {
            result2 = ">100";
        } else if (cash2 == 100) {
            result2 = "=100";
        } else if ((cash1 < 100) && (cash1 > 0)) {
            result2 = "0<cash<100";
        } else
            result2 = "<=0";
        System.out.println(result2);

        int x = sum(2,4);
        System.out.println(x);
    }

    public static int sum(int a, int b) {
        return a+b;
    }
}