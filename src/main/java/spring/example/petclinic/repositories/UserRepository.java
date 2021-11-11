package spring.example.petclinic.repositories;

import spring.example.petclinic.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

}
