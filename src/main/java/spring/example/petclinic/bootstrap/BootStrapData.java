package spring.example.petclinic.bootstrap;

import spring.example.petclinic.domain.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.example.petclinic.repositories.UserRepository;


@Component
public class BootStrapData implements CommandLineRunner {
    private final UserRepository userRepository;

    public BootStrapData(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in bootstrap");
        User u1 = new User();
        u1.setCaseNo(123);
        u1.setBranch("Branch3");
        u1.setReportingMethod("In Person");
        u1.setDate("21-2-2021");
        u1.setTime("12:35:02");
        u1.setCategory("Grievance");
        u1.setSubCategory("Query");
        u1.setPriority("Medium");
        u1.setCaseManager("James");
        u1.setNature("Health");
        u1.setCaseReporter("Tanner");
        u1.setCaseStatus("Progress");
        userRepository.save(u1);

        User u2 = new User();
        u2.setCaseNo(124);
        u2.setBranch("Branch1");
        u2.setReportingMethod("Call");
        u2.setDate("21-3-2021");
        u2.setTime("11:35:02");
        u2.setCategory("Employment");
        u2.setSubCategory("Query");
        u2.setPriority("High");
        u2.setCaseManager("Daryl");
        u2.setNature("Property");
        u2.setCaseReporter("Clinton");
        u2.setCaseStatus("Not Prepared");
        userRepository.save(u2);
        System.out.println("Count of users"+userRepository.count());

    }
}