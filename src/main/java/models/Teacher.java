package models;

import com.sun.istack.NotNull;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor

public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;

    @OneToMany(mappedBy = "teacher", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Course> courses;

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Teacher( String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
