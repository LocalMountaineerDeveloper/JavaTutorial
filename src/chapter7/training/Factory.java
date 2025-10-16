package chapter7.training;

public abstract class Factory
{
    String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public abstract String produce();
}
