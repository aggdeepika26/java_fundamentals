package les3.PriorityQueue;

public class BurgerOrder implements Comparable<BurgerOrder>
{
    int number;
    String name;
    public BurgerOrder(int number, String name)
    {
        this.number = number;
        this.name = name;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    @Override
    public String toString() {
        return
                "number=" + number +
                "Name='" + name ;
    }

    public int compareTo(BurgerOrder o)
    {
        return this.getNumber() - o.getNumber();
    }
}
