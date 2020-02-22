package tech.barny.sda;

public class Dom {
public static void main (String args[])
{
TV nosy = new TV(45, "nosy233");
TV sama = new TV(32, "sama2345");

    System.out.println(sama.getName() + " " + sama.getSize());
    System.out.println(nosy.getName() + " " + nosy.getSize());

    sama.getOnOff();
    sama.setOnOff(true);
    sama.getOnOff();

    Dog rex = new Dog();
    rex.speak();
    rex.setSize(15);
    System.out.println(rex.getSize());
    rex.getSize();

}

}
