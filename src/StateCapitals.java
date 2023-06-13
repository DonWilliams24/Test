import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StateCapitals {
    public static void main(String[] args) {
        // Array of state-capital pairs
        String[][] stateCapitals = {
                { "Alabama", "Montgomery" },
                { "Alaska", "Juneau" },
                { "Arizona", "Phoenix" },
                { "Arkansas", "Little Rock" },
                { "California", "Sacramento" },
                { "Colorado", "Denver" },
                { "Connecticut", "Hartford" },
                { "Delaware", "Dover" },
                { "Florida", "Tallahassee" },
                { "Georgia", "Atlanta" },
                { "Hawaii", "Honolulu" },
                { "Idaho", "Boise" },
                { "Illinois", "Springfield" },
                { "Indiana", "Indianapolis" },
                { "Iowa", "Des Moines" },
                { "Kansas", "Topeka" },
                { "Kentucky", "Frankfort" },
                { "Louisiana", "Baton Rouge" },
                { "Maine", "Augusta" },
                { "Maryland", "Annapolis" },
                { "Massachusetts", "Boston" },
                { "Michigan", "Lansing" },
                { "Minnesota", "Saint Paul" },
                { "Mississippi", "Jackson" },
                { "Missouri", "Jefferson City" },
                { "Montana", "Helena" },
                { "Nebraska", "Lincoln" },
                { "Nevada", "Carson City" },
                { "New Hampshire", "Concord" },
                { "New Jersey", "Trenton" },
                { "New Mexico", "Santa Fe" },
                { "New York", "Albany" },
                { "North Carolina", "Raleigh" },
                { "North Dakota", "Bismarck" },
                { "Ohio", "Columbus" },
                { "Oklahoma", "Oklahoma City" },
                { "Oregon", "Salem" },
                { "Pennsylvania", "Harrisburg" },
                { "Rhode Island", "Providence" },
                { "South Carolina", "Columbia" },
                { "South Dakota", "Pierre" },
                { "Tennessee", "Nashville" },
                { "Texas", "Austin" },
                { "Utah", "Salt Lake City" },
                { "Vermont", "Montpelier" },
                { "Virginia", "Richmond" },
                { "Washington", "Olympia" },
                { "West Virginia", "Charleston" },
                { "Wisconsin", "Madison" },
                { "Wyoming", "Cheyenne" }
        };

        // Displaying the current contents of the array.
        // Printing empty lines because it looks cooler that way.
        System.out.println("");
        System.out.println("!!STATE CAPITAL PAIRS GAME!!");
        System.out.println("");
        System.out.println(
                "Rules: Memorize the pairs then test your memory at the bottom. Your answers will not be case sensitive, good luck ;)");
        System.out.println("");
        displayArray(stateCapitals);

        // Sort the array by capital using bubble sort
        bubbleSortByCapital(stateCapitals);

        // Display the sorted array
        System.out.println("\nSTATES SORTED BY CAPITAL!!");
        System.out.println("");
        displayArray(stateCapitals);

        // Prompt the user to enter the state capitals
        int correctCount = 0;
        Scanner scanner = new Scanner(System.in);
        for (String[] stateCapital : stateCapitals) {
            String state = stateCapital[0];
            String capital = stateCapital[1];
            // another empty line because it looks cool
            System.out.println("");

            System.out.print("ENTER CAPITAL OF " + state + ": ");
            String userCapital = scanner.nextLine().trim();

            // Check if the user's answer is correct
            if (userCapital.equalsIgnoreCase(capital)) {
                correctCount++;
            }
        }

        // Display the total correct count
        System.out.println("\nScore: " + correctCount);

        scanner.close();
    }

    // Display the contents of the 2D array
    private static void displayArray(String[][] array) {
        for (String[] row : array) {
            System.out.println(row[0] + " - " + row[1]);
        }
    }

    // Sort the 2D array by capital using bubble sort
    private static void bubbleSortByCapital(String[][] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                String currentCapital = array[j][1];
                String nextCapital = array[j + 1][1];

                if (currentCapital.compareToIgnoreCase(nextCapital) > 0) {
                    // Swap the positions of the capitals
                    String[] temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    {
        // Create a HashMap to store state-capital pairs
        Map<String, String> stateCapitals = new HashMap<>();
        stateCapitals.put("Arizona", "Phoenix");
        stateCapitals.put("Arkansas", "Little Rock");
        stateCapitals.put("California", "Sacramento");
        stateCapitals.put("Colorado", "Denver");
        stateCapitals.put("Connecticut", "Hartford");
        stateCapitals.put("Delaware", "Dover");
        stateCapitals.put("Florida", "Tallahassee");
        stateCapitals.put("Georgia", "Atlanta");
        stateCapitals.put("Hawaii", "Honolulu");
        stateCapitals.put("Idaho", "Boise");
        stateCapitals.put("Illinois", "Springfield");
        stateCapitals.put("Indiana", "Indianapolis");
        stateCapitals.put("Iowa", "Des Moines");
        stateCapitals.put("Kansas", "Topeka");
        stateCapitals.put("Kentucky", "Frankfort");
        stateCapitals.put("Louisiana", "Baton Rouge");
        stateCapitals.put("Maine", "Augusta");
        stateCapitals.put("Maryland", "Annapolis");
        stateCapitals.put("Massachusetts", "Boston");
        stateCapitals.put("Michigan", "Lansing");
        stateCapitals.put("Minnesota", "Saint Paul");
        stateCapitals.put("Mississippi", "Jackson");
        stateCapitals.put("Missouri", "Jefferson City");
        stateCapitals.put("Montana", "Helena");
        stateCapitals.put("Nebraska", "Lincoln");
        stateCapitals.put("Nevada", "Carson City");
        stateCapitals.put("New Hampshire", "Concord");
        stateCapitals.put("New Jersey", "Trenton");
        stateCapitals.put("New Mexico", "Santa Fe");
        stateCapitals.put("New York", "Albany");
        stateCapitals.put("North Carolina", "Raleigh");
        stateCapitals.put("North Dakota", "Bismarck");
        stateCapitals.put("Ohio", "Columbus");
        stateCapitals.put("Oklahoma", "Oklahoma City");
        stateCapitals.put("Oregon", "Salem");
        stateCapitals.put("Pennsylvania", "Harrisburg");
        stateCapitals.put("Rhode Island", "Providence");
        stateCapitals.put("South Carolina", "Columbia");
        stateCapitals.put("South Dakota", "Pierre");
        stateCapitals.put("Tennessee", "Nashville");
        stateCapitals.put("Texas", "Austin");
        stateCapitals.put("Utah", "Salt Lake City");
        stateCapitals.put("Vermont", "Montpelier");
        stateCapitals.put("Virginia", "Richmond");
        stateCapitals.put("Washington", "Olympia");
        stateCapitals.put("West Virginia", "Charleston");
        stateCapitals.put("Wisconsin", "Madison");
        stateCapitals.put("Wyoming", "Cheyenne");
        // ... add the remaining state-capital pairs here

        // Display the contents of the HashMap
        System.out.println("State Capitals:");
        displayMap(stateCapitals);

        // Create a TreeMap to sort the HashMap
        Map<String, String> sortedMap = new TreeMap<>(stateCapitals);

        // Display the sorted contents of the TreeMap
        System.out.println("\nSORTED CAPITALS BY STATE:");
        displayMap(sortedMap);

        try (// Prompt the user to enter a state and display the capital
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nEnter a state to display the capital.: ");
            scanner.nextLine();
        }

        // Retrieve the capital for the given state

    }

    private void displayMap(Map<String, String> stateCapitals) {
    }
}