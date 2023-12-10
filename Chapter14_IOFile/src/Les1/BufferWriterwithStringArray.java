package Les1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterwithStringArray {
    public static void main(String[] args)
    {
        String[] names = {"John", "Lee" , "Emmy"};
        try
        {
            BufferedWriter writer = new BufferedWriter((new FileWriter("C:\\Users\\aggar\\OneDrive\\Documents\\text2.rtf")));
            writer.write("Writing to a file");
            writer.write("Here is our file");
            for(String str : names)
            {
                writer.write("\n" + str);
            }
        writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
