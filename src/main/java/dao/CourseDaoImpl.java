package dao;

import idao.iCourseDao;
import models.Course;

public class CourseDaoImpl extends Dao<Course, Long> implements iCourseDao {
    @Override
    public Course find(Long id){
        Course course=(Course) em.find(Course.class,id);
        return course;
    }


}
