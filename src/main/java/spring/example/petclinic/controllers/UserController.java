package spring.example.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.example.petclinic.domain.*;
import spring.example.petclinic.repositories.UserRepository;
import org.springframework.ui.Model;

@Controller
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @RequestMapping("/users")
    public String getUsers(Model model){
        model.addAttribute("users",userRepository.findAll());
        model.addAttribute("category", Category.values());
        model.addAttribute("category", SubCategory.values());
        model.addAttribute("category", Nature.values());
        model.addAttribute("category", Priority.values());
        model.addAttribute("category", CaseManager.values());
        return "users/list";
    }
}