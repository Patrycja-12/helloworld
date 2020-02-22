package tech.barny.sda;

public class Rzutowanie {
    public static void main (String[] args)
    {
        String s = "20";
        try
        {
            int i = Integer.parseInt(s.trim());
            System.out.println("int i = " + i);
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }
    }
}
