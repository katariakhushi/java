import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EXP52 {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Writing to a file
        try (FileWriter writer = new FileWriter(outputFile)) {
            writer.write("Hello, this is a sample text.");
            writer.write("It will be written to the output file.");
            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // Reading from a file
        try (FileReader reader = new FileReader(inputFile)) {
            int character;
            StringBuilder content = new StringBuilder();

            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }

            System.out.println("Content read from the file:");
            System.out.println(content.toString());
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

