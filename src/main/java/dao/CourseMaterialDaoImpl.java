package dao;

import idao.iCourseMaterialDao;
import models.Course;
import models.CourseMaterial;

public class CourseMaterialDaoImpl extends Dao<CourseMaterial, Long> implements iCourseMaterialDao {
    @Override
    public CourseMaterial find(Long id) {
        CourseMaterial cm = (CourseMaterial) em.find(CourseMaterial.class, id);
        return cm;
    }
}
