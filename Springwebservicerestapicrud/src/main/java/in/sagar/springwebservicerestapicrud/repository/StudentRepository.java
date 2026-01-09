package in.sagar.springwebservicerestapicrud.repository;

import in.sagar.springwebservicerestapicrud.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    public Student findByRollno(int rollno);

    @Modifying
    @Transactional
    int deleteByRollno(int rollno);
}
