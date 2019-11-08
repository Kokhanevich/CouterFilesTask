package kokhanevych.main;

import java.util.ArrayList;

public class TestMain {
//    private final static String PATH_TO_INPUT_FILE = "src\\main\\resources\\input.txt";
//    private final static String PATH_TO_OUTPUT_FILE = "src\\main\\resources\\output.csv";

    public static void main(String[] args) {
        String input = args[0];
        String output = args[1];
//        ArrayList<String> strings = ParsingInputFile.parseFile(PATH_TO_INPUT_FILE);
//        WritingToOutputFile.clearCSV(PATH_TO_OUTPUT_FILE);
//        WritingToOutputFile.writeToFile(strings, PATH_TO_OUTPUT_FILE);


        ArrayList<String> strings = ParsingInputFile.parseFile(input);
        WritingToOutputFile.clearCSV(output);
        WritingToOutputFile.writeToFile(strings, output);

    }
}