package be.intecbrussel.les1;
import java.util.Scanner;
public class ScannerExample2 {
        public static void main(String[] args) {
            //Creeet een Scanner object
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enetr user name");
            String userName = myScanner.nextLine();
            System.out.println("Enter age");
            int age = myScanner.nextInt();
            System.out.println("Enetr Salary");
            double salary = myScanner.nextDouble();
            System.out.println("User Name is :" + userName);
            System.out.println("Age is" + age);
            System.out.println("Salry is" + salary);
        }
}
