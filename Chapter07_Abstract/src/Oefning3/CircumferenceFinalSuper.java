package Oefning3;

abstract class CircumferenceFinalSuper {
    final int SUNDIAMETER = 864938;
    final double PI  = 3.14;
    final double EARTHDIAMETER = 7926.38;
    final int MERCURYDIAMETER = 4879;


    public final double sunCircumference()
    {
        return SUNDIAMETER*PI;
    }

    public final double earthCircumference()
    {
        return EARTHDIAMETER*PI;
    }
    public final double mercuryCircumference()
    {
        return MERCURYDIAMETER*PI;
    }



}
