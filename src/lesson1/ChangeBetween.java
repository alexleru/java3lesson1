package lesson1;

import java.util.ArrayList;
import java.util.Collections;

final class ChangeBetween{


    /**Task1
     * Получает массив заданного типа и номера двух его элементов. Нумерация элементов начинается с 0.
     * Возращает массив той же длины и того же типа, но поменяев местам номера двух элементов.
     * @param inArray - массив любого типа
     * @param element1 - номер элемента для замены на элемент из параметра element2
     * @param element2 - номер элемента для замены на элемент из параметра element1
     *                 два последних параметра должны быть не меньше нуля и меньше длины массива.
     *                 Так же не должны быть равны.
     * @return this inArray c измененным порядоком
     */

    static <T> T[] changePlace(T[] inArray, int element1, int element2){
        assert element1 != element2;
        assert 0 <= element1 && element1 < inArray.length;
        assert 0 <= element2 && element2 < inArray.length;
        T tempElement = inArray[element2];
        inArray[element2] = inArray[element1];
        inArray[element1] = tempElement;
        return inArray;
    }

    /**Task2
     * Получает массив заданного типа и переводит его в массив типа ArrayList с тем же типом
     * @param inArray - массив, который будет переведен в массива типа ArrayList
     * @return ArrayList<T>
     */

    static <T> ArrayList<T> toArray(T[] inArray){
        ArrayList<T> returnArray = new ArrayList<>();
        Collections.addAll(returnArray, inArray);
        //more simple way - returnArray.toArray(inArray);
        return returnArray;
    }

    /**SOUT для вывода массива в консоль
     */
    public static <T> void toStringArr(T[] inArray){
        System.out.print("[");
        for (int i = 0; i < inArray.length; i++) {
            if (i != (inArray.length - 1)) {
                System.out.print(inArray[i] + ", ");
            } else {
                System.out.println(inArray[i] + "]");
            }
        }
    }
}