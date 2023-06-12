package HW_2.Task_1;

import java.util.Scanner;

public class FloatNumber {

    public void method() {
        int x = 0;
        while (x != 1) {
            System.out.println("Enter number:");
            Scanner scan = new Scanner(System.in);
            String num = scan.nextLine();

            try {
                float number = Float.parseFloat(num);
                System.out.println("It's your float number: " + number);
                System.out.println("Good job!");
                x = 1;

            } catch (Exception NumberFormat) {
                System.out.println("Exception NumberFormat: This is a string, not a fractional number. \nEnter again!");
            }
        }
    }
}