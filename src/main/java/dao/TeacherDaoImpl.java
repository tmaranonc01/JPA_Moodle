package dao;

import idao.iTeacherDao;
import models.Teacher;

public class TeacherDaoImpl extends Dao<Teacher, Long> implements iTeacherDao {
    @Override
    public Teacher find(Long id) {
        Teacher teacher=(Teacher) em.find(Teacher.class,id);
        return teacher;
    }

}
