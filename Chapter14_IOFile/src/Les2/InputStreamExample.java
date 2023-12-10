package Les2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.*;

public class InputStreamExample {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\aggar\\OneDrive\\Documents\\text1.rtf";
        String destinationFile = "C:\\Users\\aggar\\OneDrive\\Documents\\text1Copied.rtf";
        try (InputStream inputStream = new FileInputStream(sourceFile);
            OutputStream outputStream = new FileOutputStream(destinationFile))
        {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while((bytesRead = inputStream.read(buffer)) != -1)
            {
                outputStream .write(buffer, 0,bytesRead);

            }
            System.out.println("File copied successfully");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
