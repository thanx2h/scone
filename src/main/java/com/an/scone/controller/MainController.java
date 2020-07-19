package com.an.scone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main(){
        return "index";
    }
}

//@Controller
//public class MainController {
//    @RequestMapping("/main")
//    public String main(HttpServletRequest request, HttpServletResponse response){
//        request.setAttribute("message", "HelloSpringBoot");
//        return "index";
//    }
//}