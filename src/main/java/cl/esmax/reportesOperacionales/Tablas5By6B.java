/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.esmax.reportesOperacionales;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Rodrigo
 */
public class Tablas5By6B 
{
    public double FactIntPol(double API60, double TEMPINT, FileWriter myWriter)
    {
            double FactIntPol = -11111111111d;
            
        try {
            myWriter.write("FactIntPol_INI\n");
        } catch (IOException ex) {
            Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
        }               

            double A1, A2, A3, A4;
            double D1, D2, D3, D4;
            double B1, B2;
            double DecAPI, DecTemp;
            DecAPI = API60 - (int)(API60);
            DecTemp = TEMPINT - (int)(TEMPINT);
            if(!(DecAPI == 0) && !(DecAPI == 0.5))
            {
                D1 = Otras.MasBajo(API60);
                D3 = Otras.MasAlto(API60);
                D2 = Otras.MasBajo(TEMPINT);
                {
                    NuevaTabla6B nuevaTabla6B = new NuevaTabla6B();
                    A1 = nuevaTabla6B.FactorApi(D1, D2, myWriter);
                }

                //MsgBox "FactorApi = " & A1
                
                {
                    NuevaTabla6B nuevaTabla6B = new NuevaTabla6B();
                    A3 = nuevaTabla6B.FactorApi(D3, D2, myWriter);
                }
                
                if((!(DecTemp == 0)) && (!(DecTemp == 0.5)))
                {
                    D4 = Otras.MasAlto(TEMPINT);
                    
                    {
                        NuevaTabla6B nuevaTabla6B = new NuevaTabla6B();
                        A2 = nuevaTabla6B.FactorApi(D1, D4, myWriter);
                    }
                    
                    {
                        NuevaTabla6B nuevaTabla6B = new NuevaTabla6B();
                        A4 = nuevaTabla6B.FactorApi(D3, D4, myWriter);
                    }
                    
                    B1 = Otras.Interpolar(D2, D4, A1, A2, TEMPINT);
                    B2 = Otras.Interpolar(D2, D4, A3, A4, TEMPINT);
                    
                    FactIntPol = Otras.round(Otras.Interpolar(D1, D3, B1, B2, API60), 4); //redondeo decimal 4to
                }
                else
                {
                    FactIntPol = Otras.round(Otras.Interpolar(D1, D3, A1, A3, API60), 4); //redondeo decimal 4to
                }
            }            
            else
            {
                if((!(DecTemp == 0)) && (!(DecTemp == 0.5)))
                {
                    D2 = Otras.MasBajo(TEMPINT);
                    D4 = Otras.MasAlto(TEMPINT);
                    
                    {
                        NuevaTabla6B nuevaTabla6B = new NuevaTabla6B();
                        A1 = nuevaTabla6B.FactorApi(API60, D2, myWriter);
                    }
                    
                    //MsgBox "FactorApi = " & A1
                    {
                    NuevaTabla6B nuevaTabla6B = new NuevaTabla6B();
                    A3 = nuevaTabla6B.FactorApi(API60, D4, myWriter);
                }
                    
                    FactIntPol = Otras.round(Otras.Interpolar(D2, D4, A1, A3, TEMPINT), 4); //redondeo decimal 4to
                }
                else
                {
                    {
                        NuevaTabla6B nuevaTabla6B = new NuevaTabla6B();
                        FactIntPol = nuevaTabla6B.FactorApi(API60, TEMPINT, myWriter);
                    }
                    //MsgBox "FactorApi = " & FactIntPol
                }
            }   
            
         try {                  
            myWriter.write("\nFactIntPol_FIN");
            myWriter.write("\nFactIntPol=" + FactIntPol);
        } catch (IOException ex) {
            Logger.getLogger(Tablas5By6B.class.getName()).log(Level.SEVERE, null, ex);
        }
            return FactIntPol;
    }


    public double Api60IntPol(double APIOBS, double TEMPOBS, FileWriter myWriter)
    {
        double Api60IntPol = -1111111111111d;
        
        try {
            myWriter.write("Api60IntPol_INI\n");
        } catch (IOException ex) {
            Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
        }          

        double A1, A2, A3, A4;
        double D1, D2, D3, D4;
        double B1, B2;
        double DecAPI, DecTemp;
        DecAPI = APIOBS - (int)(APIOBS);
        DecTemp = TEMPOBS - (int)(TEMPOBS);

        if((!(DecAPI == 0)) && (!(DecAPI == 0.5)))
        {
            D1 = Otras.MasBajo(APIOBS);
            D3 = Otras.MasAlto(APIOBS);
            D2 = Otras.MasBajo(TEMPOBS);
            
            {
                NuevaTabla5B nuevaTabla5b = new NuevaTabla5B();
                A1 = nuevaTabla5b.API60(D1, D2, myWriter);
            }

            //MsgBox "API60 = " & A1

            {
                NuevaTabla5B nuevaTabla5b = new NuevaTabla5B();
                A3 = nuevaTabla5b.API60(D3, D2, myWriter);
            }
            
            if(!(DecTemp == 0) && !(DecTemp == 0.5))
            {
                D4 = Otras.MasAlto(TEMPOBS);

                {
                    NuevaTabla5B nuevaTabla5b = new NuevaTabla5B();
                    A2 = nuevaTabla5b.API60(D1, D4, myWriter);
                }
                
                {
                    NuevaTabla5B nuevaTabla5b = new NuevaTabla5B();
                    A4 = nuevaTabla5b.API60(D3, D4, myWriter);
                }

                B1 = Otras.Interpolar(D2, D4, A1, A2, TEMPOBS);
                B2 = Otras.Interpolar(D2, D4, A3, A4, TEMPOBS);

                Api60IntPol = Math.round(Otras.Interpolar(D1, D3, B1, B2, APIOBS));
            }
            else
            {
                Api60IntPol = Math.round(Otras.Interpolar(D1, D3, A1, A3, APIOBS));
            }

        }
        else
        {
            if(!(DecTemp == 0) && !(DecTemp == 0.5))
            {
                D2 = Otras.MasBajo(TEMPOBS);
                D4 = Otras.MasAlto(TEMPOBS);
                
                {
                    NuevaTabla5B nuevaTabla5b = new NuevaTabla5B();
                    A1 = nuevaTabla5b.API60(APIOBS, D2, myWriter);
                }                

                {
                    NuevaTabla5B nuevaTabla5b = new NuevaTabla5B();
                    A3 = nuevaTabla5b.API60(APIOBS, D4, myWriter);
                }                 

                Api60IntPol = Math.round(Otras.Interpolar(D2, D4, A1, A3, TEMPOBS));
            }
            else
            {
                NuevaTabla5B nuevaTabla5b = new NuevaTabla5B();
                Api60IntPol = nuevaTabla5b.API60(APIOBS, TEMPOBS, myWriter);
            }

        }    
        try {
            myWriter.write("\nApi60IntPol_FIN");            
            myWriter.write("\nApi60IntPol=" + Api60IntPol);
        } catch (IOException ex) {
            Logger.getLogger(Tablas5By6B.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Api60IntPol;
    }
    
}
