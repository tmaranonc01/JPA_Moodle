package dao;

import idao.iStudentDao;
import models.Student;
import models.Teacher;

public class StudentDaoImpl extends Dao<Student, Long> implements iStudentDao {
    @Override
    public Student find(Long id) {
        Student student=(Student) em.find(Student.class,id);
        return student;
    }

}
