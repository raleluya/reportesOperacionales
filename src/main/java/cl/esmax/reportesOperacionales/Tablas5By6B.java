/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.esmax.reportesOperacionales;



/**
 *
 * @author Rodrigo
 */
public class Tablas5By6B 
{
    public double FactIntPol(double API60, double TEMPINT)
    {
        double FactIntPol;
        
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
                A1 = nuevaTabla6B.FactorApi(D1, D2);                
            }

            //MsgBox "FactorApi = " & A1
            
            {
                NuevaTabla6B nuevaTabla6B = new NuevaTabla6B();            
                A3 = nuevaTabla6B.FactorApi(D3, D2);
            }
            
            if((!(DecTemp == 0)) && (!(DecTemp == 0.5)))
            {
                D4 = Otras.MasAlto(TEMPINT);

                {
                    NuevaTabla6B nuevaTabla6B = new NuevaTabla6B();                 
                    A2 = nuevaTabla6B.FactorApi(D1, D4);
                }

                {
                    NuevaTabla6B nuevaTabla6B = new NuevaTabla6B();                 
                    A4 = nuevaTabla6B.FactorApi(D3, D4);
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
                    A1 = nuevaTabla6B.FactorApi(API60, D2);
                }
                
                //MsgBox "FactorApi = " & A1
                {
                    NuevaTabla6B nuevaTabla6B = new NuevaTabla6B();                 
                    A3 = nuevaTabla6B.FactorApi(API60, D4);
                }
                
                FactIntPol = Otras.round(Otras.Interpolar(D2, D4, A1, A3, TEMPINT), 4); //redondeo decimal 4to
            }            
            else
            {
                {
                    NuevaTabla6B nuevaTabla6B = new NuevaTabla6B();                  
                    FactIntPol = nuevaTabla6B.FactorApi(API60, TEMPINT);
                }
                //MsgBox "FactorApi = " & FactIntPol
            }
        }
        
        return FactIntPol;
    }


    double Api60IntPol(double APIOBS, double TEMPOBS)
    {
        double Api60IntPol;

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
                A1 = nuevaTabla5b.API60(D1, D2);
            }

            //MsgBox "API60 = " & A1

            {
                NuevaTabla5B nuevaTabla5b = new NuevaTabla5B();
                A3 = nuevaTabla5b.API60(D3, D2);
            }
            
            if(!(DecTemp == 0) && !(DecTemp == 0.5))
            {
                D4 = Otras.MasAlto(TEMPOBS);

                {
                    NuevaTabla5B nuevaTabla5b = new NuevaTabla5B();
                    A2 = nuevaTabla5b.API60(D1, D4);
                }
                
                {
                    NuevaTabla5B nuevaTabla5b = new NuevaTabla5B();
                    A4 = nuevaTabla5b.API60(D3, D4);
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
                    A1 = nuevaTabla5b.API60(APIOBS, D2);
                }                

                {
                    NuevaTabla5B nuevaTabla5b = new NuevaTabla5B();
                    A3 = nuevaTabla5b.API60(APIOBS, D4);
                }                 

                Api60IntPol = Math.round(Otras.Interpolar(D2, D4, A1, A3, TEMPOBS));
            }
            else
            {
                NuevaTabla5B nuevaTabla5b = new NuevaTabla5B();
                Api60IntPol = nuevaTabla5b.API60(APIOBS, TEMPOBS);
            }

        }       
        return Api60IntPol;
    }
    
}
