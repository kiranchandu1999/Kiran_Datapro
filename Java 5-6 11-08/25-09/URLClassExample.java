import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class URLClassExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://platform.vox.com/wp-content/uploads/sites/2/chorus/uploads/chorus_asset/file/19397812/1048232144.jpg.jpg?quality=90&strip=all&crop=0%2C10.736513278159%2C100%2C78.526973443682&w=1200");
        FileOutputStream fout = new FileOutputStream("D:\\Kiran\\Java 5-6 11-08\\25-09\\sunset_image.jpg");

        InputStream in = url.openStream();
        byte[] chunk = new byte[1024];

        int count = in.read(chunk);
        while(count != -1) {
            fout.write(chunk, 0, count);
            count = in.read(chunk);
        }

        System.out.println("Image downloaded!!");
    }
}
