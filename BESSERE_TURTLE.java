

class BESSERE_TURTLE extends TURTLE
{
    
    BESSERE_TURTLE ()
    {
        super();

    }

    void RückwärtsLaufen(int schritte)
    {
        Drehen(180);
        Gehen(schritte);
        Drehen(180);

    }

    int XGeben()
    {
        return super.posX;
    }

    int YGeben()
    {
        return super.posY;
    }

    int WinkelGeben()
    {
        return super.winkel;
    }

    /*public void GeheZu(int xneu, int yneu)
    {
        
       
        super.Drehen(-WinkelGeben());
        int win;
        double delta_y;
        double delta_x;
        delta_x=xneu-XGeben();
        delta_y=yneu-YGeben();
        if(delta_x == 0)
        {
            super.Drehen(-90);
            super.Gehen(delta_y);
        }
        else
        {
            double quotient;
            quotient = delta_y/delta_x;
            win = (int) Math.toDegrees(Math.atan(Math.abs(quotient)));
            int laenge;
            laenge=(int) Math.sqrt(delta_y*delta_y+delta_x*delta_x);
            if(delta_x>0)
            {
                if(delta_y>=0)
                {
                    super.Drehen(-win);
                }
                else
                {
                    super.Drehen(win);
                }
            }
            else
            {
                if(delta_y>=0)
                {
                    super.Drehen(180+win);
                }
                else
                {
                    super.Drehen(180-win);
                }
            }
            super.Gehen(laenge);
        }

    }*/

}
