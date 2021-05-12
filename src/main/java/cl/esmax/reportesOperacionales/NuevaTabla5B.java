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
public class NuevaTabla5B 
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

    double IAPI;
    double IT;
    int IFLAG;
    double IDT;
    double IRD;
    double IH1, IH2;
    double IHYC;

    double IDENOM, IRHO;

    double IRHOT, JRHOT;
    double ICOUNT;
    double K0, K1;
    double IREG;
    double IRHO60;
    double KRHO, NP;
    double IALF;
    double IVCF;
    double IRES, IRES2;
    double KSAV;
    double IAPI60;  
    
    
    double API60;                           //INVENTADO   
    boolean retornoFuncion = false;         //INVENTADO
      
    FileWriter archivo;                     //Inventado para seguimiento
    
    public double API60(double Api, double Degf, FileWriter archivo)
    {
        this.archivo = archivo;
        
        try {
            archivo.write("API60_INI\n");
        } catch (IOException ex) {
            Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
        }

        IHydro = 0;
        IBASE = 600;
        NBP1 = 850;
        IBP1 = 400;
        IBP2 = 500;
        ITMP1 = 3000;
        ITMP2 = 2500;
        ITMP3 = 2000;
        IEP1 = 2500;
        IEP2 = 2000;
        IEP3 = 1500;
        K0F = 1038720;
        K1F = 2701;
        NHIF = 370;
        K0J = 3303010;
        K1J = 0;
        NLOJ = 371;
        NHIJ = 500;
        K0G = 1924571;
        K1G = 2438;
        NLOG = 501;
        LIM1 = 1074982;
        LIM2 = 652934;
        INT1 = 480;
        INT2 = 520;
        IA = -186840;
        IB = 14890670;
        KONST = 1413601980;

        IAPI = (int)(((Api * 100) + 5) / 10);
        Api = ((int)(IAPI)) / 10.0; //Supone FLOAT = INT
        //MsgBox "1:API =" & Api

                if (Degf < 0)
                {
                    try {
                        archivo.write("\nDegf < 0");
                        //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                        //Line1200:
                        if(!retornoFuncion)
                        {
                            Line1200();
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                IT = (int)(((Degf * 100) + 5) / 10);
                Degf = ((int)(IT)) / 10;
                //MsgBox "1:T =" & Degf

                if (IAPI < 0)
                {
                    try {
                        archivo.write("\nIAPI < 0");
                        //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                        //GoTo Line1200;
                        if(!retornoFuncion)
                        {
                            Line1200();
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if ((IAPI - NBP1) > 0)
                {
                            try {                    
                                archivo.write("\n(IAPI - NBP1) > 0");
                            } catch (IOException ex) {
                                Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                    //GoTo Line1200;
                    if(!retornoFuncion)
                    {
                        Line1200();
                    } 
                }
                if ((IAPI - IBP1) > 0)
                {
                        try {
                            archivo.write("\n(IAPI - IBP1) > 0");
                            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                            //GoTo Line70;
                            if(!retornoFuncion)
                            {
                                Line70();                        
                            }
                        } catch (IOException ex) {
                            Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
                if ((IT - ITMP1) > 0)
                {
                            try {                    
                                archivo.write("\n(IT - ITMP1) > 0");
                            } catch (IOException ex) {
                                Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                    //GoTo Line1200;
                    if(!retornoFuncion)
                    {
                        Line1200();
                    }                            
                }
                else
                {

                    //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                    //GoTo Line100;
                    if(!retornoFuncion)
                    {
                        Line100();
                    }                             
                }

        //Line70:
         if(!retornoFuncion)
        {
            Line70();
        }    

        try {        
            archivo.write("\nAPI60=" + API60);
        } catch (IOException ex) {
            Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
        }        

            return API60;
        }

    public void Line70()
    {
        try {        
            archivo.write("\nLine70");
        } catch (IOException ex) {
            Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if ((IAPI - IBP2) > 0)
        {
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line90;
            if(!retornoFuncion)
            {
                Line90();
            }                              
        }
        if ((IT - ITMP2) > 0)
        {
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line1200;
            if(!retornoFuncion)
            {
                Line1200();
            }  
        }
        else
        {

            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line100;
            if(!retornoFuncion)
            {
                Line100();
            }                              
        }

        //Line90:
        if(!retornoFuncion)
        {
            Line90();
        }
    }

    public void Line90()
    {
        try {        
            archivo.write("\nLine90");
        } catch (IOException ex) {
            Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if ((IT - ITMP3) > 0)
        {
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line1200;
            if(!retornoFuncion)
            {
                Line1200();
            }                             
        }
        else
        {
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line100;
            if(!retornoFuncion)
            {
                Line100();
            }                              
        }

        //Line100:
        if(!retornoFuncion)
        {
            Line100();
        }
    }

    public void Line100()
    {
        try {        
            archivo.write("\nLine100");
        } catch (IOException ex) {
            Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        IFLAG = 0;
        IDT = IT - IBASE;
        //MsgBox "2:DELTA = " & IDT
        IRHOT = RHO5B(IAPI);

        if (IHydro > 0)
        {
           //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
           //GoTo Line111;
           if(!retornoFuncion)
           {
               Line111();
           }                        
        }
        IRD = 50;
        //If IDT >= 0 Then GoTo Line110
        //IRD = -50

        //Line110:
        if(!retornoFuncion)
        {
           Line110();
        }           
    }

    public void Line110()
    {
        try {        
            archivo.write("\nLine110");
        } catch (IOException ex) {
            Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        IH1 = (int)((127800 * IDT + IRD) / 100);
        //MsgBox "3:TERM1 = " & IH1
        IH2 = (int)((62 * IDT * IDT + 500) / 1000);
        //MsgBox "3:TERM2 = " & IH2
        IHYC = 1000000000 - IH1 - IH2;
        //MsgBox "3:HYC = " & IHYC
        IRHO = IRHOT * 10;
        //MsgBox "4:RHO = " & IRHO
        IRHOT = MPY5B(IRHO, IHYC, 10000);
        IRHOT = (int)((IRHOT + 50) / 100);
        //MsgBox "5a:RHOT = " & IRHOT

        //    Line111:
        if(!retornoFuncion)
        {
            Line111();
        }
    }

    public void Line111()
    {
        try {        
            archivo.write("\nLine111");
        } catch (IOException ex) {
            Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        JRHOT = IRHOT * 10000;
        ICOUNT = 0;
        if ((IAPI - NHIF) > 0)
        {
           //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
           //GoTo Line120;
           if(!retornoFuncion)
           {
               Line120();
           }                             
        }
        //Line115:
        if(!retornoFuncion)
        {
            Line115();
        }        
    }

    public void Line115()
    {
        try {        
            archivo.write("\nLine115");
        } catch (IOException ex) {
            Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        K0 = K0F;
        K1 = K1F;
        IREG = 0;
        //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
        //GoTo Line150;
        if(!retornoFuncion)
        {
            Line150();
        }                     

        if(!retornoFuncion)
        {
            Line120();
        }          
    }
    
    public void Line120()
    {
        try {        
            archivo.write("\nLine120");
        } catch (IOException ex) {
            Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            if ((IAPI - NHIJ) > 0)
            {
                //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                if(!retornoFuncion)
                {
                    Line130();
                }  
            }
            
           if(!retornoFuncion)
            {
                Line125();
            }        
    }
    
    public void Line125()
    {
        try {        
            archivo.write("\nLine125");
        } catch (IOException ex) {
            Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
            K0 = K0J;
            K1 = K1J;
            IREG = 1;
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            if(!retornoFuncion)
            {
                Line150();
            }

            if(!retornoFuncion)
            {
                Line130();
            }
    }
        
    public void Line130()
    {
        
        try {        
            archivo.write("\nLine130");
        } catch (IOException ex) {
            Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        K0 = K0G;
        K1 = K1G;
        IREG = 2;

        if(!retornoFuncion)
        {
            Line150();
        }
    }
        


        public void Line150()
        {
            try {        
                archivo.write("\nLine150");
            } catch (IOException ex) {
                Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
            }         
            
            ICOUNT = ICOUNT + 1;
            if ((ICOUNT - 2) > 0)
            {
                //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                if(!retornoFuncion)
                {
                    Line400();
                }
            }
            IRHO60 = IRHOT;
            //MsgBox "5B:RHO60 = " & IRHO60
            //MsgBox "6A:K0 = " & K0
            //MsgBox "6A:K1 = " & K1
            KRHO = 0;
            NP = 0;

            if(!retornoFuncion)
            {
                Line300();
            }
        }
        
        public void Line300()
        {
            try {        
                archivo.write("\nLine300");
            } catch (IOException ex) {
                Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
            NP = NP + 1;
            IALF = ALF5B(IRHO60, K0, K1);
            //MsgBox "6A:ALPHA = " & IALF
            IVCF = VCF5B(IALF, IDT);
            IVCF = (int)((IVCF + 50) / 100);
            //MsgBox "7:VCF = " & IVCF
            IRHO60 = DIV5B(JRHOT, IVCF, 1000);
            //MsgBox "8:RHO60 = " & IRHO60
            if ((Math.abs(IRHO60 - KRHO) - 50) < 0)
            {
                //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                if(!retornoFuncion)
                {
                    Line500();
                }
            }
            KRHO = IRHO60;
            IRHO60 = (int)((IRHO60 + 5) / 10);
            //MsgBox "5B:RHO60 = " & IRHO60
            if ((NP - 20) < 0)
            {
                //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                if(!retornoFuncion)
                {
                    Line300();
                }
            }
            else
            {
                //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                if(!retornoFuncion)
                {
                    Line1150();
                }  
            }

        if(!retornoFuncion)
        {
            Line400();
        }  
        }
        
        public void Line400()
        {
            try {        
                archivo.write("\nLine400");
            } catch (IOException ex) {
                Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
            KRHO = 0;
            NP = 0;
            ICOUNT = 3;
            IRHO60 = 77884;
            //MsgBox "5B:RHO60 = " & IRHO60

            if(!retornoFuncion)
            {
                Line440();
            }            
        }
        
        public void Line440()
        {
            try {        
                archivo.write("\nLine440");
            } catch (IOException ex) {
                Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
            } 

            NP = NP + 1;
            IRES = DIV5B(IB, IRHO60, 10000);
            IRES = IRES * 10;
            //MsgBox "6B:TERM1 = " & IRES
            IRES2 = DIV5B(IRES, IRHO60, 10000);
            IRES2 = (int)((IRES2 + 5) / 10);
            //MsgBox "6B:TERM2 = " & IRES2
            IALF = (int)((IA + IRES2 + 5) / 10);
            //MsgBox "6B:ALPHA = " & IALF
            IVCF = VCF5B(IALF, IDT);
            IVCF = (int)((IVCF + 50) / 100);
            //MsgBox "7:VCF = " & IVCF
            IRHO60 = DIV5B(JRHOT, IVCF, 1000);
            //MsgBox "8:RHO60 = " & IRHO60
            if ((Math.abs(IRHO60 - KRHO) - 70) < 0)
            {
                //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                if(!retornoFuncion)
                {
                   Line500();
                } 
            }
            KSAV = KRHO;
            KRHO = IRHO60;
            IRHO60 = (int)((IRHO60 + 5) / 10);
            //MsgBox "8:RHO60 = " & IRHO60
            if ((NP - 40) < 0)
            {
                //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                //GoTo Line440;
                if(!retornoFuncion)
                {
                    Line440();
                }                 
            }

            IRHO60 = (int)((KRHO + KSAV) / 2);

            if(!retornoFuncion)
            {
               Line500();
            }             
        }
        
        public void Line500()
        {
            try {        
                archivo.write("\nLine500");
            } catch (IOException ex) {
                Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
            if ((IRHO60 - LIM1) > 0)
            {
                //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                if(!retornoFuncion)
                {
                   Line1200();
                } 
            }
            if ((IRHO60 - LIM2) < 0)
            {
                //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                if(!retornoFuncion)
                {
                   Line1200();
                } 
            }
            IRHO60 = (int)((IRHO60 + 5) / 10);
            //MsgBox "F:RHO60 = " & IRHO60
            IAPI60 = (int)(KONST / IRHO60) - 13150;
            IAPI60 = (int)((IAPI60 + 5) / 10);
            //MsgBox "F:API60 = " & IAPI60
            API60 = ((int)IAPI60) / 10;

            if ((ICOUNT - 3) >= 0)
            {
                //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                if(!retornoFuncion)
                {
                   Line720();
                } 
            }
            if ((IREG - 1) > 0)
            {
                //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                if(!retornoFuncion)
                {
                   Line640();
                } 
            }
            if ((IREG - 1) == 0)
            {
                //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                if(!retornoFuncion)
                {
                   Line620();
                }                    }
            if ((IAPI60 - NHIF) > 0)
            {
                //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                //GoTo Line125;
                if(!retornoFuncion)
                {
                    Line125();
                }                 
            }
            else
            {
                //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                if(!retornoFuncion)
                {
                   Line680();
                }
            }

        if(!retornoFuncion)
        {
           Line620();
        }            
        }
        
        public void Line620()
        {
            try {        
                archivo.write("\nLine620");
            } catch (IOException ex) {
                Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
            }             
            
            if ((IAPI60 - NHIJ) == 0)
            {
                //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                if(!retornoFuncion)
                {
                   Line680();
                }
            }
            if ((IAPI60 - NHIJ) > 0)
            {
                //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                //GoTo Line130;
                if(!retornoFuncion)
                {
                    Line130();
                }                 
            }
            if ((IAPI60 - NLOJ) < 0)
            {
                //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                //GoTo Line115;
                if(!retornoFuncion)
                {
                    Line115();
                } 
            }
            else
            {

                //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                if(!retornoFuncion)
                {
                   Line680();
                } 
            }

        if(!retornoFuncion)
        {
           Line640();
        }             
        }
        
        public void Line640()
        {
            try {        
                archivo.write("\nLine640");
            } catch (IOException ex) {
                Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
            }               
            
            
                if ((IAPI60 - NLOG) < 0)
                {
                    //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                    //GoTo Line125;
                    if(!retornoFuncion)
                    {
                        Line125();
                    }                     
                }

                if(!retornoFuncion)
                {
                   Line680();
                }              
        }
        
        public void Line680()
        {
            try {        
                archivo.write("\nLine680");
            } catch (IOException ex) {
                Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
            }  

            if ((IAPI60 - INT1) < 0)
            {
                //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                if(!retornoFuncion)
                {
                   Line720();
                }
            }
            if ((IAPI60 - INT1) == 0)
            {
                //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                //GoTo Line400;
                if(!retornoFuncion)
                {
                    Line400();
                }                 
            }

            if ((IAPI60 - INT2) <= 0)
            {
                //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                //GoTo Line400;
                if(!retornoFuncion)
                {
                    Line400();
                }                 
            }

            if(!retornoFuncion)
            {
                Line720();
            }            
        }
        
        public void Line720()
        {
            try {        
                archivo.write("\nLine720");
            } catch (IOException ex) {
                Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
            }              
            
            if ((IAPI - IBP1) > 0)
           {
               //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                if(!retornoFuncion)
               {
                   Line790();
               }
           }

           if ((IT - IEP1) > 0)
           {
               //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
               if(!retornoFuncion)
               {
                   Line830();
               }
           }
           else
           {

               //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
               if(!retornoFuncion)
               {
                   Line820();
               }
           }

       if(!retornoFuncion)
       {
           Line790();
       }           
        }
        
        public void Line790()
        {
            try {        
                archivo.write("\nLine790");
            } catch (IOException ex) {
                Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
            }                
            
            //Line790:
            if ((IAPI - IBP2) > 0)
            {
                //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                if(!retornoFuncion)
                {
                    Line810();
                }
            }

            if ((IT - IEP2) > 0)
            {
                //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                if(!retornoFuncion)
                {
                    Line830();
                }
            }
            else
            {

                //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
                if(!retornoFuncion)
                {
                    Line820();
                }
            }

        if(!retornoFuncion)
        {
            Line810();
        }

        if(!retornoFuncion)
        {
            Line820();
        }

        if(!retornoFuncion)
        {
            Line830();
        }

        if(!retornoFuncion)
        {
            Line1150();
        }

        if(!retornoFuncion)
        {
            Line1200();
        }            
    }
        
    public void Line810()
    {
        try {        
            archivo.write("\nLine810");
        } catch (IOException ex) {
            Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        if ((IT - IEP3) > 0)
        {
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            Line830();
        }
    }  

    public void Line820()
    {
        try {        
            archivo.write("\nLine820");
        } catch (IOException ex) {
            Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //MsgBox "RETURN820"
        //return ;
        retornoFuncion = true;                 
    }  

    public void Line830()
    {
        try {        
            archivo.write("\nLine830");
        } catch (IOException ex) {
            Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        IFLAG = 1;
        //MsgBox "RETURN830"
        //return ;
        retornoFuncion = true;     
    }  

    public void Line1150()
    {
        try {        
            archivo.write("\nLine1150");
        } catch (IOException ex) {
            Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        //MsgBox "RETURN1200"
        retornoFuncion = true;            
    }  

     public void Line1200()
    {
        try {        
            archivo.write("\nLine1200");
        } catch (IOException ex) {
            Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        IFLAG = -1;
        API60 = -99.9;       
        //MsgBox "RETURN1200"
        retornoFuncion = true;
    }
        
      
        
        public int RHO5B(double AAA)
        {
                IDENOM = AAA + 1315;
                //IDENOM = AAA + 1315
                //RHO5B = Int((Int(1413601980 / IDENOM) + 5) / 10)
                int x = (int)(1413601980 / IDENOM);
                return (int)((x + 5) / 10);
        }

        public final double MPY5B(double IX, double IY, double ISCALE)
        {
                double IU1 = 0;
                double IU2 = 0;
                double IV1 = 0;
                double IV2 = 0;
                double K1 = 0;
                double K2 = 0;
                double K3 = 0;
                IU1 = (int)(IX / ISCALE);
                K1 = (int)(ISCALE * IU1);
                IV1 = IX - K1;
                IU2 = (int)(IY / ISCALE);
                K2 = (int)(ISCALE * IU2);
                IV2 = IY - K2;
                K3 = (int)(IU1 * IV2) + (int)(IU2 * IV1) + (int)(IV1 * IV2 / ISCALE);
                return (int)((K3 + (int)(ISCALE / 2)) / ISCALE) + IU1 * IU2;

        }

        public final double ALF5B(double AAA, double BBB, double CCC)
        {
                double INUM = 0;
                double IALF1 = 0;
                double IALFS = 0;
                double IALF2 = 0;

                INUM = CCC * 10000;
                IALF1 = DIV5B(INUM, AAA, 10000);
                //MsgBox "6A:TERM3 = " & IALF1
                INUM = BBB * 100;
                IALFS = DIV5B(INUM, AAA, 10000);
                //MsgBox "6A:TERM1 = " & IALFS
                IALF2 = DIV5B(IALFS, AAA, 10000);
                //MsgBox "6A:TERM2 = " & IALF2
                return (int)((IALF1 + IALF2 + 500) / 1000);
        }
        public final double DIV5B(double AAA, double BBB, double CCC)
        {
                double IRES1 = 0;
                double IRES2 = 0;

                IRES1 = (int)(AAA / BBB);
                IRES2 = (int)((AAA - IRES1 * BBB) * CCC / BBB);
                return IRES1 * CCC + IRES2;
        }
        public final double VCF5B(double AAA, double BBB)
        {
                double ITERM1 = 0;
                double ITERM2 = 0;
                double ITERM3 = 0;
                double IX = 0;
                double ISUM1 = 0;
                double ISUM2 = 0;
                double ISUM3 = 0;
                double ISUM4 = 0;
                double ISUM5 = 0;
                double ISUM6 = 0;

                ITERM1 = AAA * BBB;
                //MsgBox "7:TERM1 = " & ITERM1
                ITERM2 = (int)(ITERM1 / 5) * 40;
                //MsgBox "7:TERM2 = " & ITERM2
                ITERM3 = MPY5B(ITERM1, ITERM2, 1000);
                ITERM3 = (int)((ITERM3 + 500) / 1000);
                //MsgBox "7:TERM3 = " & ITERM3

                IX = -ITERM1 - ITERM3;
                //MsgBox "7:TERM4 = " & IX
                ISUM1 = 100000000 + IX;
                ISUM2 = MPY5B(IX, IX, 1000);
                ISUM2 = ((int)((int)(((ISUM2 + 50) / 100)) / 2));
                ISUM3 = MPY5B(IX, ISUM2, 1000);
//                ISUM3 = (int)(int)((double)((int)(((ISUM3 + 50) / 100)) / 3));
                ISUM3 = ((int)((int)(((ISUM3 + 50) / 100)) / 3));
                ISUM4 = MPY5B(IX, ISUM3, 1000);
//                ISUM4 = (int)(int)((double)((int)(((ISUM4 + 50) / 100)) / 4));
                ISUM4 = ((int)((int)(((ISUM4 + 50) / 100)) / 4));
                ISUM5 = MPY5B(IX, ISUM4, 1000);
//                ISUM5 = (int)(int)((double)((int)(((ISUM5 + 50) / 100)) / 5));
                ISUM5 = ((int)((int)(((ISUM5 + 50) / 100)) / 5));
                ISUM6 = MPY5B(IX, ISUM5, 1000);
//                ISUM6 = (int)(int)((double)((int)(((ISUM6 + 50) / 100)) / 6));
                ISUM6 = ((int)((int)(((ISUM6 + 50) / 100)) / 6));
                return ISUM1 + ISUM2 + ISUM3 + ISUM4 + ISUM5 + ISUM6;
        }        
}