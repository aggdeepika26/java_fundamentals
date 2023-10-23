package be.intecbrussel.les1;
import java.util.Scanner;
public class Calculator
{

        int number;
        int mod;
        double sum=0;
        boolean resultShow = false;

        int smallerNumber(int n1,int n2,int n3) {
            if ((n1 < n2) && (n1 < n3)) {
                return n1;
            } else if ((n2 < n1) && (n2 < n3)) {
                return n2;

            } else {
                return n3;
            }
        }




        public boolean evenOdd(int number)
        {
            boolean evenNo =    true;
            this.number = number;
            while(this.number!=0)
            {

                this.mod = this.number % 10;
                this.number = this.number / 10;
                if (this.mod % 2 == 0)
                {
                    continue;
                }
                else
                {

                    evenNo = false;
                    break;

                }
            }
            return evenNo;

        }
    public double addition()
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter numbers to find sum");
        do
        {
            if(myScanner.hasNextDouble())
            {
                double noDouble = myScanner.nextDouble();
                sum = sum+noDouble;
            }
            else if(myScanner.hasNextInt())
            {
                int noInt = myScanner.nextInt();
                sum = sum + noInt;
            }
            else
            {
                resultShow = true;
            }
        }
        while (!resultShow);
        return sum;
    }
    public boolean multiplication(int number)








}
