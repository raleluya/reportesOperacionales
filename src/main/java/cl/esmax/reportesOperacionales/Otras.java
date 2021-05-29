/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.esmax.reportesOperacionales;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rodrigo
 */
public class Otras 
{
    static double Interpolar(double AA1, double AA2, double BB1, double BB2, double AA3, FileWriterChap archivo)
    {
        double Interpolar;
        if(AA2 == AA1)
            Interpolar = 0;
        else
            Interpolar = (AA3 - AA1) * (BB2 - BB1) / (AA2 - AA1) + BB1;
        
                try {
                    archivo.write("\n");                    
                    archivo.write
                                (
                                    ((Double)
                                        (
                                            Interpolar
                                        )).toString()
                                );
                } catch (IOException ex) {
                    Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
                } 
                
        return Interpolar;
    }
    
    static double MasBajo(double NN, FileWriterChap archivo)
    {
        double MasBajo;
        float dec = (float)(NN - (int)(NN));
        if(dec < 0.5)
            MasBajo = ((int)NN);
        else
            MasBajo = ((int)NN) + 0.5;
        
                try {
                    archivo.write("\n");                    
                    archivo.write
                                (
                                    ((Double)
                                        (
                                            MasBajo
                                        )).toString()
                                );
                } catch (IOException ex) {
                    Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
                }          
        return MasBajo;
    }
    
    static double MasAlto(double NN, FileWriterChap archivo)
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

        try {
            archivo.write("\n");                    
            archivo.write
                        (
                            ((Double)
                                (
                                    MasAlto
                                )).toString()
                        );
        } catch (IOException ex) {
            Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
        }  
                        
        return MasAlto;
    }
    
    static public double round(double value, int places, FileWriterChap archivo) 
    {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        
        try {
            archivo.write("\n");                    
            archivo.write
                        (
                            ((Double)
                                (
                                    bd.doubleValue()
                                )).toString()
                        );
        } catch (IOException ex) {
            Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
        }  

        
        return bd.doubleValue();
    }    
}

