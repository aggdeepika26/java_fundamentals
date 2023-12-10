package Les1;

import java.io.*;


public class BufferReader
{
    public static void main(String[] args) {
            try{
                BufferedReader reader = new BufferedReader((new FileReader("C:\\Users\\aggar\\OneDrive\\Documents\\text1.rtf")));
                System.out.println(reader.readLine());
                reader.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }
