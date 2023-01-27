public class For_05 {
    public static void main(String[] args) {
        //цикл for - счетчик
        int[] numbers = {3, 5 , 6 ,12};
//        for ([инициализация счетчика]; [условие выхода] и [изменение счетчика]){ // действия}
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]); // распечатает все элементы массива
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]); // распечатает все элементы массива в обратном порядке
        }

        //бесконеченый цикл - 1
//        for (int i = 0; i < 10; ) {
//            System.out.println("Привет"); // распечатает все элементы массива
//        }

        //бексонечный цикл - 2
//        for ( ; ; ) {
//            System.out.println("Привет"); // распечатает все элементы массива
//        }

        //еще один вид работы со счетчиком
        int counter = 0;
        for (; counter < 7; ) { System.out.println("I WILL NOT"); counter++;
        }

        //for each (короче, не задумываемся над длиной массива, не можем выйти за пределы массива)
        //for (тип и название: название массива/коллекции) { // действия, которые выполняются }
        int[] numbers_arr = {1, 3 ,54, 67 ,89, 2};
        for (int digital : numbers_arr) {
            System.out.println(digital);
        }
        //предыдущая реализация (если нужно знать индекс)
        for (int digital = 0; digital < numbers_arr.length; digital++) {
            System.out.println(numbers_arr[digital]); // распечатает все элементы массива
        }
    }
}