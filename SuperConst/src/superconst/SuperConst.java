package superconst;

class Parent
{
    Parent()
    {
        System.out.println("Non-Param of parent");
    }
    Parent(int x)
    {
        System.out.println("Param of Parent "+x);
    }
}

class Child extends Parent
{
    Child()
    {
        System.out.println("Non-Param of child");
    }
    Child(int y)
    {
        System.out.println("Param of Child");
    }
    Child(int x, int y)
    {
        super(x);       // Passing parameter in super() means calling parameterized constructor of parent class
                        // Other wise by default non-parameterized constructor will call.
        System.out.println("Two Param of child "+y);
    }
}

public class SuperConst {

    public static void main(String[] args) 
    {
        //Child c=new Child(10,20);
        Cuboid c=new Cuboid(5,3,10);
        System.out.println(c.volume());
    }
    
}
