package dev.guru.PortfolioWebsite.controller;

import dev.guru.PortfolioWebsite.model.User;
import dev.guru.PortfolioWebsite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping({"/","/home"})
    public String index(Model model) {
        User user = userService.getUser(Long.parseLong("1")).orElse(null);
        model.addAttribute("user", user);
        return "index";
    }

}
