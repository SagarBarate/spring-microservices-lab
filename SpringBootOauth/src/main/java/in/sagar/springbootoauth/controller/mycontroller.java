package in.sagar.springbootoauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mycontroller {

    @GetMapping("/")
    public String OpenIndex(){

        return "index";
    }

    @GetMapping("/login")
    public String Loginpage(){
        return "login";
    }

}
