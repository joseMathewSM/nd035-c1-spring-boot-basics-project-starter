package com.udacity.jwdnd.course1.cloudstorage.controller;

import com.udacity.jwdnd.course1.cloudstorage.model.User;
import com.udacity.jwdnd.course1.cloudstorage.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    private UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String loginView(){
        return  "login";
    }

    @PostMapping
    public String loginUser(User user, Model model){
        String errorMsg = null;
        boolean validUser = false;

        if(!userService.isUsernameAvailable(user.getUsername())){
            validUser = userService.authenticateUser(user);
        }else{
            errorMsg = "User not present";
        }

        if(validUser){
            model.addAttribute("loginSuccess",true);
            return "home";
        }else{
            model.addAttribute("loginError", errorMsg);
            System.out.println(errorMsg);
            return "login";
        }


    }

}
