package tech.barny.sda;

import java.util.Scanner;

public class ZadanieTtrojkat {
    public static void main (String args[])
    {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        a = scanner.nextInt();
        System.out.println("b = ");
        b = scanner.nextInt();
        System.out.println("c = ");
        c = scanner.nextInt();

        if(a < b + c && b < a + c && c < a + b)
        {
            System.out.println("Tak!");
        }
        else
            System.out.println("Nie!");
        }
    }

