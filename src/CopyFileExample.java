import java.io.*;
import java.net.URL;

public class CopyFileExample {
    private static final String FILE_URL = "D:\\Code4\\Copy file\\src\\source.txt";
    private static final String FILE_URL1 = "D:\\Code4\\Copy file\\src\\target.txt";

    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(new File(FILE_URL));
            outputStream = new FileOutputStream(new File(FILE_URL1));

            int length;
            byte[] buffer = new byte[1024];

            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            System.out.println("file is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            inputStream.close();
            outputStream.close();
        }
    }
}