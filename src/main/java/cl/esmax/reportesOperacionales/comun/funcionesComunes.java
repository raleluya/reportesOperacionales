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
public class funcionesComunes 
{
    public static double masBajo(double NN)
    {
        double masBajo;
        float dec;
        dec = (float)NN - (int)NN;
        if(dec < 0.5)
            masBajo = (int)NN;
        else
            masBajo = (int)NN + 0.5;
        
        return masBajo;
    }

    public static double masAlto(double NN)
    {            
        double masAlto;
        float dec;
        dec = (float)NN - (int)NN;
        if(dec == 0)
            masAlto = (int)(NN);
        else
        {    
            if(dec <= 0.5)
                masAlto = (int)(NN) + 0.5;
            else
                masAlto = (int)(NN) + 1;
        }
        
        return masAlto;
    }

}
