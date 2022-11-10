import dao.CourseDaoImpl;
import dao.CourseMaterialDaoImpl;
import dao.StudentDaoImpl;
import dao.TeacherDaoImpl;
import models.Course;
import models.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {

        TeacherDaoImpl tdi = new TeacherDaoImpl();
        //System.out.println(tdi.find(1L));
        //System.out.println(tdi.create(new Teacher( "Pedro", "Picapiedra")));
        //Teacher t = new Teacher();
        //t = tdi.find(1L);
        //t.setFirstName("Manolo");
        //System.out.println(tdi.update(t));*/
        //tdi.delete(t);

        CourseDaoImpl cdi = new CourseDaoImpl();
        //System.out.println(cdi.find(5L));
        //System.out.println(cdi.create(new Course(new TeacherDaoImpl().find(2L))));
        Course c = new Course();
        //c = cdi.find(2L);
        //System.out.println(cdi.update(c));
        //System.out.println(cdi.find(5L));

        c.setTitle("p");
        c.setTeacher(tdi.find(1L));


        CourseMaterialDaoImpl cmdi = new CourseMaterialDaoImpl();
        //System.out.println(cmdi.find(1L));
        //cmdi.create(new CourseMaterial(null,"si",cdi.find(5L)));
        //cmdi.delete(cmdi.find(1L));
        c.setMaterial(cmdi.find(1L));

        StudentDaoImpl sdi = new StudentDaoImpl();
        Student s = new Student("Manolo", "Perez", new Date(2000, 3, 4), true);
        System.out.println(sdi.create(s));

        List<Student> students = new ArrayList<>();
        students.add(sdi.find(1L));
        students.add(sdi.find(2L));
        c.setStudents(students);

        cdi.create(c);
        System.out.println(cdi.find(1L));
        System.out.println(cdi.listCoursesByLastName("picapiedra"));


    }
}
