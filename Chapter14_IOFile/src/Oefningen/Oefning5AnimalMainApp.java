package Oefningen;

import java.io.*;

public class Oefning5AnimalMainApp {
    public static void main(String[] args) {

        Oefning4Animal instanceAnimal = new Oefning4Animal("Dog" , false) ;
//Writing in animal text file
        try{
            BufferedWriter writer = new BufferedWriter((new FileWriter("C:\\Users\\aggar\\OneDrive\\Documents\\Deepika\\Hilal\\animal.txt")));
            writer.write("My favourite animal is " + instanceAnimal.animalName + "\n" );
            writer.write("edible : " + instanceAnimal.edible);
            writer.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

//Reading animal text file
        try{
            BufferedReader reader = new BufferedReader((new FileReader("C:\\Users\\aggar\\OneDrive\\Documents\\Deepika\\Hilal\\animal.txt")));
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
