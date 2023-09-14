package vp.businesscase.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/shadyplace")
public class RegisterController {


    @RequestMapping("/register")
    public ModelAndView register(){
        ModelAndView mv = new ModelAndView("shadyplace/register");

        return mv;
    }

}
