package chapter7.practice;

interface Addable
{
    void add();
}

interface Reducible
{
    void reduce();
}

interface Changeable extends Addable, Reducible
{
    int UNITS=30;
}

class Number implements Changeable
{
    static int number;

    @Override
    public void add()
    {
        number+=Changeable.UNITS;
    }

    @Override
    public void reduce()
    {
        number-=Changeable.UNITS;
    }

    public void output()
    {
        System.out.println("园区现有游客："+number+"人。");
    }
}
