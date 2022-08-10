package Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputClassScanner inputScan = new InputClassScanner();
        inputScan.setInputClass();
        String[] getInputArr = inputScan.getInputClass();

        Author authorObject = new Author();
        authorObject.Authorstr = getInputArr[0]; // доступ к public полю + значение input массива
        authorObject.show();

        Titlle titleObject  = new Titlle();
        titleObject.Titllestr = getInputArr[1];  // доступ к public полю + значение input массива
        titleObject.show();

        Content contentObject = new Content();
        contentObject.Contentstr = getInputArr[2];  // доступ к public полю + значение input массива
        contentObject.show();
    }
}
//Используя IDEA, создайте проект c пакетом. Требуется: Создать класс Book(Main). Создать классы Title,
// Author и Content, каждый из которых должен содержать одно строковое поле и метод void show ().
// Реализуйте возможность добавления в книгу названия книги, имени автора и содержания.
// Выведите на экран при помощи метода show() название книги, имя автора и Содержание.