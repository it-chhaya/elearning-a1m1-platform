package co.istad.chhaya.elearning;

import co.istad.chhaya.elearning.features.course.Course;
import co.istad.chhaya.elearning.features.course.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@EnableConfigurationProperties
@EnableJpaAuditing
@SpringBootApplication
public class ElearningA01M1Application {

    public static void main(String[] args) {
        SpringApplication.run(ElearningA01M1Application.class, args);
    }


}
