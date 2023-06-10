package HW_1.Task_1;


/*
 1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
*/

public class Main {
    public static void main(String[] args) {

        Method method = new Method();
        method.divideByZero(200, 5);
//        method.divideByZero(2, 0);
//        ArithmeticException: /by zero


        int[] massive = new int[]{1, 1, 1, 1, 1};
//        int[] massive = new int[]{1, 1, 1, 1, 1, 1};
        method.sumOfDifferentArrays(massive);
//        ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

        method.stackOverFlow(4);
//        method.stackOverFlow(11);
        // переполнение стека "Stack overflow"

    }
}