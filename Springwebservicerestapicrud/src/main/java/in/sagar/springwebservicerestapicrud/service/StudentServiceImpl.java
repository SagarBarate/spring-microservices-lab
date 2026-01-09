package in.sagar.springwebservicerestapicrud.service;

import in.sagar.springwebservicerestapicrud.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.sagar.springwebservicerestapicrud.repository.StudentRepository;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository stdRepository;

    @Override
    public Student addstdDetailsService(Student std) {
        return stdRepository.save(std);
    }

    @Override
    public List<Student> getAllstdDetailsService() {
        return stdRepository.findAll();
    }

    @Override
    public Student getStudentByRollno(int rollno) {
        return stdRepository.findByRollno(rollno);
    }

    @Override
    public Student updatestdDetailsService(int rollno, float marks) {
        Student std = stdRepository.findByRollno(rollno);
        std.setMarks(marks);
        return stdRepository.save(std);
    }

    @Override
    public String deletestdDetails(int rollno) {
        try{
            stdRepository.deleteByRollno(rollno);
            return "Success";
        }
        catch(Exception e){
            e.printStackTrace();
            return "fail";
        }
    }


}
