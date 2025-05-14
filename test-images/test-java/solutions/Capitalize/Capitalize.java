import java.io.*;
import java.util.Arrays;
import java.lang.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length != 0) {

            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

            String line;

            while ((line = reader.readLine()) != null) {
                line = Arrays.asList(line.split(" ")).stream()
                        .filter(word -> word.length() > 0)
                        .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase())
                        .reduce("", (result, word) -> result.isEmpty() ? word : result + " " + word);
                System.out.println(line);
                writer.write(line);
                writer.newLine();
            }
            reader.close();
            writer.close();
        }
    }
}