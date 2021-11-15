package spring.example.petclinic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.example.petclinic.domain.*;
import spring.example.petclinic.services.UserService;

@Controller
public class UserController {
    //private final UserRepository userRepository;
    @Autowired private UserService userService;

    @RequestMapping("/users")
    public String getUsers(Model model,String keyword){
        if(keyword != null){
            model.addAttribute("users",userService.findByKeyword(keyword));
        }
        else {
            model.addAttribute("users", userService.getUsers());
        }
        model.addAttribute("category", Category.values());
        model.addAttribute("subCategory", SubCategory.values());
        model.addAttribute("nature", Nature.values());
        model.addAttribute("priority", Priority.values());
        model.addAttribute("caseManager", CaseManager.values());
        return "users/list";
    }


}