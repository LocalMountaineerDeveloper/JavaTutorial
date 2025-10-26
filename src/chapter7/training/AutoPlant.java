package chapter7.training;

public class AutoPlant extends Factory
{
    String productsName;

    public AutoPlant(String productsName)
    {
        this.productsName=productsName;
    }

    @Override
    public String produce()
    {
        return this.productsName;
    }
}
