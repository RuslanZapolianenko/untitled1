package Peckage1;

public class Rectangle {


    private double side1; // В теле класса создать два поля,
    private double side2;


    public Rectangle(double input_01, double input_02) { // Конструктор_1 .....
        this.side1 = input_01;
        this.side2 = input_02;
    }


    private double areaCalculat1or() { //метод, вычисляющие площадь прямоугольника
        double s = side1 * side2;
        return s;
    }

    private double perimeterCalculato1r() {
        double P = (side1 * 2) + (side2 * 2);
        return P;
    }

    public static void main (String[]args){

        double a = 35.7; // парметры прямоугольника
        double b = 25.7;  // парметры прямоугольника
        Rectangle rectangleNew2 = new Rectangle(a, b); // Конструктор_2 .....
        rectangleNew2.areaCalculat1or(); // обращаемся к методу
        System.out.println("Площадь: " + rectangleNew2.areaCalculat1or());
        rectangleNew2.perimeterCalculato1r();
        System.out.println("Периметр  " + rectangleNew2.perimeterCalculato1r());
    }

}






//Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Rectangle. В теле класса создать два поля
// , описывающие длины сторон double side1, double side2. Создать два метода,
// вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2)
// и периметр прямоугольника – double perimeterCalculator (double side1, double side2). Написать программу,
// которая принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и площадь.