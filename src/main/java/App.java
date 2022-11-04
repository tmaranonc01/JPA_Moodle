import dao.CourseDaoImpl;
import dao.CourseMaterialDaoImpl;
import dao.TeacherDaoImpl;
import models.Course;
import models.CourseMaterial;
import models.Teacher;

public class App {
    public static void main(String[] args) {
        TeacherDaoImpl tdi= new TeacherDaoImpl();
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
        //Course c = new Course();
        //c = cdi.find(2L);
        //System.out.println(cdi.update(c));
        //System.out.println(cdi.find(5L));

        CourseMaterialDaoImpl cmdi = new CourseMaterialDaoImpl();
        //System.out.println(cmdi.find(1L));
        //cmdi.create(new CourseMaterial(null,"si",cdi.find(5L)));
        //cmdi.delete(cmdi.find(1L));



    }
}
