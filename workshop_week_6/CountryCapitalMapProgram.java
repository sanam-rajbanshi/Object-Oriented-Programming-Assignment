package workshop6;

import java.util.HashMap;

public class CountryCapitalMapProgram {

    public static void printMap(HashMap<String, String> map) {
        for (String country : map.keySet()) {
            System.out.println(country + " -> " + map.get(country));
        }
    }

    public static String getCapital(HashMap<String, String> map, String country) {
        return map.get(country);
    }

    public static boolean containsCapital(HashMap<String, String> map, String capital) {
        return map.containsValue(capital);
    }

    public static void main(String[] args) {

        HashMap<String, String> countryCapitals = new HashMap<>();

        countryCapitals.put("Nepal", "Kathmandu");
        countryCapitals.put("India", "New Delhi");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Germany", "Berlin");

        System.out.println("All country-capital pairs:");
        printMap(countryCapitals);

        System.out.println("\nCapital of Japan: " + getCapital(countryCapitals, "Japan"));

        System.out.println("\nContains capital Tokyo? " + containsCapital(countryCapitals, "Tokyo"));

        System.out.println("\nIterating using loop:");
        for (String country : countryCapitals.keySet()) {
            System.out.println(country + " -> " + countryCapitals.get(country));
        }
    }
}
