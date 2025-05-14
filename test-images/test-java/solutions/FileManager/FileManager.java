import java.io.*;

public class FileManager {
    public static void createFile(String fileName, String content) {
        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.print(content);
            System.out.println("File created: " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }

    public static String getContentFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return content.toString();
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted: " + fileName);
            } else {
                System.out.println("Error deleting file: " + fileName);
            }
        } else {
            System.out.println("File not found: " + fileName);
        }
    }
}
