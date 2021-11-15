package spring.example.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.example.petclinic.domain.*;
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
        u1.setCategory(Category.GENERAL);
        u1.setSubCategory(SubCategory.QUERY);
        u1.setPriority(Priority.HIGH);
        u1.setCaseManager(CaseManager.DARYL);
        u1.setNature(Nature.HEALTH);
        u1.setCaseReporter("Tanner");
        u1.setCaseStatus("Progress");
        userRepository.save(u1);

        User u2 = new User();
        u2.setCaseNo(124);
        u2.setBranch("Branch1");
        u2.setReportingMethod("Call");
        u2.setDate("21-3-2021");
        u2.setTime("11:35:02");
        u2.setCategory(Category.EMPLOYMENT);
        u2.setSubCategory(SubCategory.COMPLAINTS);
        u2.setPriority(Priority.LOW);
        u2.setCaseManager(CaseManager.JAMES);
        u2.setNature(Nature.PROPERTY);
        u2.setCaseReporter("Clinton");
        u2.setCaseStatus("Not Prepared");
        userRepository.save(u2);

        User u3 = new User();
        u3.setCaseNo(125);
        u3.setBranch("Branch2");
        u3.setReportingMethod("In Person");
        u3.setDate("02-7-2021");
        u3.setTime("01:04:02");
        u3.setCategory(Category.SECURITY);
        u3.setSubCategory(SubCategory.QUERY);
        u3.setPriority(Priority.MEDIUM);
        u3.setCaseManager(CaseManager.ALFONZO);
        u3.setNature(Nature.HEALTH);
        u3.setCaseReporter("Tanner");
        u3.setCaseStatus("Progress");
        userRepository.save(u3);

        User u4 = new User();
        u4.setCaseNo(125);
        u4.setBranch("Branch2");
        u4.setReportingMethod("Call");
        u4.setDate("21-3-2010");
        u4.setTime("11:35:00");
        u4.setCategory(Category.GRIEVANCE);
        u4.setSubCategory(SubCategory.COMPLAINTS);
        u4.setPriority(Priority.HIGH);
        u4.setCaseManager(CaseManager.TITUS);
        u4.setNature(Nature.TRANSPORT);
        u4.setCaseReporter("Clinton");
        u4.setCaseStatus("Progress");
        userRepository.save(u4);

        User u5 = new User();
        u5.setCaseNo(126);
        u5.setBranch("Branch3");
        u5.setReportingMethod("In Person");
        u5.setDate("21-2-2021");
        u5.setTime("12:35:02");
        u5.setCategory(Category.GENERAL);
        u5.setSubCategory(SubCategory.QUERY);
        u5.setPriority(Priority.HIGH);
        u5.setCaseManager(CaseManager.DARYL);
        u5.setNature(Nature.HEALTH);
        u5.setCaseReporter("Tanner");
        u5.setCaseStatus("Progress");
        userRepository.save(u1);

        User u6 = new User();
        u6.setCaseNo(127);
        u6.setBranch("Branch3");
        u6.setReportingMethod("In Person");
        u6.setDate("21-2-2021");
        u6.setTime("12:35:02");
        u6.setCategory(Category.GENERAL);
        u6.setSubCategory(SubCategory.QUERY);
        u6.setPriority(Priority.HIGH);
        u6.setCaseManager(CaseManager.DARYL);
        u6.setNature(Nature.HEALTH);
        u6.setCaseReporter("Tanner");
        u6.setCaseStatus("Progress");
        userRepository.save(u6);

        User u7 = new User();
        u7.setCaseNo(128);
        u7.setBranch("Branch1");
        u7.setReportingMethod("Call");
        u7.setDate("21-3-2021");
        u7.setTime("11:35:02");
        u7.setCategory(Category.EMPLOYMENT);
        u7.setSubCategory(SubCategory.COMPLAINTS);
        u7.setPriority(Priority.LOW);
        u7.setCaseManager(CaseManager.JAMES);
        u7.setNature(Nature.PROPERTY);
        u7.setCaseReporter("Clinton");
        u7.setCaseStatus("Not Prepared");
        userRepository.save(u7);

        User u8 = new User();
        u8.setCaseNo(129);
        u8.setBranch("Branch2");
        u8.setReportingMethod("In Person");
        u8.setDate("02-7-2021");
        u8.setTime("01:04:02");
        u8.setCategory(Category.SECURITY);
        u8.setSubCategory(SubCategory.QUERY);
        u8.setPriority(Priority.MEDIUM);
        u8.setCaseManager(CaseManager.ALFONZO);
        u8.setNature(Nature.HEALTH);
        u8.setCaseReporter("Tanner");
        u8.setCaseStatus("Progress");
        userRepository.save(u8);

        User u9 = new User();
        u9.setCaseNo(165);
        u9.setBranch("Branch2");
        u9.setReportingMethod("Call");
        u9.setDate("21-3-2010");
        u9.setTime("11:35:00");
        u9.setCategory(Category.GRIEVANCE);
        u9.setSubCategory(SubCategory.COMPLAINTS);
        u9.setPriority(Priority.HIGH);
        u9.setCaseManager(CaseManager.TITUS);
        u9.setNature(Nature.TRANSPORT);
        u9.setCaseReporter("Clinton");
        u9.setCaseStatus("Progress");
        userRepository.save(u9);

        User u10 = new User();
        u10.setCaseNo(136);
        u10.setBranch("Branch3");
        u10.setReportingMethod("In Person");
        u10.setDate("21-2-2021");
        u10.setTime("12:35:02");
        u10.setCategory(Category.GENERAL);
        u10.setSubCategory(SubCategory.QUERY);
        u10.setPriority(Priority.HIGH);
        u10.setCaseManager(CaseManager.DARYL);
        u10.setNature(Nature.HEALTH);
        u10.setCaseReporter("Tanner");
        u10.setCaseStatus("Progress");
        userRepository.save(u10);
        System.out.println("Count of users"+userRepository.count());


    }
}
