/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.esmax.reportesOperacionales;

import cl.esmax.reportesOperacionales.comun.funcionesComunes;

/**
 *
 * @author Rodrigo
 */
public class funcionesCalculos 
{
    
    //Funciones pertenecientes a modulo "TABLAS 5B y 6B"

    double Api60IntPol(double APIOBS, double TEMPOBS)
    {
        final double CERO_PUNTO_CINCO  = 0.5;
        
        double A1, A2, A3, A4;
        double D1, D2, D3, D4;
        double B1, B2;
        
        double DecAPI, DecTemp;
        DecAPI = APIOBS - (int)APIOBS;
        DecTemp = TEMPOBS - (int)TEMPOBS;
        
        if(DecAPI!= 0 && DecAPI != CERO_PUNTO_CINCO)
        {
           D1 = funcionesComunes.masBajo(APIOBS);
           D3 = funcionesComunes.masAlto(APIOBS);
           D2 = funcionesComunes.masBajo(TEMPOBS);
           
           /*****************************************************
           
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


/*
Function FactIntPol(API60 As Double, TEMPINT As Double) As Double

Dim A1 As Double, A2 As Double, A3 As Double, A4 As Double
Dim D1 As Double, D2 As Double, D3 As Double, D4 As Double
Dim B1 As Double, B2 As Double
Dim DecAPI As Double, DecTemp As Double
DecAPI = API60 - Int(API60)
DecTemp = TEMPINT - Int(TEMPINT)

If DecAPI <> 0 And DecAPI <> 0.5 Then
    D1 = MasBajo(API60)
    D3 = MasAlto(API60)
    D2 = MasBajo(TEMPINT)
        A1 = FactorApi(D1, D2)
        MsgBox "FactorApi = " & A1
        A3 = FactorApi(D3, D2)
    If DecTemp <> 0 And DecTemp <> 0.5 Then
        D4 = MasAlto(TEMPINT)

        A2 = FactorApi(D1, D4)
        A4 = FactorApi(D3, D4)

        B1 = Interpolar(D2, D4, A1, A2, TEMPINT)
        B2 = Interpolar(D2, D4, A3, A4, TEMPINT)

        FactIntPol = Round(Interpolar(D1, D3, B1, B2, API60), 4)
    Else
        FactIntPol = Round(Interpolar(D1, D3, A1, A3, API60), 4)
    End If
Else
    If DecTemp <> 0 And DecTemp <> 0.5 Then
        D2 = MasBajo(TEMPINT)
        D4 = MasAlto(TEMPINT)
        A1 = FactorApi(API60, D2)
        MsgBox "FactorApi = " & A1
        A3 = FactorApi(API60, D4)
        FactIntPol = Round(Interpolar(D2, D4, A1, A3, TEMPINT), 4)
    Else
        FactIntPol = FactorApi(API60, TEMPINT)
        MsgBox "FactorApi = " & FactIntPol
    End If
End If
End Function

*/    
    
// FIN  Funciones pertenecientes a modulo "TABLAS 5B y 6B"


    /*
    COMIENZO FUNCIONES PERTNECIENTES A MODULO "NUEVA TABLA 5B"
    */
    
    //Ctes solo en contexto "NUEVA TABLA 5B"
    
           *****************************************************/    
    {    
        long IBASE;
        long NBP1;
        long IBP1, IBP2;
        long ITMP1, ITMP2, ITMP3;
        long IEP1, IEP2, IEP3;
        long K0F, K1F;
        long NHIF;
        long K0J, K1J;
        long NLOJ, NHIJ;
        long K0G, K1G;
        long NLOG;
        long LIM1, LIM2;
        long INT1, INT2;
        long IA;
        double IB;
        long KONST;
        int IHydro; //'Variable fija en 0. Se hace Corrección Hidrométrica

        Private IAPI As Double
        Private IT As Double
        Private IFLAG As Integer
        Private IDT As Double
        Private IRD As Double
        Private IH1 As Double, IH2 As Double
        Private IHYC As Double

        Private IDENOM As Double, IRHO As Double

        Private IRHOT As Double, JRHOT As Double
        Private ICOUNT As Double
        Private K0 As Double, K1 As Double
        Private IREG As Double
        Private IRHO60 As Double
        Private KRHO As Double, NP As Double
        Private IALF As Double
        Private IVCF As Double
        Private IRES As Double, IRES2 As Double
        Private KSAV As Double
        Private IAPI60 As Double    


            //AQUI VA API60 FUNCION GRANDE LLENAS DE IF   
            double API60(double Api, double Degf)
            {
                //ctes
                int IHydro = 0;
                int IBASE = 600;
                int NBP1 = 850;
                int IBP1 = 400, IBP2 = 500;
                int ITMP1 = 3000, ITMP2 = 2500, ITMP3 = 2000;
                int IEP1 = 2500, IEP2 = 2000, IEP3 = 1500;
                int K0F = 1038720, K1F = 2701;
                int NHIF = 370;
                int K0J = 3303010, K1J = 0;
                int NLOJ = 371, NHIJ = 500;
                int K0G = 1924571, K1G = 2438;
                int NLOG = 501;
                int LIM1 = 1074982, LIM2 = 652934;
                int INT1 = 480, INT2 = 520;
                int IA = -186840, IB = 14890670;
                int KONST = 1413601980;

              IAPI = Int( ((Api * 100) + 5) / 10);
              Api = Int(IAPI) / 10            'Supone FLOAT = INT
              'MsgBox "1:API =" & Api

              If Degf < 0 Then GoTo Line1200

              IT = Int(((Degf * 100) + 5) / 10)
              Degf = Int(IT) / 10
              'MsgBox "1:T =" & Degf

              If IAPI < 0 Then GoTo Line1200
              If (IAPI - NBP1) > 0 Then GoTo Line1200
              If (IAPI - IBP1) > 0 Then GoTo Line70
              If (IT - ITMP1) > 0 Then
                  GoTo Line1200
              Else:
                  GoTo Line100
              End If


      }       
    }

    
    /*
    FIN FUNCIONES PERTNECIENTES A MODULO "NUEVA TABLA 5B"
    */
   
}
