package tech.barny.sda;

public class Matematyka {
    public static void main (String[] args)
    {
Matematyka m = new Matematyka();
m.className();
        System.out.println(m.sqrt(5));
        System.out.println(m.sqrt(55));
        System.out.println(m.sqrt(10));
 System.out.println(m.sqrt(10.5));
 System.out.println(m.sqrt(15.5));
 System.out.println(m.sqrt(20.5));


    }
    public void className ()
    {
        System.out.println("Matematyka");
    }
    public int sqrt(int a)
    {
        return a*a;
    }
    public double sqrt(double a)
    {
        return a*a;
    }
}
