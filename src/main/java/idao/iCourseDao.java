package idao;

import models.Course;

import java.util.List;

public interface iCourseDao {
    public Course find(Long id);

    public List<Course> listCoursesByLastName(String apellido);
}
