import java.util.ArrayList;
import java.util.List;

public class List_03 {
    public static void main(String[] args) {
        //List - список (хранит в себе массивы), лист - это объект

        //создание листа
        List<String> peoples = new ArrayList<>();
        peoples.add("Петя");//добавление элмента в лист
        peoples.add("Вася");
        peoples.add("Оля");
        //размер листа
        System.out.println(peoples.size());
        //получение эл-та по его индексу
        System.out.println(peoples.get(0));
        //вывести весь список листа
        System.out.println(peoples);

    }
}