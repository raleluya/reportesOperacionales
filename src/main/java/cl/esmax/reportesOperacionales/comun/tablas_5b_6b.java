/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.esmax.reportesOperacionales.comun;

/**
 *
 * @author Rodrigo
 */
public class tablas_5b_6b 
{
    Double Api60IntPol(Double APIOBS, Double TEMPOBS)
    {
        final double CERO_PUNTO_CINCO  = 0.5;
        
        Double A1, A2, A3, A4;
        Double D1, D2, D3, D4;
        Double B1, B2;
        
        Double DecAPI, DecTemp;
        DecAPI = APIOBS - APIOBS.intValue();
        DecTemp = TEMPOBS - TEMPOBS;
        
        if(DecAPI!= 0 && DecAPI != CERO_PUNTO_CINCO)
        {
           D1 = funcionesComunes.masBajo(APIOBS);
           D3 = MasAlto(APIOBS)
           D2 = MasBajo(TEMPOBS)
               A1 = API60(D1, D2)
               A3 = API60(D3, D2)
           If(DecTemp <> 0 And DecTemp <> 0.5)
           {
               D4 = MasAlto(TEMPOBS)

               A2 = API60(D1, D4)
               A4 = API60(D3, D4)

               B1 = Interpolar(D2, D4, A1, A2, TEMPOBS)
               B2 = Interpolar(D2, D4, A3, A4, TEMPOBS)

               Api60IntPol = Round(Interpolar(D1, D3, B1, B2, APIOBS), 1)
            }
           else
            {
               Api60IntPol = Round(Interpolar(D1, D3, A1, A3, APIOBS), 1)
            }
           
        } 
        else (if DecTemp <> 0 And DecTemp <> 0.5)
        {
               D2 = MasBajo(TEMPOBS)
               D4 = MasAlto(TEMPOBS)
               A1 = API60(APIOBS, D2)
               A3 = API60(APIOBS, D4)
               Api60IntPol = Round(Interpolar(D2, D4, A1, A3, TEMPOBS), 1)
           else
            {
                Api60IntPol = API60(APIOBS, TEMPOBS)
            }
        }
    }

    public boolean isZero(double value, double threshold)
    {
        return value >= -threshold && value <= threshold;
    }

    private Double MasAlto(Double TEMPOBS) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
