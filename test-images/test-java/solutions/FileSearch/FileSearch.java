import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class FileSearch {
    public static String searchFile(String fileName) {
        File rootDirectory = new File("documents");
        return searchFileRecursive(rootDirectory, fileName);
    }

    private static String searchFileRecursive(File directory, String fileName) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    String result = searchFileRecursive(file, fileName);
                    if (result != null) {
                        return result;
                    }
                } else if (Objects.equals(file.getName(), fileName)) {
                    return file.toPath().toString();
                }
            }
        }
        return null;
    }

    /* 

    public static void main(String[] args) {
        try {
            FileSearch.createFiles();
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println(e.toString());
        }
        System.out.println(FileSearch.searchFile(""));
    }

    private static void createFiles() throws IOException {
        Files.createDirectory(Paths.get("documents"));
        Files.createDirectory(Paths.get("documents/directory42"));
        Files.createDirectory(Paths.get("documents/directory1"));
        Files.createFile(Paths.get("documents/directory1/text.xls"));
        Files.createFile(Paths.get("documents/directory1/data.docx"));
        Files.createDirectory(Paths.get("documents/directory1/directory2"));
        Files.createFile(Paths.get("documents/directory1/directory2/text.xml"));
        Files.createFile(Paths.get("documents/directory1/directory2/text.csv"));
        Files.createFile(Paths.get("documents/directory1/directory2/toto"));
        Files.createDirectory(Paths.get("documents/directory1/directory3"));
        Files.createDirectory(Paths.get("documents/directory1/directory3/directory87"));
        Files.createFile(Paths.get("documents/directory1/directory3/directory87/text.xml"));
        Files.createFile(Paths.get("documents/directory1/directory3/file.xml"));
        Files.createDirectory(Paths.get("documents/directory1/directory4"));
        Files.createFile(Paths.get("documents/directory1/directory4/file.txt"));
        Files.createDirectory(Paths.get("documents/directory43"));
        Files.createDirectory(Paths.get("documents/directory43/directory4"));
        Files.createFile(Paths.get("documents/directory43/directory4/file.txt"));
        Files.createFile(Paths.get("documents/directory43/data.xls"));
    }
    */
}
