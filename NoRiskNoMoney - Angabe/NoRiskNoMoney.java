public class NoRiskNoMoney
{   
    boolean[]gewürfelteZahlen;
    int gewinn;
    boolean spielistfertig;
    int wurf;
    
    
    public NoRiskNoMoney()
    {
        gewürfelteZahlen = new boolean[6];
        gewürfelteZahlen[0] = false;
        gewürfelteZahlen[1] = false;
        gewürfelteZahlen[2] = false;
        gewürfelteZahlen[3] = false;
        gewürfelteZahlen[4] = false;
        gewürfelteZahlen[5] = false;
    }
    
    public int ZufallszahlGeben(int obergrenze)
    {
        return (int) (obergrenze*Math.random());
    }
    
    public void FelderAusgeben()
    {
       System.out.println("Applaus das war die 1   " + gewürfelteZahlen[0]);
       System.out.println("Applaus das war die 2   " + gewürfelteZahlen[1]);
       System.out.println("Applaus das war die 3   " + gewürfelteZahlen[2]);
       System.out.println("Applaus das war die 4   " + gewürfelteZahlen[3]);
       System.out.println("Applaus das war die 5   " + gewürfelteZahlen[4]);
       System.out.println("Applaus das war die 6   " + gewürfelteZahlen[5]);
    }
    
    public void Neustart()
    {
        for(int i = 0; i < gewürfelteZahlen.length; i++)
        {
            gewürfelteZahlen[i] = false;
        }
        spielistfertig=false;
        gewinn= 0;
        System.out.println("Na super jetz geht der ganze Spaß von vorne los");
    }
    
    public void Würfeln()
    {
        if(spielistfertig==false)
        {
            int wurf = ZufallszahlGeben(6);
            if(gewürfelteZahlen[wurf]==true)
            {
                spielistfertig = true;
                gewinn = 0;
                for(int i = 0; i < gewürfelteZahlen.length; i++)
                {
                    gewürfelteZahlen[i] = false;
                }
                System.out.println(" Endlich ist das Trauerspiel vorbei");
            }
            else
            {
                gewinn++;
                gewürfelteZahlen[wurf]=true;
            }
            FelderAusgeben();
        } 
    }
}
