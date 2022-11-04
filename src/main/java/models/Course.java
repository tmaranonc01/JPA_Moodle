package models;

import jakarta.persistence.*;
import lombok.*;

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

    @ManyToOne (optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "teacher_id", referencedColumnName = "id")
    private Teacher teacher;

    @OneToOne(mappedBy = "course", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private CourseMaterial material;

    public Course(Teacher teacher) {
        this.teacher = teacher;
    }
}
