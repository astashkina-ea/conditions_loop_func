public class Func_08 {
    //методы
    /*[модификаторы] тип_возвращаемого_значения название_метода ([параметры]){
        // тело метода
    }*/
    public static void main(String[] args) {
        //вызов метода
        printMe();

        //вызов метода с аргументами
        printMe1(45);

        int s  = (sum(1,4));
        printMe1(s);

        //вызов метода в методе
        printMe1(sum(10, 10));
    }

        //модифииктор + статик или не статик + тип возвращаемого значения + название метода
        //void -  ничего не возвращает
        public static void printMe() { //метод не принимает аргументы
            System.out.println("Hello world");
        }

        //метод с аргументами
        public static void printMe1(int number) {
            System.out.println(number);
        }

        //метод который возвращает тип данных int
        public static int sum(int a, int b) {
            int c = a + b;
            return c; // верни что-то
        }
}