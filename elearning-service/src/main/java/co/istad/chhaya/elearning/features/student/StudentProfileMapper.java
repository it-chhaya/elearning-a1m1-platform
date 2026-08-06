package co.istad.chhaya.elearning.features.student;

import co.istad.chhaya.elearning.features.student.dto.StudentProfileResponse;
import co.istad.chhaya.elearning.features.student.dto.UpdateStudentProfileRequest;
import org.keycloak.representations.idm.UserRepresentation;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public abstract class StudentProfileMapper {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    abstract void mapUpdateStudentProfileRequestToStudentProfile(
            UpdateStudentProfileRequest updateStudentProfileRequest,
            @MappingTarget StudentProfile studentProfile
    );

    public StudentProfileResponse toStudentProfileResponse(
            StudentProfile studentProfile,
            UserRepresentation representation
    ) {
        return StudentProfileResponse.builder()
                .userId(representation.getId())
                .firstName(representation.getFirstName())
                .lastName(representation.getLastName())
                .email(representation.getEmail())
                .gender(representation.getAttributes().get("gender").getFirst())
                .biography(representation.getAttributes().get("biography").getFirst())
                .profilePicture(studentProfile.getProfilePicture())
                .facebookLink(studentProfile.getFacebookLink())
                .githubLink(studentProfile.getGithubLink())
                .phoneNumber(studentProfile.getPhoneNumber())
                .university(studentProfile.getUniversity())
                .major(studentProfile.getMajor())
                .build();
    }

}
