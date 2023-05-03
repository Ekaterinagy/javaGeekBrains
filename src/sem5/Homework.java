package sem5;

import java.util.LinkedList;
import java.util.Scanner;

public class Homework {

    /**
     * Реализовать консольное приложение, которое:*
     * 1. Принимает от пользователя и “запоминает” строки.
     * 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
     * 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
     * 4. Если введено exit, завершаем программу*
     * Пример:
     * java
     * python
     * c#
     * print > [c#, python, java]
     * revert
     * print > [python, java]
     * kotlin
     * print > [kotlin, python, java]
     * revert
     * revert
     * revert
     * print > []
     * revert > Ошибка!
     * exit -> (Программа завершилась)
     */

    public static final String EXIT = "exit";
    public static final String REVERT = "revert";
    public static final String PRINT = "print";
    public static void main(String[] args) {
        LinkedList<String> lines = new LinkedList<>();
        System.out.println("Старт программы");
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning){
            String userInput = scanner.nextLine();
            switch (userInput){
                case EXIT -> isRunning = false;
                case REVERT -> lines.remove();
                case PRINT -> System.out.println(lines);
                default -> lines.addFirst(userInput);
            }
        }
        System.out.println("Конец программы");
    }
}


