import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

public class Cat {
    public static void cat(String[] args) throws IOException {
        if (args.length != 0) {
            FileInputStream fis = new FileInputStream(args[0]);
            while (fis.available() > 0) {
                System.out.write(fis.readNBytes(1000));
            }
            fis.close();
        }
    }
}
