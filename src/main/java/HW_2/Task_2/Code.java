package HW_2.Task_2;

// В коде отсутствовал заданный массив
// Делитель был нулём

public class Code {
    public Code() {
    }

    public static void main(String[] args) {
        int[] intArray = new int[]{10, 20, 30, 40, 60, 80, 100, 200, 1000};

        try {
            int d = 2;
            double catchedRes1 = (double)(intArray[8] / d);
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException var5) {
            System.out.println("Catching exception: " + var5);
        }

    }
}