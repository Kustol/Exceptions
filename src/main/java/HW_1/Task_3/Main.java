package HW_1.Task_3;
import java.util.Arrays;
/*
Задание 3:
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен разности элементов
двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
*/

public class Main {
    public static void main(String[] args) {
        Method method = new Method();

        // метод выполнится
        int[] array1 = new int[] { 1, 2, 3, 4, 5 };
        int[] array2 = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(method.methodExceptionSumArray(array1, array2)));

        System.out.println("\n");

        // метод будет с ошибкой
        int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
        int[] arr2 = new int[] { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(method.methodExceptionSumArray(arr1, arr2)));

    }

}