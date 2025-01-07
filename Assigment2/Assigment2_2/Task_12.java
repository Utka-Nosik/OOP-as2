package Assigment2.Assigment2_2;

public class Task_12 {
    public static String city = "Tokyo";
    public static double population = 34.5;

    public static void main(String[] args) {
        printCityPopulation("Jakarta", 25.3);
        printCityPopulation("Seoul", 25.2);
        printCityPopulation("Delhi", 23.1);
        printCityPopulation("New York", 21.6);
    }

    public static void printCityPopulation(String cityName, double cityPopulation) {
        System.out.println("The city of " + cityName + " has a population of " + cityPopulation + " million.");
        System.out.println("While the most populous city " + city + " has a population of " + population + " million.");
    }
}