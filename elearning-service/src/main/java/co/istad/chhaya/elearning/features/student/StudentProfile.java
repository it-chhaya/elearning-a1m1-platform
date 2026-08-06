package co.istad.chhaya.elearning.features.student;

import co.istad.chhaya.elearning.config.auditing.BasedEntity;
import co.istad.chhaya.elearning.features.enrollment.Enrollment;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "student_profiles")
public class StudentProfile extends BasedEntity {
    @Id
    private String userId;

    private String profilePicture;
    private String university;
    private String major;
    private String phoneNumber;
    private String githubLink;
    private String facebookLink;

    @OneToMany(mappedBy = "studentProfile")
    private List<Enrollment> enrollments;
}
