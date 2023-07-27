package spring.dao;

import spring.entity.Student;

public interface StudentDAO {
    void save(Student student);
    Student findById(Integer id);
}
