package CalculateWalletMoney;

public enum Coin
{
    ONE_CENT(0.01),
    TWO_CENT(0.02),
    FIVE_CENTS(0.05),
    TEN_CENTS(0.10),
    TWENTY_CENTS(0.20),
    FIFTY_CENT(0.50),
    ONE_EURO(1),
    TWO_EURO(2);

    private double value;
    private Coin(double value)
    {
        this.value = value;
    }
    public double getValue()
    {
        return value;
    }
  /*  public String toString()
    {
        return name();
    }*/

}
