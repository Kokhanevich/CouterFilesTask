package kokhanevych.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DisplayResult {
    private static int counter = 0;
     
    public static void showResults(HashMap<String, Long> results) {
        System.out
                .println("--------------------------------------------------------");
        System.out.format("%10s %20s %20s", "Id", "FilesQuantity", "Path");
        System.out.println();
        ;
        for (Map.Entry<String, Long> entrySet : results.entrySet()) {
            counter++;
            System.out
                    .println("--------------------------------------------------------");
            System.out.println();
            System.out.format("%10d %20d %20s", counter, entrySet.getValue(), entrySet.getKey());
            System.out.println();
        }
    }
}
