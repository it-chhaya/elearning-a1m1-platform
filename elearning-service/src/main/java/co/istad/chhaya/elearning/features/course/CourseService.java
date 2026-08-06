package co.istad.chhaya.elearning.features.course;

import co.istad.chhaya.elearning.features.course.dto.CourseResponse;
import co.istad.chhaya.elearning.features.course.dto.CreateCourseRequest;
import org.springframework.security.oauth2.jwt.Jwt;

public interface CourseService {

    // Create a new course
    CourseResponse createCourse(CreateCourseRequest createCourseRequest);

}
