package models;

import com.sun.istack.NotNull;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity

@AllArgsConstructor
@ToString
@Setter
@Getter
@NoArgsConstructor

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotNull
    private String title;

    @ManyToOne (optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "teacher_id", referencedColumnName = "id")
    private Teacher teacher;

    @OneToOne(mappedBy = "course", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private CourseMaterial material;

    @ManyToMany
    @JoinTable(
            name = "students_courses",
            joinColumns = @JoinColumn(name = "course_id", referencedColumnName
                    = "id"),
            inverseJoinColumns = @JoinColumn(name = "student_id",
                    referencedColumnName = "id")
    )
    private List<Student> students;


    public void addStudent(Student student) {
        this.students.add(student);
    }


    public Course(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public CourseMaterial getMaterial() {
        return material;
    }

    public void setMaterial(CourseMaterial material) {
        this.material = material;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", teacher=" + teacher +
                ", material=" + material +
                ", students=" + students +
                '}';
    }
}
