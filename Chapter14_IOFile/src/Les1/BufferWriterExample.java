package Les1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample {
    public static void main(String[] args) {
        try{
            BufferedWriter writer = new BufferedWriter((new FileWriter("C:\\Users\\aggar\\OneDrive\\Documents\\text1.rtf")));
            writer.write("Writing to a file");
            writer.write("Here is our file");
            writer.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
