package co.istad.chhaya.elearning.features.course;

import co.istad.chhaya.elearning.features.course.dto.CourseResponse;
import co.istad.chhaya.elearning.features.course.dto.CreateCourseRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourseMapper {

    Course mapCreateCourseRequestToCourse(CreateCourseRequest createCourseRequest);

    CourseResponse mapCourseToCourseResponse(Course course);

}
