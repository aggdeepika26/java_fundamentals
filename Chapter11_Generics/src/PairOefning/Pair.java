package PairOefning;

public class Pair<E> {
    private E num1;
    private E num2;
    public Pair(E num1, E num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public E getNum1() {
        return num1;
    }

    public void setNum1(E num1) {
        this.num1 = num1;
    }

    public E getNum2() {
        return num2;
    }

    public void setNum2(E num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return
                "num1=" + getNum1() + "\n" +
                "num2=" + getNum2() ;

    }
}
