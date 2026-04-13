package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float euro =  Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2.0 euro. Test result : " + passed);
        float dollar = rubleToDollar(800);
        System.out.println("800 rubles are " + dollar + " dollars.");
        input = 800;
        expected = 13.333333F;
        output = Converter.rubleToDollar(input);
        passed = expected == output;
        System.out.println("800 rubles are 13.333333 dollars. Test result : " + passed);
    }
}
