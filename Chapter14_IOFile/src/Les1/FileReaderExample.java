package Les1;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try
        {
            fileReader = new FileReader("C:\\Users\\aggar\\OneDrive\\Documents\\text.rtf");
            int position;
            while((position = fileReader.read()) != -1)
            {
                System.out.print((char) position);
            }

        }
        catch(IOException e)
        {
            e.printStackTrace();
            System.out.println("File does not exist");
        }
        finally
        {
            if (fileReader!= null)
            {
                try{
                    fileReader.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
