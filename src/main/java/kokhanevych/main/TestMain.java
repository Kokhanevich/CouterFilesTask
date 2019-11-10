package kokhanevych.main;

import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {
        String input = args[0];
        String output = args[1];

        ArrayList<String> strings = ParsingInputFile.parseFile(input);
        WritingToOutputFile.clearCSV(output);
        WritingToOutputFile.writeToFile(strings, output);

    }
}