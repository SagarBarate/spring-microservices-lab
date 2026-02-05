package in.sagar.springbootauth2.controller;

import ch.qos.logback.core.model.Model;
import in.sagar.springbootauth2.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import in.sagar.springbootauth2.repository.StudentRepository;


@Controller
public class studentcontroller {

    @Autowired
    private StudentRepository stdRepository;

    @GetMapping("/")
    public String openIndexpage(){
        return "index";
    }

    @GetMapping("/register")
    public String openregisterpage(Model model){
        model.addText("student");
        return "register";
    }

    @PostMapping("/regForm")
    public String submitregisterFomr(@ModelAttribute Student std){

        try{
            System.out.print("Success");
            stdRepository.save(std);
        }
        catch ( Exception e){
            System.out.print("Failed");
            e.printStackTrace();
        }
        return "register";

    }
}
