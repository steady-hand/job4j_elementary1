package ru.job4j.condition;

public class TriangleArea {
    public static double area(double a, double b, double c) {
        double first = (a + b + c) / 2;
        double second = first * (first - a) * (first - b) * (first - c);
        double result = Math.sqrt(second);
        return result;
    }

    public static void main(String[] args) {
        double result = TriangleArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
    }
}
