package co.istad.chhaya.elearning.features.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentProfileRepository
extends JpaRepository<StudentProfile, String> {
}
