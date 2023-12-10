package Oefningen;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Oefning3 {
    public static void main(String[] args) {
        try{
            BufferedWriter writer = new BufferedWriter((new FileWriter("C:\\Users\\aggar\\OneDrive\\Documents\\Deepika\\Hilal\\Message.txt")));
            writer.write("Ik heb heel veel geleerd in java Ontwikkelaar Programma. Bedankt Hilal");
            writer.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
