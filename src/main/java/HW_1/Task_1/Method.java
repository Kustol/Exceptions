package HW_1.Task_1;

import java.util.Arrays;

public class Method {

    public void divideByZero(int a, int b) {
        System.out.println(a / b);
    }

    public void sumOfDifferentArrays(int[] massive1) {
        int massive2[] = new int[]{1, 2, 3, 4, 5};
        int massive3[] = new int[5];
        for (int i = 0; i < massive1.length; i++) {
            massive3[i] = massive1[i] + massive2[i];
        }
        System.out.println(Arrays.toString(massive3));
    }


    public int stackOverFlow(int number) {
        System.out.println();
        if (number < 5) {
            System.out.println("Everything is fine, stack overflow will not happen");
            return number;
        } else {
            return number * stackOverFlow(number - 1);
        }
    }
}