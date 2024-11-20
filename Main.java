package mobilecompany;

import mobilecompany.ui.menu;

public class Main {
    public static void main(String[] args) {
        // Створення об'єкта Menu, який відповідає за відображення меню та обробку команд
        menu menu = new menu();

        // Відображення головного меню
        menu.displayMenu();
    }
}
