package Les1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader2 {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader((new FileReader("C:\\Users\\aggar\\OneDrive\\Documents\\text2.rtf")));
            String line;
            while((line = reader.readLine())!= null)
            {
                System.out.println(line);
            }
          reader.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
