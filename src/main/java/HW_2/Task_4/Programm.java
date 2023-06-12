package HW_2.Task_4;

import java.util.Scanner;

public class Programm {
    public Programm() {
    }

    public void method() {
        int x = 0;
        while (x != 1) {
            System.out.println("Enter text:");
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();

            try {
                if (str.equals("")) {
                    throw new Exception();
                }

                System.out.println("Your creativity:" + str);
                System.out.println("Good job!");
                x = 1;
            } catch (Exception var5) {
                System.out.println("Exception e: \nNull is bad! \nTry again!");
            }
        }

    }
}