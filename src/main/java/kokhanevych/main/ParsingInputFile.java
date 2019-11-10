package kokhanevych.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ParsingInputFile {

    public static ArrayList<String> parseFile(String file) {
        ArrayList<String> listOfPaths = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            while (line != null) {
                listOfPaths.add(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfPaths;
    }
}
