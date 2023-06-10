package HW_1.Task_3;

public class Method {

    public int[] methodExceptionSumArray(int[] arr1, int[] arr2) {
        int[] newArr1 = new int[] { 0 };
        if (arr1.length != arr2.length) {
            System.out.println("Действие не может быть выполнено, \nиз-за разной длины массивов!");
            return newArr1;
        }
        int[] newArr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr2[i] = arr1[i] + arr2[i];
        }
        System.out.println("Операция выполнена успешно!");
        return newArr2;
    }
}