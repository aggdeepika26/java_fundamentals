package les1;

public class Car extends Vehicle{
    private String brandName = "Audi";
    public String getBrandName()
    {
        return brandName;
    }

    public void  setBrandName(String brandName)
    {
        this.brandName = brandName;
    }

    public void honk()
    {
        System.out.println("Tuut tuut");
    }
    public void sound()
    {
        super.honk();
    }


}
