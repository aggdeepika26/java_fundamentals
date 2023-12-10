package Oefningen;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class Oefning1 {
        public static void main(String[] args) {
            try{
                BufferedWriter writer = new BufferedWriter((new FileWriter("C:\\Users\\aggar\\OneDrive\\Documents\\Deepika\\Hilal\\Message.txt")));
                writer.close();
                BufferedWriter writer1 = new BufferedWriter((new FileWriter("C:\\Users\\aggar\\OneDrive\\Documents\\Deepika\\Hilal\\animal.txt")));
                writer.close();
                writer1.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
}
