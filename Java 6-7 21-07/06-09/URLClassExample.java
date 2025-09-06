import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class URLClassExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832_1280.jpg");

        System.out.println("Host: " + url.getHost());

        InputStream in = url.openStream();
        FileOutputStream fos = new FileOutputStream("D:\\Kiran\\Java 6-7 21-07\\06-09\\image.jpg");

        byte[] buffer = new byte[2048];
        int bytesRead = in.read(buffer);

        while(bytesRead != -1) {
            fos.write(buffer, 0, bytesRead);
            bytesRead = in.read(buffer);
        }

        System.out.println("Image downloaded...");
    }
}
