package spring.example.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.example.petclinic.domain.User;

public interface UserRepository extends CrudRepository<User,Long> {

}
