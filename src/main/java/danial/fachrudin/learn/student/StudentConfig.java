package danial.fachrudin.learn.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student danial =  new Student(
                    "Danial Fachrudin",
                    "danialfacrudin@gmail.com",
                    LocalDate.of(2005, Month.NOVEMBER, 23)
            );
            Student ega =  new Student(
                    "Ega Gofur",
                    "egagofur@gmail.com",
                    LocalDate.of(2005, Month.JUNE, 6)
            );

            Student bilal =  new Student(
                    "Bilal Ahmed",
                    "Bilal Ahmedr@gmail.com",
                    LocalDate.of(1993, Month.APRIL, 10)
            );

            repository.saveAll(
                    List.of(danial,ega,bilal)
            );
        };
    }
}
