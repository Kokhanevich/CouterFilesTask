package kokhanevych.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WritingToOutputFile {

    public static void clearCSV(String outputFile) {
        try (BufferedWriter bufferedWriter =
                     new BufferedWriter(new FileWriter(outputFile))) {
            bufferedWriter.write("");
        } catch (IOException e) {
            System.out.println("File not found " + e);
        }
    }

    public static void writeToFile(ArrayList<String> strings, String outputFile) {
        HashMap<String, Long> results = new HashMap<>();
        try (PrintWriter writer = new PrintWriter(new File(outputFile))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Path");
            sb.append(',');
            sb.append("Quantity");
            sb.append('\n');
            ExecutorService executorService = Executors.newFixedThreadPool(strings.size());
            for (String string : strings) {
                Future<Long> future = executorService.submit(new MyThread(string));
                Long quantity = future.get();
                results.put(string, quantity);
                sb.append(string);
                sb.append(',');
                sb.append(quantity);
                sb.append('\n');
            }
            DisplayResult.showResults(results);
            executorService.shutdown();
            writer.write(sb.toString());
        } catch (FileNotFoundException | InterruptedException | ExecutionException e) {
            System.out.println(e.getMessage());
        }
    }
}
