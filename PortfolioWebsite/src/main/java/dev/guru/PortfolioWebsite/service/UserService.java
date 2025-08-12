package dev.guru.PortfolioWebsite.service;

import dev.guru.PortfolioWebsite.model.User;
import dev.guru.PortfolioWebsite.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepo userRepo;

    public UserService() {

    }

    @Autowired
    public void setUserRepo(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public UserRepo getUserRepo() {
        return userRepo;
    }

    public Optional<User> getUser(Long id) {
        return userRepo.findById(id);
    }
}
