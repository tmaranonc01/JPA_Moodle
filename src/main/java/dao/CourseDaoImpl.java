package dao;

import idao.iCourseDao;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import models.Course;

import java.util.List;

public class CourseDaoImpl extends Dao<Course, Long> implements iCourseDao {
    @Override
    public Course find(Long id){
        Course course=(Course) em.find(Course.class,id);
        return course;
    }

    @Override
    public List<Course> listCoursesByLastName(String apellido) {

        EntityTransaction entityTransaction= em.getTransaction();
        entityTransaction.begin();
        String query= "select c from Course c join Teacher t on c.teacher.id = t.id and t.lastName like :lastname";
        Query query1=em.createQuery(query);
        query1.setParameter("lastname",apellido);
        List <Course> courses= query1.getResultList();
        return courses;
    }





}
