package edu.nc.tasks.utils;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Utility for registering various types of
 * inputs from the user
 */
public class InputAction {
    /**
     * This method pauses the application and waits
     * until the user presses the Enter key.
     */
    public static void waitForEnter() {
        System.out.println("Нажмите Enter для продолжения...");

        try {
            System.in.read();
        } catch (IOException e) {}
    }

    /**
     * This method takes input from the user,
     * printing an errormessage if the input
     * is not numerical.
     *
     * @return int - the number the user entered
     */
    public static int readNumber() {
        Scanner inp = new Scanner(System.in);
        int n = -1;

        while (true) {
            try {
                n = inp.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введите число");
                inp = new Scanner(System.in);
            }
        }
        return n;
    }

    /**
     * This method takes 'y' or 'n' from the user
     * to confirm or cancel operations respectively.
     *
     * @return boolean - confirmation
     */
    public static boolean confirm() {
        Scanner inp = new Scanner(System.in);
        char cmd;

        do {
            cmd = inp.next().charAt(0);
        }
        while ((cmd != 'y') && (cmd != 'n'));

        return cmd == 'y';
    }
}