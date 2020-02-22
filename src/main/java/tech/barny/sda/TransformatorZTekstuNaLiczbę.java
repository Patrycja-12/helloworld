package tech.barny.sda;

public class TransformatorZTekstuNaLiczbę {
    private int dolnaGranica;
    private int górnaGranica;
    private int podzielnePrzez;
    public TransformatorZTekstuNaLiczbę(int dolnaGranica, int górnaGranica, int podzielnePrzez)
    {
        this.dolnaGranica = dolnaGranica;
        this.górnaGranica = górnaGranica;
        this.podzielnePrzez = podzielnePrzez;
    }
    public int przekształćNaLiczbę(String tekst)
    {
        int liczba;
        try
        {
            liczba = Integer.parseInt(tekst);
        }
        catch (NumberFormatException e)
        {
            throw new RuntimeException("Tekst nie zawiera liczby");
        }
        if (liczba > górnaGranica || liczba < dolnaGranica)
        {
            throw new RuntimeException(
                    String.format("Poza zakresem %d - %d", dolnaGranica, górnaGranica)
            );
        }
        if (liczba % podzielnePrzez != 0)
        {
            throw new RuntimeException(
                    String.format("Niepodzielna przez %d", podzielnePrzez)
            );
        }
        return liczba;
    }
}


