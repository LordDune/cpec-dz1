package main;
import over.OverClass;
import over.View;

/**
 * Основной класс приложения
 */

public class Main {

    /**
     * Точка входа в программу
     */
    public static void main(String[] args) {
        System.out.println(View.view(10, "+", 2));
        System.out.println(View.view(10, "-", 2));
        System.out.println(View.view(10, "*", 2));
        System.out.println(View.view(10, "/", 2));
    }
}