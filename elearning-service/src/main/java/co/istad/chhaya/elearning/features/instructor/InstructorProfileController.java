package co.istad.chhaya.elearning.features.instructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/instructor-profiles")
public class InstructorProfileController {

    @PostMapping
    public void postProfile() {

    }
}
