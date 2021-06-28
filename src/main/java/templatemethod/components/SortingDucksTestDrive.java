package templatemethod.components;

import java.util.Arrays;

public class SortingDucksTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 20),
                new Duck("Donald", 15),
                new Duck("Mallard", 5),
                new Duck("Tommy", 46),
                new Duck("Billy", 23)
        };

        System.out.println("Before sorting...");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting....");
        display(ducks);
    }

    private static void display(Duck[] ducks) {

        for (Duck duck : ducks) {
            System.out.println(duck.toString());
        }
    }
}
