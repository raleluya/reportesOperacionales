package jbr.springmvc.controller;

import cl.esmax.reportesOperacionales.NuevaTabla5B;
import cl.esmax.reportesOperacionales.Otras;
import cl.esmax.reportesOperacionales.T13;
import cl.esmax.reportesOperacionales.Tablas5By6B;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;
import jbr.springmvc.service.UserService;

@Controller
public class LoginController {
    

  @Autowired
  UserService userService;

  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("login");
    mav.addObject("login", new Login());

    return mav;
  }

  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
      @ModelAttribute("login") Login login) 
  {
    ModelAndView mav = null;

//    User user = userService.validateUser(login);

 //   if (null != user) 
 //   {
      mav = new ModelAndView("welcome");
      mav.addObject("firstname", "ESMAX");
      
      /*
       * APIOBS_AfterUpdate()
       * 
            Me!API60 = Api60IntPol(Me!APIOBS, Me!TEMPOBS)
            Me!FACTOR = FactIntPol(Me!API60, Me!TEMPINT)
            Me!VOL60 = Round(Me!VOL * Me!FACTOR, 0)
            Me!FACTOR13 = IFACTOR13(Me!API60)
            Me!KILOS = Round(Me!VOL60 * Me!FACTOR13, 0)      
      */
      
/**
 *  se comenta esto solo x motivo de seguimiento INICIO
 * 
 */      
//      {
//        Tablas5By6B tablas5By6B = new Tablas5By6B();
//        double API60  = tablas5By6B.Api60IntPol(60.0d, 60.0d);        
//        double FACTOR = tablas5By6B.FactIntPol(API60, 60.0d);
//
//        double VOL = 0;
//        //double FACTOR = 0;//
//        double VOL60 = Otras.round(VOL * FACTOR, 0);
//
//        T13 t13 = new T13();
//        double FACTOR13 = t13.FACTOR13(API60);
//        double KILOS = Otras.round(VOL60 * FACTOR13, 0);
//      }
/**
 *  se comenta esto solo x motivo de seguimiento FIN
 * 
 */      

/*
    Private Sub TEMPOBS_AfterUpdate()
        Me!API60 = Api60IntPol(Me!APIOBS, Me!TEMPOBS)
        Me!FACTOR = FactIntPol(Me!API60, Me!TEMPINT)
        Me!VOL60 = Round(Me!VOL * Me!FACTOR, 0)
        Me!FACTOR13 = IFACTOR13(Me!API60)
        Me!KILOS = Round(Me!VOL60 * Me!FACTOR13, 0)
    End Sub
      */

    
        
//    } 
//    else 
//    {
//      mav = new ModelAndView("login");
//      mav.addObject("message", "Username or Password is wrong!!");
//    }


        FileWriter myWriter = null;
        try 
        {
            myWriter = new FileWriter("c:\\tmp\\filename_java.txt");
            myWriter.write
                            (
                                                        "ApiObs\t" + 
                                                        "TempObs\t" + 
                                                        "TempInt\t" + 
                                                        "Vol\t" + 
                                                        "API60\t" + 
                                                        "Factor\t" + 
                                                        "Vol60\t" + 
                                                        "Factor13\t" + 
                                                        "Kilos\n"
                            );
           
/*
            'Me!API60 = Api60IntPol(Me!APIOBS, Me!TEMPOBS)
            'Me!FACTOR = FactIntPol(Me!API60, Me!TEMPINT)
            'Me!VOL60 = Round(Me!VOL * Me!FACTOR, 0)
            'Me!FACTOR13 = IFACTOR13(Me!API60)
            'Me!KILOS = Round(Me!VOL60 * Me!FACTOR13, 0)
    */
            double API60Test, FactorTest, Vol60Test, Factor13Test, KilosTest;

            double ApiObsTest;
            for(ApiObsTest = 60; ApiObsTest <= 200; ApiObsTest=ApiObsTest+10)
            {
                double TempObsTest;
                for(TempObsTest = 60; TempObsTest <= 200; TempObsTest=TempObsTest+10)
                {
                    Tablas5By6B tablas5By6B = new Tablas5By6B();
                    API60Test  = tablas5By6B.Api60IntPol(ApiObsTest, TempObsTest, myWriter); 

                    double TempIntTest;
                    for(TempIntTest = 60; TempIntTest <= 200; TempIntTest=TempIntTest+10)
                    {
                        //API60Test = Api60IntPol(ApiObsTest, TempObsTest)
                        //Dim TempIntTest As Double
                        //For TempIntTest = 60 To 200 Step 10
                        //FactorTest = FactIntPol(API60Test, TempIntTest)
                        FactorTest = tablas5By6B.FactIntPol(API60Test, TempIntTest, myWriter); 
                        //Dim VolTest As Double
                        //For VolTest = 0 To 1000 Step 100
                        double VolTest;
                        for(VolTest = 0; VolTest <= 1000; VolTest = VolTest + 100)
                        {
                            //Vol60Test = Round(VolTest * FactorTest, 0)
                            Vol60Test = Otras.round(VolTest * FactorTest, 0, myWriter);
                            //Factor13Test = IFACTOR13(API60Test)
                            T13 t13 = new T13();
                            Factor13Test = t13.FACTOR13(API60Test);
                            //KilosTest = Round(Vol60Test * Factor13Test, 0)
                            KilosTest = Otras.round(Vol60Test * Factor13Test, 0, myWriter);
                            try 
                            {
                                //Print #intFile, ApiObsTest & vbTab & TempObsTest & vbTab & API60Test & vbTab & TempIntTest & vbTab & FactorTest & vbTab & VolTest & vbTab & Vol60Test & vbTab & Factor13Test & vbTab & KilosTest
                                myWriter.write
                                                (
                                                        "\n\t" + ApiObsTest  + 
                                                        "\t" + TempObsTest + 
                                                        "\t" + TempIntTest + 
                                                        "\t" + VolTest + 
                                                        "\t" + API60Test + 
                                                        "\t" + FactorTest + 
                                                        "\t" + Vol60Test + 
                                                        "\t" + Factor13Test + 
                                                        "\t" + KilosTest
                                                );
                            } 
                            catch (IOException ex) 
                            {
                                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                    }
                }
            }


      //Close #intFile
      myWriter.close();
      
       } catch (IOException ex) 
        {
          Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }





    //AQUI COMINZA GIANNI
    return mav;
  }

}
