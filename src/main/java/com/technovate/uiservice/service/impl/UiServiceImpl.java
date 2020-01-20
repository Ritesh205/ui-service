package com.technovate.uiservice.service.impl;

import com.technovate.uiservice.models.College;
import com.technovate.uiservice.models.User;
import com.technovate.uiservice.repositories.CollegeRepository;
import com.technovate.uiservice.repositories.CourseRepository;
import com.technovate.uiservice.repositories.UserRepository;
import com.technovate.uiservice.service.UiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@Transactional
public class UiServiceImpl implements UiService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private CollegeRepository collegeRepository;

    @Override
    public String verify(String name) {
        return "HELLO "+name+" FROM UI-SERVICE";
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(int userId) {
        if(userRepository.existsById(userId)) {
            return userRepository.findById(userId).get();
        } else {
            return null;
        }
    }

    @Override
    public boolean validateLogin(User user) {


        User localUser = userRepository.findByEmail(user.getEmail());

        log.info("HERE INSIDE");

        return null != localUser
                && localUser.getEmail().equalsIgnoreCase(user.getEmail())
                && localUser.getPassword().equalsIgnoreCase(user.getPassword());

    }

    @Override
    public College getCollegeDetails(int collegeId) {

        return collegeRepository.findById(collegeId).get();
    }


}
