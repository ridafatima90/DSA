package books.joshuabloch.objects;

import java.io.*;
import java.util.*;
import java.util.function.UnaryOperator;


public class SimilarRectanglesCounter {
    public static void main(String[] args) {
        // Example List<List<Long>>
        List<List<Long>> sides = getListOfLists();

        // Count nearly similar rectangles
        long count = nearlySimilarRectangles(sides);

        System.out.println("Count of nearly similar rectangles: " + count);
    }

    // Example function to get a List<List<Long>>
    private static List<List<Long>> getListOfLists() {
        List<List<Long>> listOfLists = new ArrayList<>();

        // Example data
        listOfLists.add(Arrays.asList(4L, 6L));
        listOfLists.add(Arrays.asList(2L, 3L));
        listOfLists.add(Arrays.asList(7L, 9L));

        return listOfLists;
    }

    // Function to count nearly similar rectangles
    private static long nearlySimilarRectangles(List<List<Long>> sides) {
        long count = 0;
        for (List<Long> innerLists : sides) {
            if (innerLists.size() >= 4) {
                // Check the ratio for each pair of sides
                for (int i = 0; i < innerLists.size() - 1; i += 2) {
                    if (innerLists.get(i) * innerLists.get(i + 1) == innerLists.get(i + 2) * innerLists.get(i + 3)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}





