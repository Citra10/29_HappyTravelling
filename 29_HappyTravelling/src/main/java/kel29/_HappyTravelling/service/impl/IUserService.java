package kel29._HappyTravelling.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kel29._HappyTravelling.model.User;
import kel29._HappyTravelling.repo.UserRepository;
import kel29._HappyTravelling.service.UserService;

@Service
public class IUserService implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public Boolean existByuser(String username) {
        return userRepository.existsByUsername(username);
    }

    @Override
    public Boolean isSuccessLogin(String username, String password) {
        return userRepository.existsByUsernameAndPassword(username,password);
    }

    @Override
    public User findUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username,password);
    }
}
