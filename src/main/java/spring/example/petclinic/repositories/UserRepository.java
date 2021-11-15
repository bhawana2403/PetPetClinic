package spring.example.petclinic.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import spring.example.petclinic.domain.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long> {
    @Query(value = "select * from User e where e.case_No like %:keyword% or e.branch like %:keyword% or e.Case_Manager like %:keyword% or e.Case_Reporter like %:keyword% or e.case_Status like %:keyword% or e.category like %:keyword% or e.date like %:keyword% or e.nature like %:keyword% or e.priority like %:keyword% or e.reporting_method like %:keyword% or e.sub_category like %:keyword% or e.time like %:keyword%",nativeQuery = true)
    public List<User> findByKeyword(@Param("keyword") String keyword);

}
