package in.sagar.springwebservicerestapicrud.controller;

import in.sagar.springwebservicerestapicrud.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import in.sagar.springwebservicerestapicrud.service.StudentService;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService stdSerivce;


    @PostMapping("/student")
    public Student addstdDetails(@RequestBody Student std){
        return stdSerivce.addstdDetailsService(std);
    }

    @GetMapping("/student")
    public List<Student> getAllStudentDetails(){
        return stdSerivce.getAllstdDetailsService();
    }

    @GetMapping("/student/{rollno}")
    public Student getStudentByRollno(@PathVariable  int rollno){
        return stdSerivce.getStudentByRollno(rollno);
    }

    @PutMapping("/student/{rollno}/{marks}")
    public Student updateStdDetails(@PathVariable int rollno, @PathVariable float marks){
        return stdSerivce.updatestdDetailsService(rollno,marks);

    }

    @DeleteMapping("/student/{rollno}")
    public String deleteStudent(@PathVariable int rollno){
        return stdSerivce.deletestdDetails(rollno);
    }

}
