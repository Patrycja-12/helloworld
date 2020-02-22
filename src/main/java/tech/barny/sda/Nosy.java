package tech.barny.sda;

public class Nosy extends TV1 {
    public void onTV1(boolean b){
        if(b)
            System.out.println("TV1 is on");
        else
            System.out.println("TV is off");
    }

    @Override
    public String toString() {
        return "Metoda toString klasy Nosy";
    }
}
