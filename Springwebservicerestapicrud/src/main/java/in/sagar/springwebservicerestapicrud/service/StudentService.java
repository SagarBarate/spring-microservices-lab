package in.sagar.springwebservicerestapicrud.service;

import in.sagar.springwebservicerestapicrud.entity.Student;

import java.util.List;

public interface StudentService {

    public Student addstdDetailsService(Student std);
    public List<Student> getAllstdDetailsService();
    public Student getStudentByRollno(int rollno);
    public Student updatestdDetailsService(int rollno, float marks);
    public String deletestdDetails(int rollno);



}
