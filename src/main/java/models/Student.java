package models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity

@AllArgsConstructor
@ToString
@Setter
@Getter
@NoArgsConstructor

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String lastName;
    private String firstName;
    private Date birthDate;
    private boolean wantsNewsletter;

    @ManyToMany(mappedBy = "students")
    private List<Course> courses;

    public Student(String lastName, String firstName, Date birthDate, boolean wantsNewsletter) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.wantsNewsletter = wantsNewsletter;
    }
}
