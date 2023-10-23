// Program of swapping two string arrays
package Oefningen3;

public class Oefning2 {
    public static void main(String[] args) {
        String[] firstArray = {"Intec", "is", "the", "best!"};

        String[] secondArray = {"C#", "is", "the", "worst!"};

        String[] thirdArray = new String[firstArray.length];
        int firstArrayLength = firstArray.length;
        int secondArrayLength = secondArray.length;

        for (int i = 0; i< firstArrayLength ;i++)
        {
            thirdArray[i] = firstArray[i];
        }
        for (int i = 0; i< secondArrayLength ;i++)
        {
            firstArray[i] = secondArray[i];
        }
        for (int i = 0; i< firstArrayLength ;i++)
        {
            secondArray[i] = thirdArray[i];
        }



        System.out.println("Now First String array is");
        for (int i = 0; i< firstArrayLength ;i++)
        {
            System.out.print(firstArray[i] + "  ");
        }
        System.out.println("");

        System.out.println("Now Second String array is");
        for (int i = 0; i< secondArrayLength ;i++) {
            System.out.print(secondArray[i] + "  ");
        }


    }
}
