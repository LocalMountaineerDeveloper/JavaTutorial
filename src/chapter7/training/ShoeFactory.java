package chapter7.training;

public class ShoeFactory extends Factory
{
    String productsName;

    public ShoeFactory(String productsName)
    {
        this.productsName=productsName;
    }

    @Override
    public String produce()
    {
        return this.productsName;
    }
}
