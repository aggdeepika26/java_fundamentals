package Les1;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriterExample {
    public static void main(String[] args) {
        FileWriter fileWriter = null;

        try {
            Path path = Path.of("C:\\Users\\aggar\\OneDrive\\Documents\\text.rtf");
            Files.createDirectories(path.getParent());
            fileWriter = new FileWriter(path.toString());
            fileWriter.write("Hello ");
            fileWriter.write("How ");
            fileWriter.write("are ");
            fileWriter.write("you ");


        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        finally
        {
            if(fileWriter != null)
            {
                try{
                    fileWriter.close();
                }
                catch(IOException e)
                {
                   e.printStackTrace();
                }
            }
        }

    }
}
