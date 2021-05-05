package jbr.springmvc.controller;

import cl.esmax.reportesOperacionales.NuevaTabla5B;
import cl.esmax.reportesOperacionales.Otras;
import cl.esmax.reportesOperacionales.T13;
import cl.esmax.reportesOperacionales.Tablas5By6B;
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
      {
        NuevaTabla5B tablas5B = new NuevaTabla5B();
        double API60  = tablas5B.API60(60.0d, 60.0d);
        Tablas5By6B tablas5By6B = new Tablas5By6B();
        double FACTOR = tablas5By6B.FactIntPol(API60, 60.0d);

        double VOL = 0;
        //double FACTOR = 0;//
        double VOL60 = Otras.round(VOL * FACTOR, 0);

        T13 t13 = new T13();
        double FACTOR13 = t13.FACTOR13(API60);
        double KILOS = Otras.round(VOL60 * FACTOR13, 0);
      }
      /*
    Private Sub TEMPOBS_AfterUpdate()
        Me!API60 = Api60IntPol(Me!APIOBS, Me!TEMPOBS)
        Me!FACTOR = FactIntPol(Me!API60, Me!TEMPINT)
        Me!VOL60 = Round(Me!VOL * Me!FACTOR, 0)
        Me!FACTOR13 = IFACTOR13(Me!API60)
        Me!KILOS = Round(Me!VOL60 * Me!FACTOR13, 0)
    End Sub
      */
      {
        NuevaTabla5B tablas5B = new NuevaTabla5B();
        double API60  = tablas5B.API60(60.0d, 60.0d);
        Tablas5By6B tablas5By6B = new Tablas5By6B();
        double FACTOR = tablas5By6B.FactIntPol(API60, 60.0d);      
      }
      
    /*
      
        Private Sub API60_AfterUpdate()
            Me!FACTOR = FactIntPol(Me!API60, Me!TEMPINT)
            Me!VOL60 = Round(Me!VOL * Me!FACTOR, 0)
            Me!FACTOR13 = IFACTOR13(Me!API60)
            Me!KILOS = Round(Me!VOL60 * Me!FACTOR13, 0)
        End Sub      
      
        Private Sub FACTOR_AfterUpdate()
            Me!VOL60 = Round(Me!VOL * Me!FACTOR, 0)
        End Sub
 
        Private Sub FACTOR13_AfterUpdate()
            Me!KILOS = Round(Me!VOL60 * Me!FACTOR13, 0)
        End Sub     
      
        
      
      */      
    
    /*
        Private Sub TEMPINT_AfterUpdate()
            Me!FACTOR = FactIntPol(Me!API60, Me!TEMPINT)
            Me!VOL60 = Round(Me!VOL * Me!FACTOR, 0)
        End Sub    
    
    */
        /*      
        Private Sub TK_AfterUpdate()
            If Me!TK = 841976 Then
                DoCmd.OpenForm "FOR ME"
                Exit Sub
            End If
            Me!VOL = VOLTK(Me!ALT, Me!TK)
            Me!VOL60 = Round(Me!VOL * Me!FACTOR, 0)
            Me!KILOS = Round(Me!VOL60 * Me!FACTOR13, 0)
        End Sub
        */        
        
//    } 
//    else 
//    {
//      mav = new ModelAndView("login");
//      mav.addObject("message", "Username or Password is wrong!!");
//    }

    return mav;
  }

}
