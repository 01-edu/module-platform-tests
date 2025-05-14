import java.io.*;

class CatInFile {
    public static void cat(String[] args) throws IOException {
        if (args.length != 0) {
            FileOutputStream fos = new FileOutputStream(args[0]);
            while(System.in.available() > 0) {
                byte[] bytes = System.in.readNBytes(1000);
                fos.write(bytes);
            }
            fos.close();
        }
    }
}