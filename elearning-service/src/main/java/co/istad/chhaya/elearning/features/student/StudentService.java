package co.istad.chhaya.elearning.features.student;

import co.istad.chhaya.elearning.features.student.dto.StudentProfileResponse;
import co.istad.chhaya.elearning.features.student.dto.UpdateStudentProfileRequest;

public interface StudentService {

    StudentProfileResponse me();

    StudentProfileResponse updateProfile(UpdateStudentProfileRequest updateStudentProfileRequest);
}
