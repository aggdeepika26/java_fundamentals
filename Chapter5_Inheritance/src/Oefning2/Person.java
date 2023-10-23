package Oefning2;

public class Person {
    public String diploma;
    private String languageOfInstruction;
    private final String DURATION = "1 year";

    public Person()
    {
        this("Java Developer","Nederlands");
    }

    public Person( String diploma, String languageOfInstruction)

    {
        System.out.println("Welcome to Intec Brussel");
        System.out.println();
        this.diploma = diploma;
        this.languageOfInstruction = languageOfInstruction;
    }


    public void diplomaInfo()
    {
        System.out.println("Information of Course");
        System.out.println("**************************");
        System.out.println();
        System.out.println("Diploma       : " + diploma );
        System.out.println();
        System.out.println("Language Of Instruction   :" + languageOfInstruction );
        System.out.println();
        System.out.println("Duration of course is    : " + DURATION);

    }


}
