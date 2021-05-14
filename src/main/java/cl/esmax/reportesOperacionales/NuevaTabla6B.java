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
public class NuevaTabla6B 
{
    FileWriter archivo;
    
    
    private long NBP1, NBP2, NBP3, NBP4;
    private long IBP1, IBP2;
    private long ITMP1, ITMP2, ITMP3;
    private long IBAS;
    private long IEP1, IEP2, IEP3;
    private long K0F, K1F;
    private long K0J, K1J;
    private long K0T, K1T;
    private long K0G, K1G;

    private double VCFC, VCFP;
    private double IAPI, ITEMP;
    private double IDT;
    private double IFLAG;
    private double K0, K1;
    private double IRHO;
    private double IRES;
    private double IALF, IALF1;
    private double IVCF, JVCF, PVCF, CVCF;    
    
    boolean retornoFuncion = false;
    private double FactorApi;


    double FactorApi(double API60, double Degf, FileWriter archivo) 
    {
        this.archivo = archivo;

        
        try {
            archivo.write("\nFactorApi_INI");
        } catch (IOException ex) {
            Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
        }        

        NBP1 = 370;
        NBP2 = 480;
        NBP3 = 520;
        NBP4 = 850;
        IBP1 = 400;
        IBP2 = 500;
        ITMP1 = 3000;
        ITMP2 = 2500;
        ITMP3 = 2000;
        IBAS = 600;
        IEP1 = 2500;
        IEP2 = 2000;
        IEP3 = 1500;
        K0F = 1038720;
        K1F = 2701;
        K0J = 3303010;
        K1J = 0;
        K0T = 14890670;
        K1T = -186840;
        K0G = 1924571;
        K1G = 2438;

        VCFC = -1;
        VCFP = -1;
        FactorApi = VCFP;

        IAPI = (int)(API60 * 10 + 0.5);
        //MsgBox "1:API60 = " & IAPI
        API60 = (int)IAPI / 10;
        ITEMP = (int)(Degf * 10 + 0.5);
        //MsgBox "1:DEGF = " & ITEMP
        Degf = (int)ITEMP / 10;

        IDT = ITEMP - IBAS;
        IFLAG = -1;

        if ((IAPI) >= 0)
        {
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line20;
            if(!retornoFuncion)
            {
                Line20();
            }              
        }
        
        //Line10:
        //Aqui como Line90 retorna
        //no se ejecuta Line10()
        //=> se comenta
        //Line20:
        //if(!retornoFuncion)
        //{
        //    Line20();
        //}  
        
        //Line100:
        //Aqui como Line90 retorna
        //no se ejecuta Line100()
        //=> se comenta
        //if(!retornoFuncion)
        //{
        //    Line100();
        //}  

         try {           
            archivo.write("\nFactorApi_FIN");
            archivo.write("\nFactorApi=" + FactorApi);
        } catch (IOException ex) {
            Logger.getLogger(Tablas5By6B.class.getName()).log(Level.SEVERE, null, ex);
        } 
         
        return FactorApi;
    }
    
    public void Line10()
    {
         try {           
            archivo.write("\nLine10");
        } catch (IOException ex) {
            Logger.getLogger(Tablas5By6B.class.getName()).log(Level.SEVERE, null, ex);
        }       
        
        //MsgBox "Return10"
        retornoFuncion = true;        
    }
    
    public void Line20()
    {
         try {           
            archivo.write("\nLine20");
        } catch (IOException ex) {
            Logger.getLogger(Tablas5By6B.class.getName()).log(Level.SEVERE, null, ex);
        }   
         
        
        if ((IAPI - NBP1) > 0)
        {
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line40;
            if(!retornoFuncion)
            {
                Line40();
            }            
        }
        K0 = K0F;
        K1 = K1F;
        //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
        //GoTo Line80;
        if(!retornoFuncion)
        {
            Line80();
        }        

        //Line40:
        if(!retornoFuncion)
        {
            Line40();
        }        
    }
    
    public void Line40()
    {
         try {           
            archivo.write("\nLine40");
        } catch (IOException ex) {
            Logger.getLogger(Tablas5By6B.class.getName()).log(Level.SEVERE, null, ex);
        } 
         
        if ((IAPI - NBP2) >= 0)
        {
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line60;
            if(!retornoFuncion)
            {
                Line60();
            }            
        }
        K0 = K0J;
        K1 = K1J;
        //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
        //GoTo Line80;
        if(!retornoFuncion)
        {
            Line80();
        }        

        //Line60:
        if(!retornoFuncion)
        {
            Line60();
        }         
    }
    
    public void Line60()
    {
         try {           
            archivo.write("\nLine60");
        } catch (IOException ex) {
            Logger.getLogger(Tablas5By6B.class.getName()).log(Level.SEVERE, null, ex);
        } 
         
        if ((IAPI - NBP3) > 0)
        {
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line75;
            if(!retornoFuncion)
            {
                Line75();
            }              
        }
        K0 = K0T;
        K1 = K1T;
        //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
        //GoTo Line80;
        if(!retornoFuncion)
        {
            Line80();
        }  
        //Line75:
        if(!retornoFuncion)
        {
            Line75();
        }          
    }
    
    public void Line75()
    {
         try {           
            archivo.write("\nLine75");
        } catch (IOException ex) {
            Logger.getLogger(Tablas5By6B.class.getName()).log(Level.SEVERE, null, ex);
        } 
         
        if ((IAPI - NBP4) > 0)
        {
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line10;
            if(!retornoFuncion)
            {
                Line10();
            }              
        }
        K0 = K0G;
        K1 = K1G;

        //Line80:
        if(!retornoFuncion)
        {
            Line80();
        }          
    }
    
    public void Line80()
    {
         try {           
            archivo.write("\nLine80");
        } catch (IOException ex) {
            Logger.getLogger(Tablas5By6B.class.getName()).log(Level.SEVERE, null, ex);
        } 
         
        if ((ITEMP) >= 0)
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
            Logger.getLogger(Tablas5By6B.class.getName()).log(Level.SEVERE, null, ex);
        } 
         
        //MsgBox "Return90"
        retornoFuncion = true;
    }
    
    public void Line100()
    {
         try {           
            archivo.write("\nLine100");
        } catch (IOException ex) {
            Logger.getLogger(Tablas5By6B.class.getName()).log(Level.SEVERE, null, ex);
        }         
        
        if ((IAPI - IBP1) > 0)
        {
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line120;
            if(!retornoFuncion)
            {
                Line120();
            }                     
        }
        if ((ITEMP - ITMP1) > 0)
        {
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line90;
            if(!retornoFuncion)
            {
                Line90();
            } 
        } 
        else
        {
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line150;
            if(!retornoFuncion)
            {
                Line150();
            } 
        }

        //Line120:
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
            Logger.getLogger(Tablas5By6B.class.getName()).log(Level.SEVERE, null, ex);
        }          
        
        
        if ((IAPI - IBP2) > 0)
        {
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line140;
            if(!retornoFuncion)
            {
                Line140();
            }              
        }
        if ((ITEMP - ITMP2) > 0)
        {
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line90;
            if(!retornoFuncion)
            {
                Line90();
            }              
        } 
        else
        {

            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line150;
            if(!retornoFuncion)
            {
                Line150();
            }              
        }

        //Line140:
        if(!retornoFuncion)
        {
            Line140();
        } 
    }
    
    public void Line140()
    {
          try {           
            archivo.write("\nLine140");
        } catch (IOException ex) {
            Logger.getLogger(Tablas5By6B.class.getName()).log(Level.SEVERE, null, ex);
        }         
        
        if ((ITEMP - ITMP3) > 0)
        {
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line90;
            if(!retornoFuncion)
            {
                Line90();
            }              
        }

        //Line150:
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
            Logger.getLogger(Tablas5By6B.class.getName()).log(Level.SEVERE, null, ex);
        } 
          
          
        IRHO = RHOB(IAPI, archivo);
        //MsgBox "2:RHO = " & IRHO
        //MsgBox "3:K0 = " & K0
        //MsgBox "3:K1 = " & K1
        if (K0 != K0T)
        {
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line155;
            if(!retornoFuncion)
            {
                Line155();
            }             
        }
        IRES = SDIVB(K0, IRHO, archivo);
        //MsgBox "4A:1 = " & IRES
        IRES = IRES * 10;
        IALF1 = SDIVB(IRES, IRHO, archivo);
        IALF1 = ((int)((IALF1 + 5) / 10));
        //MsgBox "4A:2 " & IALF1
        IALF = ((int)((IALF1 + K1 + 5) / 10));
        //MsgBox "4B:ALFA = " & IALF
        //MsgBox "5:DELTA = " & IDT
        //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
        //GoTo Line158;
        if(!retornoFuncion)
        {
            Line158();
        }         

        //Line155:
        if(!retornoFuncion)
        {
            Line155();
        } 
    }
    
    public void Line155()
    {
          try {           
            archivo.write("\nLine155");
        } catch (IOException ex) {
            Logger.getLogger(Tablas5By6B.class.getName()).log(Level.SEVERE, null, ex);
        }         
        
        IALF = ALPHAB(IRHO, K0, K1, archivo);
        //MsgBox "4C:ALFA = " & IALF
        //MsgBox "5:DELTA = " & IDT

        //Line158:
        if(!retornoFuncion)
        {
            Line158();
        }
    }
    
    public void Line158()
    {
          try {           
            archivo.write("\nLine158");
        } catch (IOException ex) {
            Logger.getLogger(Tablas5By6B.class.getName()).log(Level.SEVERE, null, ex);
        } 
          
        IVCF = VCF6B(IALF, IDT, archivo);
        //MsgBox "6B:VCF = " & IVCF
        IFLAG = 0;
        if ((IAPI - IBP1) > 0)
        {
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line170;
            if(!retornoFuncion)
            {
                Line170();
            }                      
        }
        if ((ITEMP - IEP1) <= 0)
        {
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line200;
            if(!retornoFuncion)
            {
                Line200();
            } 
        }

        //Line165:
        if(!retornoFuncion)
        {
            Line165();
        }         
    }
    
    public void Line165()
    {
          try {           
            archivo.write("\nLine165");
        } catch (IOException ex) {
            Logger.getLogger(Tablas5By6B.class.getName()).log(Level.SEVERE, null, ex);
        } 
          
        IFLAG = 1;
        //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
        //GoTo Line200;
        if(!retornoFuncion)
        {
            Line200();
        }  
        
        //Line170:
        if(!retornoFuncion)
        {
            Line170();
        } 
    }
    
    public void Line170()
    {
          try {           
            archivo.write("\nLine170");
        } catch (IOException ex) {
            Logger.getLogger(Tablas5By6B.class.getName()).log(Level.SEVERE, null, ex);
        } 
          
          
        if ((IAPI - IBP2) > 0)
        {
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line190;
            if(!retornoFuncion)
            {
                Line190();
            }                    
        }
        if ((ITEMP - IEP2) > 0)
        {
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line165;
            if(!retornoFuncion)
            {
                Line165();
            }                     
        }
        else
        {
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line200;
            if(!retornoFuncion)
            {
                Line200();
            }                     
        }

        //Line190:
        if(!retornoFuncion)
        {
            Line190();
        }  
    }
    
    public void Line190()
    {
          try {           
            archivo.write("\nLine190");
        } catch (IOException ex) {
            Logger.getLogger(Tablas5By6B.class.getName()).log(Level.SEVERE, null, ex);
        }         
        
        if ((ITEMP - IEP3) > 0)
        {
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line165;
            if(!retornoFuncion)
            {
                Line165();
            }                          
        }

        //Line200:
        if(!retornoFuncion)
        {
            Line200();
        }  
    }
    
    
    public void Line200()
    {
          try {           
            archivo.write("\nLine200");
        } catch (IOException ex) {
            Logger.getLogger(Tablas5By6B.class.getName()).log(Level.SEVERE, null, ex);
        }  
          
        JVCF =  (int)
                (
                    ( 
                        (int)(IVCF / 1000)
                        + 5
                    ) 
                    / 10
                );

        PVCF = JVCF;
        PVCF = PVCF / 10000;
        if ((IVCF - 100000000) >= 0)
        {
            //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
            //GoTo Line220;
            if(!retornoFuncion)
            {
                Line220();
            }            
        }

        JVCF =  (int)
                (
                    ( 
                        (int)(IVCF / 100)
                        + 5
                    ) 
                    / 10
                );
        
        CVCF = JVCF;
        CVCF = CVCF / 100000;
        
        //VB TO JAVA CONVERTER TODO TASK: There is no 'GoTo' in Java:
        //GoTo Line250;
        if(!retornoFuncion)
        {
            Line250();
        } 
        
        //Line220:
        if(!retornoFuncion)
        {
            Line220();
        } 

        //Line250:
        if(!retornoFuncion)
        {
            Line250();
        }          
    }
    
    public void Line250()
    {
          try {           
            archivo.write("\nLine250");
        } catch (IOException ex) {
            Logger.getLogger(Tablas5By6B.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        VCFP = PVCF;
        VCFC = CVCF;
        FactorApi = VCFP;
        retornoFuncion = true;
        //MsgBox "RETURN250"        
    }
    
    public void Line220()
    {
          try {           
            archivo.write("\nLine220");
        } catch (IOException ex) {
            Logger.getLogger(Tablas5By6B.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        CVCF = PVCF;       
    }
    
    public double VCF6B(double AAA, double BBB, FileWriter archivo)
    {
        double ITERM1, ITERM2, ITERM3, ITERM4;
        double IX;
        double ISUM1, ISUM2, ISUM3;
        double ISUM4, ISUM5, ISUM6;
        ITERM1 = AAA * BBB;
        //'MsgBox "6A:1 = " & ITERM1
        ITERM2 = ((int)(ITERM1 / 5)) * 4;
        //'MsgBox "6A:2 = " & ITERM2
        ITERM3 = MPYB(ITERM1, ITERM2, archivo);
        //'MsgBox "6A:3 = " & ITERM3
        IX = -(ITERM1 + ITERM3);
        //'MsgBox "6A:4 = " & IX
        ISUM1 = 100000000 + IX;
        ISUM2 = MPYB(IX, IX, archivo);
        ISUM2 = (int)(ISUM2 / 2);
        ISUM3 = MPYB(IX, ISUM2, archivo);
        ISUM3 = (int)(ISUM3 / 3);
        ISUM4 = MPYB(IX, ISUM3, archivo);
        ISUM4 = (int)(ISUM4 / 4);
        ISUM5 = MPYB(IX, ISUM4, archivo);
        ISUM5 = (int)(ISUM5 / 5);
        ISUM6 = MPYB(IX, ISUM5, archivo);
        ISUM6 = (int)(ISUM6 / 6);
        double VCF6B = ISUM1 + ISUM2 + ISUM3 + ISUM4 + ISUM5 + ISUM6;
        
                try {
                    archivo.write("\n");
                    archivo.write
                                (
                                    ((Double)
                                        (
                                            VCF6B
                                        )).toString()
                                );
                } catch (IOException ex) {
                    Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
                }

        
        return VCF6B;
    }   
    
    public double MPYB(double AAA, double BBB, FileWriter archivo)
    {
        double IU1, IU2;
        double K1, K2, K3;
        double IV1, IV2;

        IU1 = (int)(AAA / 10000);
        //'MsgBox "IU1=" & IU1
        K1 = 10000 * IU1;
        IV1 = AAA - K1;
        IU2 = (int)(BBB / 10000);
        //'MsgBox "IU2=" & IU2
        K2 = 10000 * IU2;
        IV2 = BBB - K2;
        K3 = IU1 * IV2 + IU2 * IV1 + (int)(IV1 * IV2 / 10000);
        //'MsgBox "K3= " & K3
        double MPYB = ((int)((K3 + 5000) / 10000)) + IU1 * IU2;
        
                try {
                    archivo.write("\n");
                    archivo.write
                                (
                                    ((Double)
                                        (
                                            MPYB
                                        )).toString()
                                );
                } catch (IOException ex) {
                    Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
                }
                
        return MPYB;
    }
    
    double ALPHAB(double AAA, double BBB, double CCC, FileWriter archivo)
    {
        double INUM;
        double IALF1, IALF2, IALFS;

        INUM = CCC * 10000;
        IALF1 = SDIVB(INUM, AAA, archivo);
        INUM = BBB * 100;
        IALFS = SDIVB(INUM, AAA, archivo);
        IALF2 = SDIVB(IALFS, AAA, archivo);
        //'MsgBox "4A:1 = " & IALFS
        //'MsgBox "4A:2 = " & IALF2
        //'MsgBox "4B:1 = " & IALF1
        double ALPHAB = ((int)((IALF1 + IALF2 + 500) / 1000));
        
                try {
                    archivo.write("\n");
                    archivo.write
                                (
                                    ((Double)
                                        (
                                            ALPHAB
                                        )).toString()
                                );
                } catch (IOException ex) {
                    Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
                }  
                
                
        return ALPHAB;
    }
    
    public double SDIVB(double AAA, double BBB, FileWriter archivo)
    {
        double IRES1;
        double IRES2;

        IRES1 = (int)(AAA / BBB);
        IRES2 = (int)((AAA - IRES1 * BBB) * 10000 / BBB);
        
                try {
                    archivo.write("\n");
                    archivo.write
                                (
                                    ((Double)
                                        (
                                            IRES1 * 10000 + IRES2
                                        )).toString()
                                );
                } catch (IOException ex) {
                    Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
                }       
        
        return IRES1 * 10000 + IRES2;
    }
    
    public double RHOB(double AAA, FileWriter archivo)
    {
        double IDENOM;
        IDENOM = AAA + 1315;
        int tmp = (int)(1413601980 / IDENOM);
        int RHOB = (int)((tmp + 5) / 10);
        
                try {
                    archivo.write("\n");
//                    archivo.write(((Double)AAA).toString());
//                    archivo.write("\n");
//                    archivo.write(((Double)IDENOM).toString());
//                    archivo.write("\n");
                    archivo.write
                                (
                                    ((Integer)
                                        (
                                            RHOB
                                        )).toString()
                                );
                } catch (IOException ex) {
                    Logger.getLogger(NuevaTabla5B.class.getName()).log(Level.SEVERE, null, ex);
                }         
        
        return RHOB;
    }
}
