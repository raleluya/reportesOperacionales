/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.esmax.reportesOperacionales;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Rodrigo
 */
public class Otras 
{
    static double Interpolar(double AA1, double AA2, double BB1, double BB2, double AA3)
    {
        double Interpolar;
        if(AA2 == AA1)
            Interpolar = 0;
        else
            Interpolar = (AA3 - AA1) * (BB2 - BB1) / (AA2 - AA1) + BB1;
        return Interpolar;
    }
    
    static double MasBajo(double NN)
    {
        double MasBajo;
        float dec = (float)(NN - (int)(NN));
        if(dec < 0.5)
            MasBajo = ((int)NN);
        else
            MasBajo = ((int)NN) + 0.5;
        return MasBajo;
    }
    
    static double MasAlto(double NN)
    {
        double MasAlto;
        float dec = (float)(NN - (int)(NN));
        if(dec == 0)
        {
            MasAlto = (int)(NN);
        }
        else
        {    
            if(dec <= 0.5)
            {
                MasAlto =(int)(NN) + 0.5;                
            }

            else
            {
                
                MasAlto = (int)(NN) + 1;
            }

        }
        
        return MasAlto;
    }
    
    static public double round(double value, int places) 
    {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }    
}

