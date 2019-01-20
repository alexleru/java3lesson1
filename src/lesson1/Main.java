package lesson1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("*** Задание 1 и 2 ***");
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Изначальный маассив int");
        ChangeBetween.toStringArr(intArray);
        System.out.println("Замена местами 3 и 1 элемент int");
        intArray = ChangeBetween.changePlace(intArray, 3, 1);
        ChangeBetween.toStringArr(intArray);
        System.out.println("Массив переводим в тип ArrayList");
        ArrayList intArrayList = ChangeBetween.toArray(intArray);
        System.out.println(intArrayList);

        System.out.println("Изначальный массив string");
        String[] strArray = {"1", "2", "3", "4", "5", "6", "7"};
        ChangeBetween.toStringArr(strArray);
        System.out.println("Массив переводим в тип ArrayList");
        ArrayList strArrayList = ChangeBetween.toArray(strArray);
        System.out.println(strArrayList);

        System.out.println();
        System.out.println("*** Задание 3 ***");

        Box<Orange> orangeBox = new Box<>(new Orange());
        Box<Apple> appleBox1 = new Box<>(new Apple());
        Box<Apple> appleBox2 = new Box<>(new Apple());
        orangeBox.putInBox(30);
        appleBox1.putInBox(18);
        appleBox2.putInBox(27);
//не пойму, почему у меня в итоге в orangebox оказываются яблоки!!!
        System.out.println("Одинаков ли вес: " + appleBox2.compare(orangeBox));

    }
}
