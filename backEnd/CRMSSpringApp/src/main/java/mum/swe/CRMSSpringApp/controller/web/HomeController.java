package mum.swe.CRMSSpringApp.controller.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value="/home", method = RequestMethod.GET)
    //"home/index"
    public String home(){

        return "home/index";
    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String login(){
        return "home/login";
    }
}

