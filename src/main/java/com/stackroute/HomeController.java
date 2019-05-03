package com.stackroute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
@PostMapping("/save")
    public ModelAndView getHello(HttpServletRequest request){
        String str= request.getParameter("t1");

    ModelAndView mv = new ModelAndView("display");
    mv.addObject("request",str);
    return mv;
    }
}
