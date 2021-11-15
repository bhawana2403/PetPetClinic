package spring.example.petclinic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.example.petclinic.domain.User;
import spring.example.petclinic.repositories.UserRepository;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> findByKeyword(String keyword){
        return userRepository.findByKeyword(keyword);
    }
    public void save(User user){
        userRepository.save(user);
    }
    public Iterable<User> getUsers(){
        return userRepository.findAll();
    }
}
