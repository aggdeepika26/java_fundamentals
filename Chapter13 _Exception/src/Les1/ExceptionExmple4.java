package Les1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExmple4 {
    public static void main(String[] args) {
        String path = "C:\\Users\\aggar\\OneDrive\\Desktop\\Output_Product_Project1_Collection.png";
        try {
            FileInputStream fis = new FileInputStream(path);
            System.out.println("This exists");

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}